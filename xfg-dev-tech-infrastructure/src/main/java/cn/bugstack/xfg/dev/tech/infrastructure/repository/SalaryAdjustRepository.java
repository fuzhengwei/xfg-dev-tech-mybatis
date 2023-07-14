package cn.bugstack.xfg.dev.tech.infrastructure.repository;

import cn.bugstack.xfg.dev.tech.domain.salary.model.aggreate.AdjustSalaryApplyOrderAggregate;
import cn.bugstack.xfg.dev.tech.domain.salary.model.entity.EmployeeEntity;
import cn.bugstack.xfg.dev.tech.domain.salary.model.entity.EmployeeSalaryAdjustEntity;
import cn.bugstack.xfg.dev.tech.domain.salary.repository.ISalaryAdjustRepository;
import cn.bugstack.xfg.dev.tech.infrastructure.dao.IEmployeeDAO;
import cn.bugstack.xfg.dev.tech.infrastructure.dao.IEmployeeSalaryAdjustDAO;
import cn.bugstack.xfg.dev.tech.infrastructure.dao.IEmployeeSalaryDAO;
import cn.bugstack.xfg.dev.tech.infrastructure.po.EmployeePO;
import cn.bugstack.xfg.dev.tech.infrastructure.po.EmployeeSalaryAdjustPO;
import cn.bugstack.xfg.dev.tech.infrastructure.po.EmployeeSalaryPO;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Repository
public class SalaryAdjustRepository implements ISalaryAdjustRepository {

    @Resource
    private IEmployeeDAO employeeDAO;
    @Resource
    private IEmployeeSalaryDAO employeeSalaryDAO;
    @Resource
    private IEmployeeSalaryAdjustDAO employeeSalaryAdjustDAO;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public String adjustSalary(AdjustSalaryApplyOrderAggregate adjustSalaryApplyOrderAggregate) {

        String employeeNumber = adjustSalaryApplyOrderAggregate.getEmployeeNumber();
        String orderId = adjustSalaryApplyOrderAggregate.getOrderId();
        EmployeeEntity employeeEntity = adjustSalaryApplyOrderAggregate.getEmployeeEntity();
        EmployeeSalaryAdjustEntity employeeSalaryAdjustEntity = adjustSalaryApplyOrderAggregate.getEmployeeSalaryAdjustEntity();

        EmployeePO employeePO = EmployeePO.builder()
                .employeeNumber(employeeNumber)
                .employeeLevel(employeeEntity.getEmployeeLevel().getCode())
                .employeeTitle(employeeEntity.getEmployeeTitle().getDesc()).build();

        // 更新岗位
        employeeDAO.update(employeePO);

        EmployeeSalaryPO employeeSalaryPO = EmployeeSalaryPO.builder()
                .employeeNumber(employeeNumber)
                .salaryTotalAmount(employeeSalaryAdjustEntity.getAdjustTotalAmount())
                .salaryMeritAmount(employeeSalaryAdjustEntity.getAdjustMeritAmount())
                .salaryBaseAmount(employeeSalaryAdjustEntity.getAdjustBaseAmount())
                .build();

        // 更新薪酬
        employeeSalaryDAO.update(employeeSalaryPO);

        EmployeeSalaryAdjustPO employeeSalaryAdjustPO = EmployeeSalaryAdjustPO.builder()
                .employeeNumber(employeeNumber)
                .adjustOrderId(orderId)
                .adjustTotalAmount(employeeSalaryAdjustEntity.getAdjustTotalAmount())
                .adjustBaseAmount(employeeSalaryAdjustEntity.getAdjustMeritAmount())
                .adjustMeritAmount(employeeSalaryAdjustEntity.getAdjustBaseAmount())
                .build();

        // 写入流水
        employeeSalaryAdjustDAO.insert(employeeSalaryAdjustPO);

        return orderId;
    }

}
