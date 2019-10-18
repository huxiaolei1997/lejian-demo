package com.lejian.demo.common;

import com.alibaba.fastjson.JSONObject;
import com.lejian.demo.exception.BizException;
import com.lejian.demo.response.CommonReturnType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 用途描述
 *
 * @author 胡晓磊
 * @company xxx
 * @date 2019年10月17日 21:29 胡晓磊 Exp $
 */
@ControllerAdvice
@Component
@Order(Ordered.LOWEST_PRECEDENCE)
public class ExceptionAdvice {

    private static final Logger log = LoggerFactory.getLogger(ExceptionAdvice.class);

    @ExceptionHandler(value = RuntimeException.class)
    @ResponseBody
    public CommonReturnType handleRuntimeException(RuntimeException e, HttpServletRequest request, HttpServletResponse response) {
        log.error("catch runtime exception:uri-{}, param-{}", request.getRequestURI(), JSONObject.toJSON(request.getParameterMap()), e);
        CommonReturnType result = new CommonReturnType();
        result.setData("服务器开小差了");
        result.setStatus("false");
        return result;
    }

    @ExceptionHandler(value = BizException.class)
    @ResponseBody
    public CommonReturnType handleBizException(BizException e, HttpServletRequest request, HttpServletResponse response) {
        log.error("catch biz exception:uri-{}, param-{}", request.getRequestURI(), JSONObject.toJSON(request.getParameterMap()), e);
        CommonReturnType result = new CommonReturnType();
        result.setData(e.getMessage());
        result.setStatus("false");
        return result;
    }

}
