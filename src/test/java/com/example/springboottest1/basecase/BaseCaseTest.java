package com.example.springboottest1.basecase;

import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BaseCaseTest {
    public HttpServletRequest request;
    public HttpServletResponse response;

    public void setUp(){
        request = new MockHttpServletRequest();
        response = new MockHttpServletResponse();
    }
}
