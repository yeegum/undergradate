package com.ecut.wang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication(scanBasePackages = "com")
@MapperScan("com.ecut.wang.dao")
@EnableCaching
@EnableScheduling
public class WangApplication {
    public static void main(String[] args) {
        SpringApplication.run(WangApplication.class, args);
    }

}
