package com.lejian.demo.service.impl;

import com.lejian.demo.dao.UserRepository;
import com.lejian.demo.enums.PhoneRegisterResultEnum;
import com.lejian.demo.service.SigninService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 手机号注册 - service层 - 接口实现
 *
 * @author 胡晓磊
 * @company xxx
 * @date 2019年10月17日 21:48 胡晓磊 Exp $
 */
@Service
public class SigninServiceImpl implements SigninService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public PhoneRegisterResultEnum signin(String phone) {
        // 先判断手机号是否被注册
        boolean isRegister = userRepository.checkPhoneIfExist(phone);

        // 手机号已经被注册
        if (isRegister) {
            return PhoneRegisterResultEnum.PHONE_ALREADY_EXIST;
        }

        // 如果未注册，则注册该手机号
        boolean registerResult = userRepository.register(phone);

        // 手机号注册成功
        if (registerResult) {
            return PhoneRegisterResultEnum.REGISTER_SUCCESS;
        }

        // 手机号注册失败
        return PhoneRegisterResultEnum.REGISTER_FAIL;
    }
}
