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
public enum FinanceBisStateEnum implements BusinessState {

    INIT(1, "待放款");

    FinanceBisStateEnum(int code, String desc) {

        this.code = code;
        this.desc = desc;
    }

    private int code;
    
    private String desc;
    
    private static final Map<Integer, FinanceBisStateEnum> financeBisStateMap = Maps.newHashMap();

    @Override
    public Integer getCode() {
        // 转成2为长度的code码，不足两位前面补齐0
        return ResultCodeUtils.getResultCode(FlowStateEnum.FINANCE.getCode() + "",
                ResultCodeUtils.formatString(code, 2));
    }

    @Override
    public String getDesc() {
        return this.desc;
    }

    private static void init() {
        for (FinanceBisStateEnum c : FinanceBisStateEnum.values()){
            financeBisStateMap.put(c.getCode(), c);
        }
    }
    
    public static BusinessState getEnum(Integer code) {
        if (CollectionUtils.isEmpty(financeBisStateMap)) {
            init();
        }
        return financeBisStateMap.get(code);
    }
}
