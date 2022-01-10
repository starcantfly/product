package com.immoc.product.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.naming.Name;
import java.util.List;
@Data
public class ProductVO {

    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private Integer categoryType;

    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;
}
