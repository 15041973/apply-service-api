package com.myph.constant.bis;

import java.util.Map;

import org.springframework.util.CollectionUtils;

import com.google.common.collect.Maps;
import com.myph.common.util.ResultCodeUtils;
import com.myph.constant.BusinessState;
import com.myph.constant.FlowStateEnum;

/**
 * INFO: 定义 签约发起外访阶段的业务状态
 */
public enum SignBisStateEnum implements BusinessState {

    INIT(1, "待签约"), PASSED(2, "签约通过"), REJECT(3, "签约拒绝"),BACK_INIT(10,"合规退回");

    SignBisStateEnum(int code, String desc) {

        this.code = code;
        this.desc = desc;
    }

    private int code;
    
    private String desc;
    
    private static final Map<Integer, SignBisStateEnum> signBisStateMap = Maps.newHashMap();

    @Override
    public Integer getCode() {
        // 转成2为长度的code码，不足两位前面补齐0
        return ResultCodeUtils.getResultCode(FlowStateEnum.SIGN.getCode() + "",
                ResultCodeUtils.formatString(code, 2));
    }

    @Override
    public String getDesc() {
        return this.desc;
    }

    private static void init() {
        for (SignBisStateEnum c : SignBisStateEnum.values()){
            signBisStateMap.put(c.getCode(), c);
        }
    }
    
    public static BusinessState getEnum(Integer code) {
        if (CollectionUtils.isEmpty(signBisStateMap)) {
            init();
        }
        return signBisStateMap.get(code);
    }
}
