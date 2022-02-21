package com.imooc.product.repository;

import com.imooc.product.dataobject.ProductInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.Arrays;
import java.util.List;


@SpringBootTest
class ProductInfoRepositoryTest {

    @Autowired
    ProductInfoRepository productInfoRepository;
    @Test
    void findByProductStatus() {
      List<ProductInfo> productInfoList = productInfoRepository.findByProductStatus(0);
        Assert.notEmpty(productInfoList,"商品为空");
    }
    @Test
    public void findByProductIdIn() throws Exception{
        List<ProductInfo> productInfoList = productInfoRepository.findByProductIdIn(Arrays.asList("157875196366160022","157875227953464068"));
        Assert.notEmpty(productInfoList);
    }
}