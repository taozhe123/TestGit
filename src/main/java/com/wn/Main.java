package com.wn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication   //指定当前项目为一个springboot项目
public class Main {
    public static void main(String[] args) {

        //作为一个Spring项目运行
        SpringApplication.run(Main.class,args);

    }
}
