package cn.bugstack.xfg.dev.tech.test.domain;

import cn.bugstack.xfg.dev.tech.domain.employee.model.entity.EmployeeInfoEntity;
import cn.bugstack.xfg.dev.tech.domain.employee.service.IEmployeeService;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class IEmployeeServiceTest {

    @Resource
    private IEmployeeService employeeService;

    @Test
    public void test_queryEmployInfo() {
        EmployeeInfoEntity employeeInfoEntity = employeeService.queryEmployInfo("10000001");
        log.info("测试结果：{}", JSON.toJSONString(employeeInfoEntity));
    }

}
