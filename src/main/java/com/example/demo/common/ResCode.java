package com.example.demo.common;

public enum ResCode {


    SUCCESS("1000", "成功.");

    /******************************fields******************************/

    private String code;
    private String msg;

    /******************************getters&setters******************************/

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

    /******************************methods******************************/

    ResCode(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
