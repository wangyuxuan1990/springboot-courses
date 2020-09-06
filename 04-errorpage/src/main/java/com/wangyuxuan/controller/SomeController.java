package com.wangyuxuan.controller;

import com.wangyuxuan.service.SomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangyuxuan
 * @date 2020/8/31 9:14 下午
 * @description
 */

@RestController
public class SomeController {

    @Autowired
    private SomeService service;

    @GetMapping("/some")
    public String someHandler() {
        int i = 3 / 0;
        return service.hello();
    }
}
