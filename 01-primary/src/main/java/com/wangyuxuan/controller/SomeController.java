package com.wangyuxuan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangyuxuan
 * @date 2020/8/31 9:14 下午
 * @description
 */

@RestController
public class SomeController {

    @GetMapping("/some")
    public String someHandler() {
        return "hello spring boot world";
    }

//    @GetMapping("/find/{name}")
//    public String findHandler(@PathVariable("name") String name) {
//        return "查询指定的学生：" + name;
//    }
}
