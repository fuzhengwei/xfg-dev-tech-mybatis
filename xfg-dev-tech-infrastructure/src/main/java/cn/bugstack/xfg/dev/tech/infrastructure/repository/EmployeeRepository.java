package cn.bugstack.xfg.dev.tech.infrastructure.repository;

import cn.bugstack.xfg.dev.tech.domain.employee.model.entity.EmployeeInfoEntity;
import cn.bugstack.xfg.dev.tech.domain.employee.repository.IEmployeeRepository;
import cn.bugstack.xfg.dev.tech.infrastructure.dao.IEmployeeDAO;
import cn.bugstack.xfg.dev.tech.infrastructure.dao.IEmployeeSalaryAdjustDAO;
import cn.bugstack.xfg.dev.tech.infrastructure.dao.IEmployeeSalaryDAO;
import cn.bugstack.xfg.dev.tech.infrastructure.po.EmployeePO;
import cn.bugstack.xfg.dev.tech.infrastructure.po.EmployeeSalaryPO;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class EmployeeRepository implements IEmployeeRepository {

    @Resource
    private IEmployeeDAO employeeDAO;
    @Resource
    private IEmployeeSalaryDAO employeeSalaryDAO;

    @Override
    public EmployeeInfoEntity queryEmployInfo(String employNumber) {
        // 查询雇员
        EmployeePO employeePO = employeeDAO.queryEmployeeByEmployNumber(employNumber);
        // 查询薪酬
        EmployeeSalaryPO employeeSalaryPO = employeeSalaryDAO.queryEmployeeSalaryByEmployNumber(employNumber);

        return EmployeeInfoEntity.builder()
                .employeeName(employeePO.getEmployeeName())
                .employeeLevel(employeePO.getEmployeeLevel())
                .employeeTitle(employeePO.getEmployeeTitle())
                .salaryTotalAmount(employeeSalaryPO.getSalaryTotalAmount())
                .salaryMeritAmount(employeeSalaryPO.getSalaryTotalAmount())
                .salaryBaseAmount(employeeSalaryPO.getSalaryTotalAmount())
                .build();
    }
}
