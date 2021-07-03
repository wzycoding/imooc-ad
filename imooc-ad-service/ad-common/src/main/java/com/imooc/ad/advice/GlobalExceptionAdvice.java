package com.imooc.ad.advice;

import com.imooc.ad.exception.AdException;
import com.imooc.ad.vo.CommonResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * 统一异常处理类
 *
 * @author wzy
 * @version 1.0
 * @date 2021/7/3 5:38 下午
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionAdvice {

    /**
     * 处理广告相关的异常
     *
     * @param request 请求对象
     * @param ex      异常对象
     * @return 返回响应结果
     */
    @ExceptionHandler(value = AdException.class)
    public CommonResponse<String> handleAdException(HttpServletRequest request,
                                                    AdException ex) {
        CommonResponse<String> response = new CommonResponse<>(-1,
                "business error");
        response.setData(ex.getMessage());

        return response;
    }

    /**
     * 处理通用异常对象
     *
     * @param request 请求对象
     * @param ex      异常对象
     * @return 统一处理响应结果
     */
    @ExceptionHandler(value = Exception.class)
    public CommonResponse<String> handleException(HttpServletRequest request,
                                                  AdException ex) {
        CommonResponse<String> response = new CommonResponse<>(500,
                "server error");
        response.setData(ex.getMessage());

        return response;
    }
}