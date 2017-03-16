package com.myph.constant.bis;

import java.util.Map;

import org.springframework.util.CollectionUtils;

import com.google.common.collect.Maps;
import com.myph.common.util.ResultCodeUtils;
import com.myph.constant.BusinessState;
import com.myph.constant.FlowStateEnum;

/**
 * INFO: 定义 合规发起外访阶段的业务状态
 */
public enum ContractBisStateEnum implements BusinessState {

    INIT(1, "待合规"), PASSED(2, "合规通过"), REJECT(3, "合规拒绝");

    ContractBisStateEnum(int code, String desc) {

        this.code = code;
        this.desc = desc;
    }

    private int code;
    
    private String desc;
    
    private static final Map<Integer, ContractBisStateEnum> contractBisStateMap = Maps.newHashMap();


    @Override
    public Integer getCode() {
        // 转成2为长度的code码，不足两位前面补齐0
        return ResultCodeUtils.getResultCode(FlowStateEnum.CONTRACT.getCode() + "",
                ResultCodeUtils.formatString(code, 2));
    }

    @Override
    public String getDesc() {
        return this.desc;
    }

    private static void init() {
        for (ContractBisStateEnum c : ContractBisStateEnum.values()){
            contractBisStateMap.put(c.getCode(), c);
        }
    }
    
    public static BusinessState getEnum(Integer code) {
        if (CollectionUtils.isEmpty(contractBisStateMap)) {
            init();
        }
        return contractBisStateMap.get(code);
    }
}
