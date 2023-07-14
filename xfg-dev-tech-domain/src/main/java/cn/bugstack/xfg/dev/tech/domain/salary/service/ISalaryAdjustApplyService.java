package cn.bugstack.xfg.dev.tech.domain.salary.service;

import cn.bugstack.xfg.dev.tech.domain.salary.model.aggreate.AdjustSalaryApplyOrderAggregate;


public interface ISalaryAdjustApplyService {

    String execSalaryAdjust(AdjustSalaryApplyOrderAggregate adjustSalaryApplyOrderAggregate);

}
