package cn.bugstack.xfg.dev.tech.infrastructure.dao;

import cn.bugstack.xfg.dev.tech.infrastructure.po.EmployeeSalaryAdjustPO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IEmployeeSalaryAdjustDAO {

    void insert(EmployeeSalaryAdjustPO employeeSalaryAdjustPO);

}
