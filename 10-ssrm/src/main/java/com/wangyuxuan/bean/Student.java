package com.wangyuxuan.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @author wangyuxuan
 * @date 2020/9/7 9:23 下午
 * @description
 */
@Data
public class Student implements Serializable {
    private Integer id;
    private String name;
    private int age;
}
