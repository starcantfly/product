package com.immoc.product.utils;

import com.immoc.product.VO.ResultVO;

public class ResultVOUtil {

    public static ResultVO success(Object object){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setData(object);
        resultVO.setMsg("成功");
        return resultVO;
    }
}
