package com.lejian.demo.util;

import com.lejian.demo.exception.BizException;
import lombok.extern.slf4j.Slf4j;

/**
 * 断言工具类
 *
 * @author 胡晓磊
 * @company xxx
 * @date 2019年10月17日 22:12 胡晓磊 Exp $
 */
@Slf4j
public class AssertUtil {
    /**
     * 参数为true校验
     *
     * @param value
     * @param message 错误信息
     */
    public static void isTrue(boolean value, String message) {

        // 校验value是否为false，为false则抛出异常
        if (!value) {

            log.error("isBlank vaule is :{}", value);
            throw new BizException("400", message);
        }
    }

    /**
     * 参数为false校验
     *
     * @param value
     * @param message 错误信息
     */
    public static void isFalse(boolean value, String message) {

        // 校验value是否为true，为true则抛出异常
        if (value) {
            log.error("isFalse vaule is :{}", value);
            throw new BizException("400", message);
        }
    }
}
