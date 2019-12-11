package com.baobao.service;

import com.baobao.domain.Department;

import java.util.List;

/**
 * @author baobao
 * @create 2019-12-01 10:24
 * @description
 */
public interface DepartmentService {
    List<Department> selectAll();

    Department selectById(int id);

    void save(Department department);
}
