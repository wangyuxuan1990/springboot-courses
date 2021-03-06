package com.wangyuxuan.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author wangyuxuan
 * @date 2020/9/7 9:44 下午
 * @description
 */
@Component
@PropertySource(value = "classpath:custom.properties", encoding = "UTF-8")
@ConfigurationProperties("def.country")
@Data
public class Country {
    private List<String> cities;
}
