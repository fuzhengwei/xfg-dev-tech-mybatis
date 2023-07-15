package cn.bugstack.xfg.dev.tech.domain.employee.repository;

import cn.bugstack.xfg.dev.tech.domain.employee.model.entity.EmployeeInfoEntity;

public interface IEmployeeRepository {

    void insertEmployeeInfo(EmployeeInfoEntity employeeInfoEntity);

    EmployeeInfoEntity queryEmployInfo(String employNumber);

}
