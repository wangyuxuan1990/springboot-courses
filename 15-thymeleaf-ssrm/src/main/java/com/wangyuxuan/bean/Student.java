package com.wangyuxuan.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author wangyuxuan
 * @date 2020/9/7 9:23 下午
 * @description
 */
@Data
@NoArgsConstructor
public class Student implements Serializable {
    private Integer id;
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
