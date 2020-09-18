package com.carsonlius.entries;

import com.carsonlius.utils.MyBaitsUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class TestSql {
    @Test
    public void testMyBaits() throws IOException {

//
//        // 获取sqlSession对象
        SqlSession sqlSession = MyBaitsUtils.getSqlSession();

        // 80808
        String flagInsert = "com.carsonlius.dao.SystemLogDetailsDao.insertSystemLogDetails";

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = format.format(new Date());
        System.out.println(date);
        SystemLogDetails systemLogDetails = new SystemLogDetails();
        systemLogDetails.setData("具体参数");
        systemLogDetails.setRemark("插入炒作");
        systemLogDetails.setCreated_at(date);
        systemLogDetails.setUpdated_at(date);
        systemLogDetails.setRequest_id("none" + date);

        int insertNumbers = sqlSession.insert(flagInsert, systemLogDetails);

        System.out.println( "insertNumbers=" + insertNumbers);
//
//        // 执行执行语句的标示
        String flagSelect = "com.carsonlius.dao.SystemLogDetailsDao.selectSystemLogDetails";
//
//        // 执行
        List<SystemLogDetails> systemLogDetails2 = sqlSession.selectList(flagSelect);



        for (SystemLogDetails systemLogDetail : systemLogDetails2) {
            System.out.println(systemLogDetail);
        }
        sqlSession.commit();
        sqlSession.close();
    }
}
