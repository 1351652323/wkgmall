package com.kaiguo.wkgmall.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.kaiguo.wkgmall.order.dao")
public class WkgmallOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(WkgmallOrderApplication.class, args);
    }

}
