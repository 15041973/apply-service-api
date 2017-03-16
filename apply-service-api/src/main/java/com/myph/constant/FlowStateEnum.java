package com.myph.constant;

import java.util.Map;

import org.springframework.util.CollectionUtils;

import com.google.common.collect.Maps;

/**
 * INFO: 定义各阶段的流程状态 10开始  最大值99
 */
public enum FlowStateEnum {

    // 定义8个流程阶段
    /**
     * 进件
     */
    APPLY(10, "申请"),
    /**
     * 初审
     */
    AUDIT_FIRST(11, "初审"),
    /**
     * 初审外访
     */
    EXTERNAL_FIRST(12, "初审外访"),
    /**
     * 终审
     */
    AUDIT_LASTED(13, "复审"),
    /**
     * 终审外访
     */
    EXTERNAL_LAST(14, "复审外访"),
    /**
     * 签约
     */
    SIGN(15, "签约"),
    /**
     * 合规
     */
    CONTRACT(16, "合规"),
    /**
     * 财务
     */
    FINANCE(17, "财务"),
    
    //针对2个结束阶段的定义
    /**
     * 完成
     */
    FINISH(18, "完成"),
    /**
     * 系统拒绝
     */
    REJECT(20, "系统拒绝"),
    /**
     * 客户放弃
     */
    ABANDON(21, "客户放弃"),
    
    AUDIT_MANAGER(22, "终审"),
    
    AUDIT_DIRECTOR(23, "高级终审");
    

    FlowStateEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    private int code;
    
    private String desc;

    private static final Map<Integer, String> flowStateEnumNameMap = Maps.newHashMap();
    
    private static final Map<Integer, FlowStateEnum> flowStateEnumMap = Maps.newHashMap();
    
    public Integer getCode() {
        return code;
    }

    public String getDesc(){
        return desc;
    }
    
    private static void init() {
        for (FlowStateEnum c : FlowStateEnum.values()){
            flowStateEnumMap.put(c.code, c);
            flowStateEnumNameMap.put(c.code, c.desc);
        }
    }
    
    public static String getDescByCode(int code){
        if (CollectionUtils.isEmpty(flowStateEnumNameMap)) {
            init();
        }
        return flowStateEnumNameMap.get(code);
    }
    
    public static FlowStateEnum getEnum(Integer code) {
        if (CollectionUtils.isEmpty(flowStateEnumMap)) {
            init();
        }
        return flowStateEnumMap.get(code);
    }
}
