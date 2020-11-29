package com.alex.pagehelp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan(basePackages = {"com.alex.pagehelp.mapper"})
public class FenyeApplication {

    public static void main(String[] args) {
        SpringApplication.run(FenyeApplication.class, args);
    }

}
