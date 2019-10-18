package com.lejian.demo.util;

import org.apache.commons.lang3.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 校验工具类
 *
 * @author 胡晓磊
 * @company xxx
 * @date 2019年10月17日 22:12 胡晓磊 Exp $
 */
public class ValidateUtil {

    private ValidateUtil(){

    }

    /**
     * 验证是否是11位数字
     */
    private final static Pattern MOBILE_PATTERN = Pattern.compile("^\\d{11}$");

    /**
     * 验证11位数字是否以1开头
     */
    private final static Pattern MOBILE_PATTERN_FORMAT = Pattern.compile("^[1]\\d{10}$");

    /**
     * 手机号位数验证
     *
     * @param str
     * @return 验证通过返回true
     */
    public static boolean isMobile(String str) {
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        Matcher m = MOBILE_PATTERN.matcher(str);
        return m.matches();
    }

    /**
     * 手机号格式验证
     *
     * @param str
     * @return 验证通过返回true
     */
    public static boolean isMobileFormat(String str) {
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        Matcher m = MOBILE_PATTERN_FORMAT.matcher(str);
        return m.matches();
    }
}
