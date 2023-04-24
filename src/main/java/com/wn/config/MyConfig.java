package com.wn.config;

import com.wn.model.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//通过@Configuration + @Bean 向容器中注入一个实例

@Configuration//当前是一个配置类
public class MyConfig {

    @Bean//当前方法返回一个对象放入IOC容器中
    public Cat cat(){
        return new Cat();
    }
}
