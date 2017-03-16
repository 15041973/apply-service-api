package com.myph.constant.bis;

import com.myph.constant.BusinessState;

/**
 * INFO: 定义 接待信息表的业务状态
 */
public enum ReceptionStateEnum implements BusinessState {

    SAVE(0, "接待保存"), PASSED(1, "接待通过"), REJECT(2, "接待拒绝"),ABANDON(3,"客户放弃");

    ReceptionStateEnum(int code, String desc) {

        this.code = code;
        
        this.desc = desc;
    }

    private int code;
    
    private String desc;

    @Override
    public Integer getCode() {
        return this.code;
    }

    @Override
    public String getDesc() {
        return this.desc;
    }
}
