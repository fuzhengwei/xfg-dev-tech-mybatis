package cn.bugstack.xfg.dev.tech.domain.salary.repository;

import cn.bugstack.xfg.dev.tech.domain.salary.model.aggreate.AdjustSalaryApplyOrderAggregate;

public interface ISalaryAdjustRepository {

    String adjustSalary(AdjustSalaryApplyOrderAggregate adjustSalaryApplyOrderAggregate);

}
