package com.kaiguo.wkgmall.common.exception;

import lombok.Getter;


@Getter
public enum BizCodeEnum {
    UNKNOW_EXCEPTION(10000, "系统未知异常"),
    VAILD_EXCEPTION(10001, "参数格式错误");
    private Integer code;
    private String msg;
    BizCodeEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}
