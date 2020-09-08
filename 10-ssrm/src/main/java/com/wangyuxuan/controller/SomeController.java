package com.wangyuxuan.controller;

import com.wangyuxuan.bean.Student;
import com.wangyuxuan.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

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

    @PostMapping("/register")
    public String registerHandler(Student student, Model model) throws Exception {
        model.addAttribute("student", student);
        service.addStudent(student);
        return "/jsp/welcome.jsp";
    }

    @PostMapping("/find")
    public List<Student> findHandler(int age) {
        return service.findStudentsBelowAge(age);
    }

    @GetMapping("/count")
    public Integer countHandler() {
        return service.findStudentsCount();
    }

}
