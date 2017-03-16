package com.myph.constant.bis;

import java.util.Map;

import org.springframework.util.CollectionUtils;

import com.google.common.collect.Maps;
import com.myph.common.util.ResultCodeUtils;
import com.myph.constant.BusinessState;
import com.myph.constant.FlowStateEnum;

/**
 * INFO: 定义 终审阶段的业务状态
 */
public enum AuditLastBisStateEnum implements BusinessState {

    INIT(50, "待复审"),
    FINISH(51,"复审通过"),
    REFUSE(52,"复审拒绝"),
    VISIT_REFUSE(53,"外访拒绝"),
    VISIT(54, "待外访"),
    BACK_INIT(55, "终审回退");

    AuditLastBisStateEnum(int code, String desc) {

        this.code = code;
        this.desc = desc;
    }

    private int code;
    
    private String desc;
    
    private static final Map<Integer, String> auditLastBisStateNameMap = Maps.newHashMap();
    
    private static final Map<Integer, AuditLastBisStateEnum> auditLastBisStateMap = Maps.newHashMap();

    @Override
    public Integer getCode() {
        // 转成2为长度的code码，不足两位前面补齐0
        return ResultCodeUtils.getResultCode(FlowStateEnum.AUDIT_LASTED.getCode() + "",
                ResultCodeUtils.formatString(code, 2));
    }

    @Override
    public String getDesc() {
        return this.desc;
    }

    private static void init() {
        for (AuditLastBisStateEnum c : AuditLastBisStateEnum.values()){
            auditLastBisStateMap.put(c.getCode(), c);
            auditLastBisStateNameMap.put(c.getCode(), c.desc);
        }
    }
    
    public static BusinessState getEnum(Integer code) {
        if (CollectionUtils.isEmpty(auditLastBisStateMap)) {
            init();
        }
        return auditLastBisStateMap.get(code);
    }
    
    public static String getName(Integer code) {
        if (CollectionUtils.isEmpty(auditLastBisStateNameMap)) {
            init();
        }
        return auditLastBisStateNameMap.get(code);
    }
}
