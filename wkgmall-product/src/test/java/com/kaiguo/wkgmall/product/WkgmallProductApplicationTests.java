package com.kaiguo.wkgmall.product;

import com.kaiguo.wkgmall.product.entity.BrandEntity;
import com.kaiguo.wkgmall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WkgmallProductApplicationTests {

    @Autowired
    private BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity entity = new BrandEntity();

        entity.setName("w");
        brandService.save(entity);
        System.out.println("保存成功");
    }

}
