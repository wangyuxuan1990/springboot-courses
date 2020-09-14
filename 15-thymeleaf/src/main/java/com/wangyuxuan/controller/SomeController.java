package com.wangyuxuan.controller;

import com.wangyuxuan.vo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        model.addAttribute("gender", "male");
        List<Student> students = new ArrayList<>();
        students.add(new Student("李四", 24));
        students.add(new Student("王五", 25));
        students.add(new Student("赵六", 26));
        model.addAttribute("students", students);
        Map<String, Student> map = new HashMap<>();
        map.put("stu7", new Student("田七", 27));
        map.put("stu8", new Student("刘八", 28));
        map.put("stu9", new Student("郑九", 29));
        model.addAttribute("map", map);
        model.addAttribute("welcome", "<h2>Thymeleaf, <br>I'm learning.</h2>");
        model.addAttribute("attrName", "score");
        model.addAttribute("attrValue", 99);
        model.addAttribute("photo", "jianshen4.jpg");
        // 这里的index表示的是Thymeleaf视图页面index.html，但不用写扩展名
        return "index";
    }
}
