package cn.bugstack.xfg.dev.tech.domain.salary.service;

import cn.bugstack.xfg.dev.tech.domain.salary.model.aggreate.AdjustSalaryApplyOrderAggregate;
import cn.bugstack.xfg.dev.tech.domain.salary.repository.ISalaryAdjustRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SalaryAdjustApplyService implements ISalaryAdjustApplyService {

    @Resource
    private ISalaryAdjustRepository salaryAdjustRepository;

    @Override
    public String execSalaryAdjust(AdjustSalaryApplyOrderAggregate adjustSalaryApplyOrderAggregate) {
        return salaryAdjustRepository.adjustSalary(adjustSalaryApplyOrderAggregate);
    }

}
