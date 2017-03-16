package com.myph.flow.dto;

import com.myph.common.bean.BaseInfo;
import com.myph.constant.ApplyUtils;
import com.myph.constant.FlowStateExchangeEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * INFO: 流程阶段动作dto：包含动作前相关属性 以后动作后相关属性
 * User: zhaokai
 * Date: 2016/9/7 - 10:27
 * Version: 1.0
 * History: <p>如果有修改过程，请记录</P>
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class ProcessResultDto extends BaseInfo {
    //申请件 单号
    protected String applyLoanNo;
    //客户身份证
    protected String applyLoanUserCard;

    //当前操作人
    protected String operateUser;

    protected FlowStateExchangeEnum exchangeEnum;

    //动作完成后的流程状态
    private Integer destFlowState;

    //动作完成后的业务状态
    private Integer destBisState;

    //原始流程类型
    private Integer srcFlowState;

    //原始业务类型
    private Integer srcBisState;

    //状态的中文描述信息
    private String stateDesc;


    public String getStateDesc() {
        return ApplyUtils.getFullStateDesc(this.destFlowState, this.destBisState);
    }
}
