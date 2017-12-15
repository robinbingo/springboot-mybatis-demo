package com.example.demo.common;

import java.io.Serializable;

public class BaseResponse implements Serializable {

    private static final long serialVersionUID = 523855044105571330L;

    /******************************fields******************************/

    private String respCode;

    private String respMsg;

    private Object data;

    /******************************getters&setters******************************/

    public String getRespCode() {
        return respCode;
    }

    public void setRespCode(String respCode) {
        this.respCode = respCode;
    }

    public String getRespMsg() {
        return respMsg;
    }

    public void setRespMsg(String respMsg) {
        this.respMsg = respMsg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    /******************************methods******************************/

    public BaseResponse(ResCode code) {
        this.respCode = code.getCode();
        this.respMsg = code.getMsg();
    }

    public BaseResponse() {
        super();
        this.setRespCode(ResCode.SUCCESS.getCode());
        this.setRespMsg(ResCode.SUCCESS.getMsg());
    }
}