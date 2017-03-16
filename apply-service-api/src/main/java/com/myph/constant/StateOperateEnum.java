package com.myph.constant;

/**
 * 
 * @ClassName: StateOperateEnum
 * @Description: 状态；1：通过 ，2：拒绝
 * @author heyx
 * @date 2016年9月12日 下午2:12:53
 *
 */
public enum StateOperateEnum {
    /**
     * code:1 <br>
     * message:通过
     */
    ADOPT(1, "通过"),
    /**
     * code:0 <br>
     * message:接待保存
     */
    INSERT(0, "接待保存"),
    /**
     * code:2 <br>
     * message:拒绝
     */
    REFUSE(2, "拒绝"),
    /**
     * code:3 <br>
     * message:客户放弃
     */
    ABANDON(3, "客户放弃");

    StateOperateEnum(int code, String message) {
        this.message = message;
        this.code = code;
    }

    private String message;

    private int code;

    public Integer getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }
}
