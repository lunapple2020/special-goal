package com.example.springboottest1.controller;

import com.example.springboottest1.basecase.BaseCaseTest;
import com.example.springboottest1.entity.user;
import com.example.springboottest1.service.UserLoginService;
import org.junit.Assert;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.mock.web.MockHttpServletRequest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

public class UserLoginControllerTest extends BaseCaseTest {
    @InjectMocks
    private UserLoginController userLoginController;
    @Mock
    private UserLoginService userLoginService;
    @BeforeClass
    public void setUp(){
        MockitoAnnotations.initMocks(this);
        super.setUp();
    }
    @Test
    public void testUserLogin() {
        user user1 = new user();
        user1.setUsername("zhenguo.dong");
        user1.setPassword("123456");
        user user2 = new user();
        request = new MockHttpServletRequest();
        when(userLoginService.userLogin(anyString(),anyString())).thenReturn(user1);
        String result = userLoginController.userLogin(anyString(),anyString(),request);
        Assert.assertEquals("index",result);
    }
    @Test
    public void testUserLogin1() {
        request = new MockHttpServletRequest();
        when(userLoginService.userLogin(anyString(),anyString())).thenReturn(null);
        String result = userLoginController.userLogin(anyString(),anyString(),request);
        Assert.assertEquals("loginError",result);
    }
}