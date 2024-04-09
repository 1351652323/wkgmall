package com.kaiguo.wkgmall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.kaiguo.wkgmall.product.dao")
public class WkgmallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(WkgmallProductApplication.class, args);
    }

}
