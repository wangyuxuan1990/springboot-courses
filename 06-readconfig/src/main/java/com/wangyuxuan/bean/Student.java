package com.wangyuxuan.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author wangyuxuan
 * @date 2020/9/7 9:23 下午
 * @description
 */
@Component    // 生命周期交由Spring容器来管理
@PropertySource(value = "classpath:custom.properties", encoding = "UTF-8")    // 指定要读取的配置文件名称
@ConfigurationProperties("abc.student")    // 指定要读取的属性的前缀
@Data    // lombok
public class Student {
    private String name;
    private int age;
    private double score;
}
