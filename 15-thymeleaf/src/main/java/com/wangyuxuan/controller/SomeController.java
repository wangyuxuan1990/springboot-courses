package com.wangyuxuan.controller;

import com.wangyuxuan.vo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wangyuxuan
 * @date 2020/9/13 9:39 下午
 * @description
 */
@Controller
public class SomeController {

    @RequestMapping("/test/index")
    public String indexHandler(Model model) {
        model.addAttribute("welcome", "Hello Thymeleaf World");
        model.addAttribute("student", new Student("张三", 23));
        // 这里的index表示的是Thymeleaf视图页面index.html，但不用写扩展名
        return "index";
    }
}
