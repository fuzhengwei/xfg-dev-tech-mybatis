package cn.bugstack.xfg.dev.tech.domain.employee.service;

import cn.bugstack.xfg.dev.tech.domain.employee.model.entity.EmployeeInfoEntity;

public interface IEmployeeService {

    void insertEmployInfo(EmployeeInfoEntity employeeInfoEntity);

    EmployeeInfoEntity queryEmployInfo(String employNumber);

}
