package com.myph.constant;

import com.myph.constant.bis.*;

/**
 * INFO: info User: zhaokai Date: 2016/9/14 - 15:56 Version: 1.0 History:
 * <p>
 * 如果有修改过程，请记录
 * </P>
 */

public class ApplyUtils {
    /**
     * 获取当前申请单 完整的状态描述
     * 
     * @param state
     * @param subState
     * @return
     */
    public static String getFullStateDesc(Integer state, Integer subState) {
        FlowStateEnum flowStateEnum = FlowStateEnum.getEnum(state);
        if (null == flowStateEnum) {
            return "";
        }
        BusinessState businessState = null;
        switch (flowStateEnum) {
            case APPLY:
                businessState = ApplyBisStateEnum.getEnum(subState);
                break;
            case AUDIT_FIRST:
                businessState = AuditFirstBisStateEnum.getEnum(subState);
                break;
            case EXTERNAL_FIRST:
                businessState = ExternalFirstBisStateEnum.getEnum(subState);
                break;
            case AUDIT_LASTED:
                businessState = AuditLastBisStateEnum.getEnum(subState);
                break;
            case EXTERNAL_LAST:
                businessState = ExternalLastBisStateEnum.getEnum(subState);
                break;
            case SIGN:
                businessState = SignBisStateEnum.getEnum(subState);
                break;
            case CONTRACT:
                businessState = ContractBisStateEnum.getEnum(subState);
                break;
            case FINANCE:
                businessState = FinanceBisStateEnum.getEnum(subState);
                break;
            case FINISH:
                businessState = FinishBisStateEnum.getEnum(subState);
                break;
            case AUDIT_DIRECTOR:
                businessState = AuditDirectorBisStateEnum.getEnum(subState);
                break;
            case AUDIT_MANAGER:
                businessState = AuditManagerBisStateEnum.getEnum(subState);
                break;
            case REJECT:// 如果是客户放弃或拒绝的话 描述需要特殊处理下

                return (null == FlowStateEnum.getEnum(subState)) ? flowStateEnum.getDesc() : FlowStateEnum.getEnum(
                        subState).getDesc()
                        + "拒绝";
            case ABANDON:
                return flowStateEnum.getDesc();
            default:
                break;
        }
        return (null == businessState) ? "" : businessState.getDesc();

    }
    /**
     * 获取当前申请单 完整的状态描述
     * 
     * @param state
     * @param subState
     * @return
     */
    public static String getAuaditStateDesc(Integer subState) {
        String businessState = null;
        if(null == businessState){
            businessState =  ApplyBisStateEnum.getName(subState);
        }
        if(null == businessState){
            businessState =  AuditFirstBisStateEnum.getName(subState);
        }
        if(null == businessState){
            businessState =  AuditLastBisStateEnum.getName(subState);
        }
        if(null == businessState){
            businessState =  AuditManagerBisStateEnum.getName(subState);
        }
        if(null == businessState){
            businessState =  AuditDirectorBisStateEnum.getName(subState);
        }
        return businessState == null?"":businessState;
    }
}
