package com.uygulama.ecdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages={"com.uygulama"})
public class EcDemoApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(EcDemoApplication.class, args);

    }

}
