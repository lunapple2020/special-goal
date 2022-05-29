package com.example.springboottest1.service;

import com.example.springboottest1.dao.userMapper;
import com.example.springboottest1.entity.user;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLoginService {
    private static final Logger logger = LoggerFactory.getLogger(UserLoginService.class);

    /**
     * 注入dao
     */
    @Autowired
    private userMapper usermapper;

    //用户登录
    public user userLogin(String username, String password){
        user user = usermapper.userlogin(username,password);
        logger.info("登陆的用户信息是：{}",user);
        logger.info("登陆的用户信息是：{}",user);
        return user;
    }

    //注册新用户
    public int adduser(String username,String password,int age){


        return usermapper.adduser(username,password,age);
        //return usermapper.adduser1(username,password,age);     //对应sql语句中的第二种注册方式
    }

}
