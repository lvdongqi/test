package com.jk.service;

import org.springframework.stereotype.Service;

/**
 * @author 吕东崎
 * @Title: TestServiceImpl
 * @ProjectName springboot-provider
 * @Description: TODO
 * @date 2018/8/715:40
 */
@Service("testService")
public class TestServiceImpl implements TestService{

    @Override
    public String sayHello() {
        return "hello dubbo";
    }
}
