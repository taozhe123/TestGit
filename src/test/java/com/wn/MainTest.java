package com.wn;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest//指定当前类为一个Spring boot项目测试类
//注意：测试类和项目的主类的包路径一致，便于测试
public class MainTest {
    @Test
    void test(){
        System.out.println("Hello Test");
    }
}
