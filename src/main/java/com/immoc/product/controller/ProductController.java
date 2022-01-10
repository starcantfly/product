package com.immoc.product.controller;

import com.immoc.product.VO.ProductInfoVO;
import com.immoc.product.VO.ProductVO;
import com.immoc.product.VO.ResultVO;
import com.immoc.product.dataobject.ProductCategory;
import com.immoc.product.dataobject.ProductInfo;
import com.immoc.product.service.CategoryService;
import com.immoc.product.service.ProductService;
import com.immoc.product.utils.ResultVOUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 商品
 */
@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @Autowired
    CategoryService categoryService;

    /**
     * 1,查询所有在架商品
     * 2，获取类目type列表
     * 3，查询类目
     * 4，构造数据
     */
    @GetMapping("/list")
    public ResultVO<ProductVO> list(){
        //1,查询所有在架商品
        List<ProductInfo> productInfoList = productService.findUpAll();
        //2，获取类目type列表
        List<Integer> categoryTypeList = productInfoList.stream()
                .map(ProductInfo::getCategoryType)
                .collect(Collectors.toList());
        //3，查询类目
        List<ProductCategory> productCategoryList = categoryService.findByCategoryTypeIn(categoryTypeList);
        //4，构造数据
        List<ProductVO> productVOList = new ArrayList<>();
        List<ProductInfoVO> productInfoVOList = new ArrayList<>();
        for (ProductCategory category : productCategoryList){
            ProductVO productVO = new ProductVO();
            productVO.setCategoryName(category.getCategoryName());
            productVO.setCategoryType(category.getCategoryType());

            for (ProductInfo productInfo : productInfoList){
                if (productInfo.getCategoryType().equals(category.getCategoryType())){
                    ProductInfoVO productInfoVO = new ProductInfoVO();
                    BeanUtils.copyProperties(productInfo,productInfoVO);
                    productInfoVOList.add(productInfoVO);
                }

            }
            productVO.setProductInfoVOList(productInfoVOList);
            productVOList.add(productVO);
        }
        return ResultVOUtil.success(productVOList);
    }
}
