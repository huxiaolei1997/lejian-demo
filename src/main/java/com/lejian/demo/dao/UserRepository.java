package com.lejian.demo.dao;

import com.lejian.demo.enums.PhoneRegisterResultEnum;

/**
 * 手机号注册 - dao层 - 接口
 *
 * @author 胡晓磊
 * @company xxx
 * @date 2019年10月17日 21:49 胡晓磊 Exp $
 */
public interface UserRepository {
    /**
     * 手机号注册
     *
     * @return boolean
     * @author 胡晓磊
     * @version 1.0
     * @date 2019-10-17
     */
    boolean register(String phone);


    /**
     * 检查手机号是否存在
     *
     * @return boolean
     * @author 胡晓磊
     * @version 1.0
     * @date 2019-10-17
     */
    boolean checkPhoneIfExist(String phone);
}
