package com.wangyuxuan.controller;

import com.wangyuxuan.bean.Company;
import com.wangyuxuan.bean.Country;
import com.wangyuxuan.bean.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangyuxuan
 * @date 2020/8/31 9:14 下午
 * @description
 */

@RestController
public class SomeController {

    @Value("${server.port}")
    private int port;

    @Value("${company.name}")
    private String name;

    @Autowired
    private Student student;

    @Autowired
    private Country country;

    @Autowired
    private Company company;

    @GetMapping("/port")
    public String portHandler() {
        return "port = " + port;
    }

    @GetMapping("/name")
    public String nameHandler() {
        return "company.name = " + name;
    }

    @GetMapping("/student")
    public String studentHandler() {
        return "student = " + student;
    }

    @GetMapping("/country")
    public String countryHandler() {
        return "country = " + country.getCities();
    }

    @GetMapping("/company")
    public String companyHandler() {
        return "company = " + company.getDeparts();
    }
}
