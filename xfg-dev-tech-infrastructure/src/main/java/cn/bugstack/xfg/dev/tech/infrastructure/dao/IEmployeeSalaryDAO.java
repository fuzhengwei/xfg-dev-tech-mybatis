package cn.bugstack.xfg.dev.tech.infrastructure.dao;

import cn.bugstack.xfg.dev.tech.infrastructure.po.EmployeeSalaryPO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IEmployeeSalaryDAO {

    void insert(EmployeeSalaryPO employeeSalary);

    void insertList(List<EmployeeSalaryPO> list);

    void update(EmployeeSalaryPO employeeSalaryPO);

    EmployeeSalaryPO queryEmployeeSalaryByEmployNumber(String employNumber);

}
