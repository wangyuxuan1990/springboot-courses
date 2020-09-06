package com.wangyuxuan.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author wangyuxuan
 * @date 2020/9/6 9:57 下午
 * @description
 */

@Service
@Profile("dev")
public class SomeServiceImpl implements SomeService {
    @Override
    public String send() {
        return "调用【开发】环境下的send()实现";
    }
}
