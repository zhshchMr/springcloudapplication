package com.eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.controller","com.entity","com.respository"})
/**
 * SpringBoot默认只扫描启动类包下的所有符合规则的类，
 * 如果像扫描不在此路路径下的类，必须使用@ComponentScan指定需要扫描的包、类的路径
 */
public class EurekaClientApplication2 {
    public static void main(String[] args) {

        SpringApplication.run(EurekaClientApplication2.class,args);
    }
}
