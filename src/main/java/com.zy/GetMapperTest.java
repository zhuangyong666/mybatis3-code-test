package com.zy;

import com.zy.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;

/**
 * @author zhuangy
 * @version V1.0
 * @Title: GetMapperTest
 * @Package com.zy
 * @Description: (用一句话描述该文件做什么)
 * @date 2021/1/28 0028 15:46
 **/

public class GetMapperTest {
    public static void main(String[] args) {
        Reader systemResourceAsStream = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(systemResourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
    }
}
