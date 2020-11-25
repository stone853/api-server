package com.sk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

//@MapperScan(value = "com.sk.web.mapper")
@tk.mybatis.spring.annotation.MapperScan("com.sk.web.mapper")
@SpringBootApplication
public class ServerSpringbootApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServerSpringbootApplication.class, args);
    }
}
