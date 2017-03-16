package com.myph.constant.bis;

import java.util.Map;

import org.springframework.util.CollectionUtils;

import com.google.common.collect.Maps;
import com.myph.common.util.ResultCodeUtils;
import com.myph.constant.BusinessState;
import com.myph.constant.FlowStateEnum;

/**
 * INFO: 定义进件阶段的业务状态
 */
public enum ApplyBisStateEnum implements BusinessState {
    INIT(1, "申请信息录入"),
    WORKINFO(2, "工作信息录入"),
    PERSON_ASSETS(3,"个人资产录入"),
    COMPOSITE_OPINION(4,"综合意见录入"),
    FINISH(5,"征信获取中"),
    REFUSE(6,"申请拒绝"),
    LINKMAN_INPUT(7,"联系人信息录入"),
    BACK_INIT(41,"初审退回");
    


    ApplyBisStateEnum(int code, String desc) {

        this.code = code;
        this.desc = desc;
    }

    private int code;
    
    private String desc;

    private static final Map<Integer, String> applyBisStateNameMap = Maps.newHashMap();
    
    private static final Map<Integer, ApplyBisStateEnum> applyBisStateMap = Maps.newHashMap();

    @Override
    public Integer getCode() {
        // 转成2为长度的code码，不足两位前面补齐0
        return ResultCodeUtils.getResultCode(FlowStateEnum.APPLY.getCode() + "", ResultCodeUtils.formatString(code, 2));
    }

    @Override
    public String getDesc() {
        return this.desc;
    }

    private static void init() {
        for (ApplyBisStateEnum c : ApplyBisStateEnum.values()){
            applyBisStateMap.put(c.getCode(), c);
            applyBisStateNameMap.put(c.getCode(), c.desc);
        }
    }
    
    public static BusinessState getEnum(Integer code) {
        if (CollectionUtils.isEmpty(applyBisStateMap)) {
            init();
        }
        return applyBisStateMap.get(code);
    }
    public static String getName(Integer code) {
        if (CollectionUtils.isEmpty(applyBisStateNameMap)) {
            init();
        }
        return applyBisStateNameMap.get(code);
    }
}
