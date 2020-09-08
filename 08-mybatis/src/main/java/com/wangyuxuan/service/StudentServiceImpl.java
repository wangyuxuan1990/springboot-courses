package com.wangyuxuan.service;

import com.wangyuxuan.bean.Student;
import com.wangyuxuan.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author wangyuxuan
 * @date 2020/9/7 11:07 下午
 * @description
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao dao;

    // 采用Spring默认的事务提交方式：发生运行时异常回滚，发生受查异常提交
    @Transactional(rollbackFor = Exception.class)
    @Override
    public void addStudent(Student student) throws Exception {
        dao.insertStudent(student);
        if(true) {
            throw new Exception("发生受查异常");
        }
        dao.insertStudent(student);
    }
}
