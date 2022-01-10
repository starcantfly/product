package com.immoc.product.repository;

import com.immoc.product.dataobject.ProductInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import javax.annotation.security.RunAs;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class ProductInfoRepositoryTest {

    @Autowired
    ProductInfoRepository productInfoRepository;
    @Test
    void findByProductStatus() {
      List<ProductInfo> productInfoList = productInfoRepository.findByProductStatus(0);
        Assert.notEmpty(productInfoList,"商品为空");
    }
}