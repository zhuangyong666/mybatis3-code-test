package com.zy;

import org.apache.ibatis.reflection.factory.DefaultObjectFactory;
import org.apache.ibatis.reflection.factory.ObjectFactory;

import java.util.List;

/**
 * @author zhuangy
 * @version V1.0
 * @Title: Test
 * @Package com.zy
 * @Description: (用一句话描述该文件做什么)
 * @date 2021/1/15 0015 17:13
 **/

public class ObjectFactoryTest {
    public static void main(String[] args) {
        ObjectFactory objectFactory = new DefaultObjectFactory();
        List list = objectFactory.create(List.class);
        System.out.println(list);
    }
}
