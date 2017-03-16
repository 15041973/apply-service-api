package com.myph.flow.dto;

import com.alibaba.fastjson.JSONObject;
import com.myph.common.bean.BaseInfo;
import com.myph.constant.FlowStateEnum;
import com.myph.constant.FlowStateExchangeEnum;
import lombok.*;

/**
 * INFO: 针对 统一流程转换管理期的参数做统一基础属性设置
 * User: zhaokai
 * Date: 2016/9/7 - 10:27
 * Version: 1.0
 * History: <p>如果有修改过程，请记录</P>
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class BaseActionDto extends BaseInfo {
    //申请件 单号
    protected String applyLoanNo;

    //当前操作人名称
    protected String operateUser;

    //当前操作人ID
    protected Long operateUserId;
    //赋属值
    protected JSONObject doc;
    
    @Setter(AccessLevel.PROTECTED)
    protected FlowStateExchangeEnum exchangeEnum;

    protected FlowStateEnum flowStateEnum;


}
