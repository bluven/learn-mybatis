package com.github.bluven;

import com.github.bluven.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.session.SqlSession;

import java.io.InputStream;

/**
 * Created by bluven on 4/2/18
 */
public class Application {

    public static void main(String[] args) throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);

        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        
        sessionFactory.getConfiguration().getEnvironment().getDataSource().getConnection();
        SqlSession session = sessionFactory.openSession();
        
        UserMapper userMapper = session.getMapper(UserMapper.class);
    
        System.out.println(userMapper.count());
        System.out.println(userMapper.selectAll());
        
        session.close();
    }
}
