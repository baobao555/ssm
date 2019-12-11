package com.baobao.controller;

import com.baobao.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author baobao
 * @create 2019-12-01 10:56
 * @description
 */

@Controller
@RequestMapping("/departmentController")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @RequestMapping("/test")
    public String test(){
        System.out.println("test");
        return "success";
    }

    @RequestMapping("/selectAll")
    public String selectAll(){
        System.out.println(departmentService.selectAll());
        return "success";
    }


}
