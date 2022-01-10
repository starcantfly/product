package com.immoc.product.VO;

import lombok.Data;

/**
 * http请求返回的最外层对象
 * @param <T>
 */
@Data
public class ResultVO<T> {
    /**
     * 错误码
     */
    private Integer code;
    /**
     * 提示信息
     */
    private String msg;
    /**
     * 提示内容
     */
    private T data;
}
