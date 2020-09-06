package com.wangyuxuan.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author wangyuxuan
 * @date 2020/9/6 9:57 下午
 * @description
 */

@Service
@Profile("pro")
public class OtherServiceImpl implements SomeService {
    @Override
    public String send() {
        return "调用【生产】环境下的send()实现";
    }
}
