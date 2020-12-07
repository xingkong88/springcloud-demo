package com.offcn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
//开启注册中心服务端注解
@EnableEurekaServer
public class EurekaServiceStart {
    public static void main(String[] args){
        SpringApplication.run(EurekaServiceStart.class);
    }
}
