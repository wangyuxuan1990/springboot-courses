package com.wangyuxuan.controller;

import com.wangyuxuan.bean.Student;
import com.wangyuxuan.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wangyuxuan
 * @date 2020/8/31 9:14 下午
 * @description
 */

@Controller
@RequestMapping("/some")
public class SomeController {

    @Autowired
    private StudentService service;

    @RequestMapping("/index")
    public String indexHandler() {
        return "index";
    }

    @PostMapping("/register")
    public String registerHandler(Student student, Model model) throws Exception {
        model.addAttribute("student", student);
        service.addStudent(student);
        return "/html/welcome";
    }

    @PostMapping("/find")
    public String findHandler(int age, Model model) {
        Student student = service.findStudentsBelowAge(age).get(0);
        model.addAttribute("student", student);
        return "/html/welcome";
    }

    @GetMapping("/count")
    @ResponseBody
    public Integer countHandler() {
        return service.findStudentsCount();
    }

}
