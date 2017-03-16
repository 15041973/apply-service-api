package com.myph.constant.bis;

import java.util.Map;

import org.springframework.util.CollectionUtils;

import com.google.common.collect.Maps;
import com.myph.common.util.ResultCodeUtils;
import com.myph.constant.BusinessState;
import com.myph.constant.FlowStateEnum;

/**
 * INFO: 定义 终审发起外访阶段的业务状态
 */
public enum ExternalLastBisStateEnum implements BusinessState {

    INIT(1, "待派件"), ALLOT(2, "待外访"), PASSED(3, "外访通过"), REJECT(4, "外访拒绝");

    ExternalLastBisStateEnum(int code, String desc) {

        this.code = code;
        this.desc = desc;
    }

    private int code;
    
    private String desc;
    
    private static final Map<Integer, ExternalLastBisStateEnum> externalLastBisStateMap = Maps.newHashMap();

    @Override
    public Integer getCode() {
        // 转成2为长度的code码，不足两位前面补齐0
        return ResultCodeUtils.getResultCode(FlowStateEnum.EXTERNAL_LAST.getCode() + "",
                ResultCodeUtils.formatString(code, 2));
    }

    @Override
    public String getDesc() {
        return this.desc;
    }

    public Integer getSubCode() {
        return code;
    }

    private static void init() {
        for (ExternalLastBisStateEnum c : ExternalLastBisStateEnum.values()){
            externalLastBisStateMap.put(c.getCode(), c);
        }
    }
    
    public static BusinessState getEnum(Integer code) {
        if (CollectionUtils.isEmpty(externalLastBisStateMap)) {
            init();
        }
        return externalLastBisStateMap.get(code);
    }
}
