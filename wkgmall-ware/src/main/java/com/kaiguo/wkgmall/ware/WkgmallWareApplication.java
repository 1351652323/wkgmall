package com.kaiguo.wkgmall.ware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class WkgmallWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(WkgmallWareApplication.class, args);
    }

}
