package com.wc.test;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import com.wc.controller.RedisConfigCotroller;

/**
 * Created by fiboliu on 16-3-16.
 */
@SpringBootApplication
@ImportResource({"applicationContext.xml"})//引入disconf
public class Application {
    public static void main(String args[]) {
        SpringApplication.run(new Object[]{ Application.class,RedisConfigCotroller.class}, args);
    }
}


