package com.wangyuxuan.service;

import com.wangyuxuan.bean.Student;
import com.wangyuxuan.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author wangyuxuan
 * @date 2020/9/7 11:07 下午
 * @description
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao dao;

    @CacheEvict(value = "realTimeCache", allEntries = true)
    @Transactional(rollbackFor = Exception.class)
    @Override
    public void addStudent(Student student) throws Exception {
        dao.insertStudent(student);
    }

    @Cacheable(value = "realTimeCache", key = "'student_'+#age")
    @Override
    public List<Student> findStudentsBelowAge(int age) {
        return dao.selectStudentsBelowAge(age);
    }

    // Redis在高并发情况下可能会存在哪些问题？
    // 1) 缓存穿透：当从DB中查询结果为null时有可能会引发缓存穿透问题。
    //    其解决方案是，为这些为null的结果赋予一个默认值。
    // 2) 缓存雪崩：当缓存中的某些缓存在同一很短的时段内几乎同时到期，此时就可能会引发缓存雪崩问题。
    //    其解决方案是，提前规划好系统中所有缓存的到期时间。
    // 3) 热点缓存：当某一个缓存的有效期到达时其可能会引发热点缓存问题。其解决方案是，双重检测锁机制。

    // 这里要使用双重检测锁机制解决当前代码中可能会存在的热点缓存问题
    @Override
    public Integer findStudentsCount() {
        return dao.selectStudentsCount();
    }

}
