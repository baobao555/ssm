package com.baobao.test;

import com.baobao.service.DepartmentService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author baobao
 * @create 2019-12-01 10:32
 * @description
 */
public class SpringTest {
    @Test
    public void testSpring(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        DepartmentService departmentService = applicationContext.getBean("departmentService", DepartmentService.class);
        departmentService.selectAll();
        departmentService.selectById(1);
    }
}
