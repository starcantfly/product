package com.imooc.product.service.impl;

import com.imooc.product.service.ProductService;
import com.imooc.product.common.DecreaseStockInput;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

@SpringBootTest
class ProductServiceImplTest{

    @Autowired
    ProductService productService;
    @Test
    void findUpAll() {
    }

    @Test
    void findList() {
    }

    @Test
    void decreaseStock() {
        DecreaseStockInput decreaseStockInput = new DecreaseStockInput("164103465734242707", 2);
        productService.decreaseStock(Arrays.asList(decreaseStockInput));
    }
}