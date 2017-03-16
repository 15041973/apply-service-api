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
public enum AuditManagerBisStateEnum implements BusinessState {

    INIT(60, "待终审"),
    FINISH(61,"终审通过"),
    REFUSE(62,"终审拒绝"),
    BACK_INIT(64, "高级终审回退");

    AuditManagerBisStateEnum(int code, String desc) {

        this.code = code;
        this.desc = desc;
    }

    private int code;
    
    private String desc;
    
    private static final Map<Integer, String> auditLastBisStateNameMap = Maps.newHashMap();
    
    private static final Map<Integer, AuditManagerBisStateEnum> auditLastBisStateMap = Maps.newHashMap();

    @Override
    public Integer getCode() {
        // 转成2为长度的code码，不足两位前面补齐0
        return ResultCodeUtils.getResultCode(FlowStateEnum.AUDIT_MANAGER.getCode() + "",
                ResultCodeUtils.formatString(code, 2));
    }

    @Override
    public String getDesc() {
        return this.desc;
    }

    private static void init() {
        for (AuditManagerBisStateEnum c : AuditManagerBisStateEnum.values()){
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