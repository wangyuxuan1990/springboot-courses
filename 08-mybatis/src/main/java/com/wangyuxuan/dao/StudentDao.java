package com.wangyuxuan.dao;

import com.wangyuxuan.bean.Student;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author wangyuxuan
 * @date 2020/9/7 11:13 下午
 * @description
 */
@Mapper
public interface StudentDao {

    void insertStudent(Student student);
}
