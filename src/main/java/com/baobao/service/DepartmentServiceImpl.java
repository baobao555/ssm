package com.baobao.service;

import com.baobao.dao.DepartmentDao;
import com.baobao.domain.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author baobao
 * @create 2019-12-01 10:30
 * @description
 */
@Service("departmentService")
public class DepartmentServiceImpl implements DepartmentService {
    public void setDepartmentDao(DepartmentDao departmentDao) {
        this.departmentDao = departmentDao;    }

    @Autowired
    private DepartmentDao departmentDao;

    @Override
    public List<Department> selectAll() {
        return departmentDao.selectAll();
    }

    @Override
    public Department selectById(int id) {
        return departmentDao.selectById(id);
    }

    @Override
    public void save(Department department) {
        departmentDao.save(department);
    }
}
