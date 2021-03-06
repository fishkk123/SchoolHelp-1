package com.zgdr.schoolhelp.enums;

/**
 * 图片异常类型
 *
 *
 * @author yangji
 * @version 1.0
 * @since 2019/5/2
 */
public enum ImageResultEnum implements ResultEnum{
    EMPTY_FILE(-1,"文件为空"),
    NO_POWER(-2, "你没有权限"),
    NO_RESOURCE(-3,"还未上传资源");

    private Integer code;

    private String msg;

    ImageResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
