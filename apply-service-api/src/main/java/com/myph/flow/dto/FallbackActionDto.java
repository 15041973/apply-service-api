package com.myph.flow.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import com.myph.constant.FlowStateExchangeEnum;

/**
 * INFO: 回调事件的dto User: zhaokai Date: 2016/9/7 - 10:27 Version: 1.0 History:
 * <p>
 * 如果有修改过程，请记录
 * </P>
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class FallbackActionDto extends BaseActionDto {
    public FallbackActionDto() {
        super.exchangeEnum = FlowStateExchangeEnum.FALLBACK;
    }

    // 回调
    private Long recptUserId;
    // 回退建议
    private String publicRemark;

    // 回退建议
    private String backCause;

}
