package com.sunz.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 项目启动类
 */

@SpringBootApplication
public class Application
{
    public static void main(String[] args)
    {
        SpringApplication.run(Application.class, args);
        System.out.println("项目启动成功");
    }
}

/**
 * @SpringBootApplication 包含 @Configuration @EnableAutoConfiguration @ComponentScan
 * 主类使用该注解，告诉springboot 启动一个应用程序，并根据添加依赖自动配置Spring应用程序上下文。
 */