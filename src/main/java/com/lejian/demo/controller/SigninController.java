package com.lejian.demo.controller;

import com.lejian.demo.enums.PhoneRegisterResultEnum;
import com.lejian.demo.response.CommonReturnType;
import com.lejian.demo.service.SigninService;
import com.lejian.demo.util.AssertUtil;
import com.lejian.demo.util.ValidateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用途描述
 *
 * @author 胡晓磊
 * @company xxx
 * @date 2019年10月17日 21:29 胡晓磊 Exp $
 */
@RestController
public class SigninController {

    @Autowired
    private SigninService signinService;

    /**
     * TODO 请从这里开始补充代码
     *
     * 测试1：138 1234 1234
     *	结果：通过此手机号注册成功
     *
     * 测试2：13812345abc
     *	结果：通知本手机号无法注册，提示为非法手机号
     *
     * 测试3：13812345678
     *	结果：通知此手机号注册成功
     *
     * 测试4：138 1234 5678
     *	结果：提示此手机号已经被其他用户注册
     *
     * 测试5：98765432101
     *	结果：此手机号码为中国大陆非法手机号码
     */
    @PostMapping("/signin")
    public CommonReturnType signin(String phone) {
        AssertUtil.isTrue(ValidateUtil.isMobile(phone), "手机号格式错误");
        AssertUtil.isTrue(ValidateUtil.isMobileFormat(phone), "此手机号码为中国大陆非法手机号码");

        // 手机号注册
        PhoneRegisterResultEnum registerResult = signinService.signin(phone);

        if (null == registerResult) {
            return CommonReturnType.createFail("手机号注册失败");
        }

        return CommonReturnType.create(registerResult.getMsg(), registerResult.getStatus());
    }
}
