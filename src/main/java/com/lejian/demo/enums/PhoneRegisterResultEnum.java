package com.lejian.demo.enums;

/**
 * 手机号注册结果 - 枚举类
 *
 * @author 胡晓磊
 * @company xxx
 * @date 2019年10月17日 21:54 胡晓磊 Exp $
 */
public enum PhoneRegisterResultEnum {
    /**
     * 注册成功
     */
    REGISTER_SUCCESS(0, "手机号注册成功", "success"),

    /**
     * 手机号已经被注册
     */
    PHONE_ALREADY_EXIST(1, "手机号已经被注册", "fail"),

    /**
     * 注册失败
     */
    REGISTER_FAIL(2, "手机号注册失败", "fail"),;

    /**
     * 状态码
     */
    private Integer code;

    /**
     * 信息
     */
    private String msg;

    /**
     * 状态
     */
    private String status;

    PhoneRegisterResultEnum(Integer code, String msg, String status) {
        this.code = code;
        this.msg = msg;
        this.status = status;
    }

    /**
     * Getter method for property <tt>msg</tt>.
     *
     * @return property value of msg
     */
    public String getMsg() {
        return msg;
    }


    /**
     * Getter method for property <tt>code</tt>.
     *
     * @return property value of code
     */
    public Integer getCode() {
        return code;
    }

    /**
     * Getter method for property <tt>status</tt>.
     *
     * @return property value of status
     */
    public String getStatus() {
        return status;
    }
}
