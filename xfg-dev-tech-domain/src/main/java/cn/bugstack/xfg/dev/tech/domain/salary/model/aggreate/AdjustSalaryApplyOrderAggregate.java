package cn.bugstack.xfg.dev.tech.domain.salary.model.aggreate;

import cn.bugstack.xfg.dev.tech.domain.salary.model.entity.EmployeeEntity;
import cn.bugstack.xfg.dev.tech.domain.salary.model.entity.EmployeeSalaryAdjustEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 调薪受理单聚合对象
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AdjustSalaryApplyOrderAggregate {

    /** 雇员编号 */
    private String employeeNumber;
    /** 调薪单号 */
    private String orderId;
    /** 雇员实体 */
    private EmployeeEntity employeeEntity;
    /** 雇员实体 */
    private EmployeeSalaryAdjustEntity employeeSalaryAdjustEntity;

}
