package com.wangyuxuan.service;

import org.springframework.stereotype.Service;

/**
 * @author wangyuxuan
 * @date 2020/9/6 9:57 下午
 * @description
 */

@Service
public class SomeServiceImpl implements SomeService {
    @Override
    public String hello() {
        return "Hello Hello Hello";
    }
}
