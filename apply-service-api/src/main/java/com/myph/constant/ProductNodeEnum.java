package com.myph.constant;

/**
 * INFO: 附件上传阶段 code 对应 sys_node基础数据表里的id
 */
public enum ProductNodeEnum {

    // 定义8个流程阶段
    /**
     * 申请单阶段
     */
    APPLY(13L, "申请单阶段"),
    /**
     * 外访阶段
     */
    EXTERNAL(14L, "外访阶段"),
    /**
     * 信审阶段
     */
    AUDIT(15L, "信审阶段"),
    /**
     * 签约阶段
     */
    SIGN(16L, "签约阶段");

    ProductNodeEnum(Long code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    private Long code;

    private String desc;

    public Long getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
