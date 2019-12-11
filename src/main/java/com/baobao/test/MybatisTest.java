package com.baobao.test;

import com.baobao.dao.DepartmentDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;


/**
 * @author baobao
 * @create 2019-12-01 11:24
 * @description
 */
public class MybatisTest {
    @Test
    public void myBatisTest() throws Exception{
        InputStream configFile = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(configFile);
        SqlSession sqlSession = factory.openSession();
        DepartmentDao departmentDao = sqlSession.getMapper(DepartmentDao.class);
        System.out.println(departmentDao.selectAll());
        sqlSession.commit();
        sqlSession.close();
        configFile.close();
    }
}
