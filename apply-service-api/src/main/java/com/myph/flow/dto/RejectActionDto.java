package com.myph.flow.dto;

import com.myph.constant.FlowStateExchangeEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * INFO: 系统拒绝客户事件dto
 * User: zhaokai
 * Date: 2016/9/7 - 10:27
 * Version: 1.0
 * History: <p>如果有修改过程，请记录</P>
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class RejectActionDto extends BaseActionDto {
    public RejectActionDto() {
        super.exchangeEnum = FlowStateExchangeEnum.REJECT;
    }

    //禁闭期，单位 天
    private Integer rejectDays;


}
