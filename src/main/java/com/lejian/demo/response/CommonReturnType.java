package com.lejian.demo.response;

/**
 * 用途描述
 *
 * @author 胡晓磊
 * @company xxx
 * @date 2019年09月09日 22:11 胡晓磊 Exp $
 */
public class CommonReturnType {
    // 表明对应请求的返回处理结果 "success" 或 "fail"
    private String status;

    // 如果status=success,则data内返回前端需要的json数据，如果status=fail,则data内使用通用的错误码格式
    private Object data;

    // 定义一个通用的方法
    public static CommonReturnType create(Object result) {
        return CommonReturnType.create(result, "success");
    }


    public static CommonReturnType create(Object result, String status) {
        CommonReturnType type = new CommonReturnType();
        type.setStatus(status);
        type.setData(result);
        return type;
    }

    public static CommonReturnType createFail(Object result) {
        return CommonReturnType.create(result, "fail");

    }

    /**
     * Getter method for property <tt>status</tt>.
     *
     * @return property value of status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Getter method for property <tt>data</tt>.
     *
     * @return property value of data
     */
    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
