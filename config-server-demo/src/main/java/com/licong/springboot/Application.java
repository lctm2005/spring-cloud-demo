package com.licong.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by lctm2005 on 2015/6/20.
 */
@EnableConfigServer
@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
public class Application  {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}
