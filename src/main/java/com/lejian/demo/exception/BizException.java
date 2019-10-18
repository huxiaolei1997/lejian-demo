package com.lejian.demo.exception;

/**
 * 用途描述
 *
 * @author 胡晓磊
 * @company xxx
 * @date 2019年10月17日 21:29 胡晓磊 Exp $
 */
public class BizException extends RuntimeException{

    public BizException(String code) {
        this.code = code;
    }

    public BizException(String code, String message) {
        super(message);
        this.code = code;
    }

    public BizException(String message, Throwable cause, String code) {
        super(message, cause);
        this.code = code;
    }

    public BizException(Throwable cause, String code) {
        super(cause);
        this.code = code;
    }

    public BizException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String code) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.code = code;
    }

    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
