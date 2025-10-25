package com.david.judge;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.david.judge.mapper")
public class JudgeApplication {
    public static void main(String[] args) {
        SpringApplication.run(JudgeApplication.class, args);
    }
}
