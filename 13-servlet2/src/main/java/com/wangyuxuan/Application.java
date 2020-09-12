package com.wangyuxuan;

import com.wangyuxuan.servlet.SomeServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /**
     * 注册Servlet
     *
     * @return
     */
    @Bean
    public ServletRegistrationBean<SomeServlet> getServletBean() {
        return new ServletRegistrationBean<>(new SomeServlet(), "/some");
    }

}
