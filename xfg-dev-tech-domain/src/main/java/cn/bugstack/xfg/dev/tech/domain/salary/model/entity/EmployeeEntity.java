package cn.bugstack.xfg.dev.tech.domain.salary.model.entity;

import cn.bugstack.xfg.dev.tech.domain.salary.model.valobj.EmployeePostVO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 雇员实体对象
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeEntity {

    /** 雇员级别 */
    private EmployeePostVO employeeLevel;
    /** 雇员岗位Title */
    private EmployeePostVO employeeTitle;

}
