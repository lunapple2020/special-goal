package com.example.springboottest1.service;

import com.example.springboottest1.dao.userMapper;
import com.example.springboottest1.entity.user;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.mockito.Mockito.when;
import static org.testng.Assert.*;

public class UserLoginServiceTest {
    @InjectMocks
    private UserLoginService userLoginService;
    @Mock
    private userMapper usermapper;
    @BeforeClass
    public void setUp(){
        MockitoAnnotations.initMocks(this);
    }
    @Test
    public void testUserLogin() {
        user user1 = new user();
        user1.setUsername("zhenguo.dong");
        user1.setPassword("123456");
        when(usermapper.userlogin(user1.getUsername(),user1.getPassword())).thenReturn(user1);
 //       Assert.assertNotNull(user,"user is null");
    }
    @Test
    public void testUserLogin1() {
        String username = "zhenguo.dong";
        String password = "1234567";
        user user = usermapper.userlogin(username,password);
        Assert.assertNotNull(user,"user is null");
    }
}