package com.congco.smp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author congco
 */
@MapperScan(basePackages = "com.congco.smp.mapper")
@SpringBootApplication
public class SmpApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmpApplication.class, args);
    }

}
