package com.rainbow.dockerboot.dto;

/**
 * <p>功能描述</br></p>
 *
 * @author rain
 * @version v1.0
 * @projectName docker-boot
 * @date 2019/11/25 19:12
 */
public class Response {

    private String code;

    private String msg;

    private Object data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static Response build(Object data) {
        Response response = new Response();
        response.setCode("000000");
        response.setData(data);
        return response;
    }


    public static Response buildError(String code, String message) {
        Response response = new Response();
        response.setCode(code);
        response.setMsg(message);
        return response;
    }
}