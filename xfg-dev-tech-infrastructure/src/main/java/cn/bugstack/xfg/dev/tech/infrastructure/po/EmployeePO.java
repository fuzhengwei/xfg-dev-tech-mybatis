package cn.bugstack.xfg.dev.tech.infrastructure.po;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 雇员表
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmployeePO {

    /** 自增ID */
    private Long id;
    /** 雇员编号 */
    private String employeeNumber;
    /** 雇员姓名 */
    private String employeeName;
    /** 雇员级别 */
    private String employeeLevel;
    /** 雇员岗位Title */
    private String employeeTitle;
    /** 创建时间 */
    private Date createTime;
    /** 更新时间 */
    private Date updateTime;

}
