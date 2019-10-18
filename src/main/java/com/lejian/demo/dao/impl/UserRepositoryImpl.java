package com.lejian.demo.dao.impl;

import com.lejian.demo.dao.UserRepository;
import com.lejian.demo.enums.PhoneRegisterResultEnum;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * 手机号注册 - dao层 - 接口实现
 *
 * @author 胡晓磊
 * @company xxx
 * @date 2019年10月17日 21:51 胡晓磊 Exp $
 */
@Repository
public class UserRepositoryImpl implements UserRepository {

    /** 用来保存手机号 **/
    private static final List<String> userList = new ArrayList<>(10);

    @Override
    public boolean register(String phone) {
        // 注册手机号，添加到list中
        return userList.add(phone);
    }

    @Override
    public boolean checkPhoneIfExist(String phone) {
        return userList.contains(phone);
    }
}
