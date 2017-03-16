package com.myph.constant.bis;

import java.util.Map;

import org.springframework.util.CollectionUtils;

import com.google.common.collect.Maps;
import com.myph.common.util.ResultCodeUtils;
import com.myph.constant.BusinessState;
import com.myph.constant.FlowStateEnum;

/**
 * INFO: 定义 初审阶段的业务状态
 */
public enum AuditFirstBisStateEnum implements BusinessState {
    /**
     * 待初审
     */
    INIT(40, "待初审"), 
    /**
     * 终审退回
     */
    BACK_INIT(41, "复审退回"),
    /**
     * 拒绝
     */
    FIRST_APPROVE_REFUSE(42, "初审拒绝"), 
    /**
     * 待外访
     */
    FIRST_VISIT(43, "待外访"),
    /**
     * 外访拒绝
     */
    FIRST_VISIT_REFUSE(44, "外访拒绝"),
    /**
     * 通过
     */
    FIRST_APPROVE_PASS(45,"初审通过");

    AuditFirstBisStateEnum(int code, String desc) {

        this.code = code;
        this.desc = desc;
    }

    private int code;
    
    private String desc;
    
    private static final Map<Integer, String> auditFirstBisStateNameMap = Maps.newHashMap();
    
    private static final Map<Integer, AuditFirstBisStateEnum> auditFirstBisStateMap = Maps.newHashMap();

    @Override
    public Integer getCode() {
        // 转成2为长度的code码，不足两位前面补齐0
        return ResultCodeUtils.getResultCode(FlowStateEnum.AUDIT_FIRST.getCode() + "",
                ResultCodeUtils.formatString(code, 2));
    }

    @Override
    public String getDesc() {
        return this.desc;
    }
    
    private static void init() {
        for (AuditFirstBisStateEnum c : AuditFirstBisStateEnum.values()){
            auditFirstBisStateMap.put(c.getCode(), c);
            auditFirstBisStateNameMap.put(c.getCode(), c.desc);
        }
    }

    public static BusinessState getEnum(Integer code) {
        if (CollectionUtils.isEmpty(auditFirstBisStateMap)) {
            init();
        }
        return auditFirstBisStateMap.get(code);
    }

    public static String getName(Integer code) {
        if (CollectionUtils.isEmpty(auditFirstBisStateNameMap)) {
            init();
        }
        return auditFirstBisStateNameMap.get(code);
    }
}
