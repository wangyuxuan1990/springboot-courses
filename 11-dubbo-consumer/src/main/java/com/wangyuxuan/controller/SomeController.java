package com.wangyuxuan.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wangyuxuan.bean.Student;
import com.wangyuxuan.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author wangyuxuan
 * @date 2020/8/31 9:14 下午
 * @description
 */

@Controller
@RequestMapping("/some")
public class SomeController {

    @Reference    // 阿里的注解，其相当于<dubbo:reference>标签
    private StudentService service;

    @PostMapping("/register")
    public String registerHandler(Student student, Model model) throws Exception {
        model.addAttribute("student", student);
        service.addStudent(student);
        return "/jsp/welcome.jsp";
    }

    @PostMapping("/find")
    @ResponseBody
    public List<Student> findHandler(int age) {
        return service.findStudentsBelowAge(age);
    }

    @GetMapping("/count")
    @ResponseBody
    public Integer countHandler() {
        return service.findStudentsCount();
    }

}
