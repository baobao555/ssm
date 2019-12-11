package com.baobao.dao;

import com.baobao.domain.Department;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author baobao
 * @create 2019-12-01 10:23
 * @description
 */
public interface DepartmentDao {
    @Select("select * from departments")
    @Results(id = "departmentMapping",value = {
            @Result(id = true,column = "department_id",property = "id"),
            @Result(column = "department_name",property = "name"),
            @Result(column = "manager_id",property = "managerId"),
            @Result(column = "location_id",property = "locationId")
    })
    List<Department> selectAll();

    @Select("select * from departments where department_id = #{id}")
    @ResultMap("departmentMapping")
    Department selectById(int id);

    @Insert("insert into departments(department_name,manager_id,location_id) values(#{name},#{managerId},#{locationId})")
    void save(Department department);
}
