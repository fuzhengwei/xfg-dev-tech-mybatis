package cn.bugstack.xfg.dev.tech.domain.salary.repository;

import cn.bugstack.xfg.dev.tech.domain.salary.model.aggregate.AdjustSalaryApplyOrderAggregate;

public interface ISalaryAdjustRepository {

    String adjustSalary(AdjustSalaryApplyOrderAggregate adjustSalaryApplyOrderAggregate);

}
