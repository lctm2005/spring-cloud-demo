package com.licong.springcloud.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lctm2005 on 2016/7/30.
 */
@SpringBootApplication
@RestController
public class Application {

    @Value("${hello.env}")
    private String hello;


    @RequestMapping("/")
    public String home() {
        return hello;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
