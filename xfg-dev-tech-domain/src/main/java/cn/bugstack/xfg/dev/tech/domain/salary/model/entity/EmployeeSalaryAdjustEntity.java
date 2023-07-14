package cn.bugstack.xfg.dev.tech.domain.salary.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * 调薪实体
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeSalaryAdjustEntity {

    /** 总额调薪 */
    private BigDecimal adjustTotalAmount;
    /** 基础调薪 */
    private BigDecimal adjustBaseAmount;
    /** 绩效调薪 */
    private BigDecimal adjustMeritAmount;

}
