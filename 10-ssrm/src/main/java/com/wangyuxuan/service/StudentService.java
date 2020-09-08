package com.wangyuxuan.service;

import com.wangyuxuan.bean.Student;

import java.util.List;

/**
 * @author wangyuxuan
 * @date 2020/9/7 11:05 下午
 * @description
 */
public interface StudentService {

    void addStudent(Student student) throws Exception;

    List<Student> findStudentsBelowAge(int age);

    Integer findStudentsCount();

}
