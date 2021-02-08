package com.zy;

import com.sun.javaws.security.Resource;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

/**
 * @author zhuangy
 * @version V1.0
 * @Title: SqlSessionTest
 * @Package com.zy
 * @Description: (用一句话描述该文件做什么)
 * @date 2021/1/26 0026 15:48
 **/

public class SqlSessionTest {
    public static void main(String[] args) throws IOException {
        Reader systemResourceAsStream = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(systemResourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        System.out.println(sqlSession);
    }
}
