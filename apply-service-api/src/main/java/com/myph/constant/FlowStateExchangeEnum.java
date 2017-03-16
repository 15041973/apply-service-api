package com.myph.constant;

/**
 * INFO: 定义 统一流程控制器中涉及到的几类工作类型
 * User: zhaokai
 * Date: 2016/9/8 - 9:46
 * Version: 1.0
 * History: <p>如果有修改过程，请记录</P>
 */

public enum FlowStateExchangeEnum {
    // 继续
    CONTINUE(1, "continueAction"),
    // 回退
    FALLBACK(2, "fallbackAction"),
    // 拒绝
    REJECT(3, "rejectAction"),
    // 发起外访
    EXTERNAL(4, "externalAction"),
    // 放弃
    ABANDON(5, "abandonAction");

    private Integer type;
    private String message;


    FlowStateExchangeEnum(int type, String message) {
        this.type = type;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public Integer getType() {
        return type;
    }
}
