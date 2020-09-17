package com.carsonlius.entries;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestSql {
    @Test
    public void testMyBaits() throws IOException {
        System.out.println("hello world");
        String config = "mybaits.xml";
//
//        // 读文件
        InputStream inputStream = Resources.getResourceAsStream(config);
//
//        // 创建sqlSessionFactoryBuilder
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
//
//        // 创建SqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
//
//        // 获取sqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
//
//        // 执行执行语句的标示
        String flag = "com.carsonlius.dao.SystemLogDetailsDao.selectSystemLogDetails";
//
//        // 执行
        List<SystemLogDetails> systemLogDetails = sqlSession.selectList(flag);



        for (SystemLogDetails systemLogDetail : systemLogDetails) {
            System.out.println(systemLogDetail);
        }

        sqlSession.close();
    }
}
