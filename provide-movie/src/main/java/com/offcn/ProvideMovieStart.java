package com.offcn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//开启注册中心客户端
//也就是把该服务注册到eurekaService
@EnableDiscoveryClient
public class ProvideMovieStart {
    public static void main(String [] args){
        SpringApplication.run(ProvideMovieStart.class);
    }
}
