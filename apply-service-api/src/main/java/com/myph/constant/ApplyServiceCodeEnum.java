package com.myph.constant;

import com.myph.common.util.ResultCodeUtils;

/**
 * INFO: 定义各类涉及到ServiceCodeEnum的code和message的基础接口定义 User: heyx Date: 2016/8/31 - 8:40 Version: 1.0 History:
 * <p>
 * 如果有修改过程，请记录
 * </P>
 */
public enum ApplyServiceCodeEnum {

    RECEPTION_SERVICE(3), APPLY_SERVICE(4);

    ApplyServiceCodeEnum(int code) {
        this.code = code;
    }

    private int code;

    public String getCode() {
        // 转成2为长度的code码，不足两位前面补齐0
        return ResultCodeUtils.formatString(code, 2);
    }
}
