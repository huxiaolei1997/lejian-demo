package com.lejian.demo.service;

import com.lejian.demo.enums.PhoneRegisterResultEnum;

/**
 * 手机号注册 - service层 - 接口
 *
 * @author 胡晓磊
 * @company xxx
 * @date 2019年10月17日 21:44 胡晓磊 Exp $
 */
public interface SigninService {
    /**
     * 手机号注册
     *
     * @return java.lang.Integer
     * @author 胡晓磊
     * @version 1.0
     * @date 2019-10-17
     */
    PhoneRegisterResultEnum signin(String phone);
}
