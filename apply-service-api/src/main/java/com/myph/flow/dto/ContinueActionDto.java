package com.myph.flow.dto;

import java.math.BigDecimal;

import com.myph.constant.FlowStateExchangeEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * INFO: 继续下阶段dto User: zhaokai Date: 2016/9/7 - 10:27 Version: 1.0 History:
 * <p>
 * 如果有修改过程，请记录
 * </P>
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class ContinueActionDto extends BaseActionDto {
    /**
     * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
     */
    private static final long serialVersionUID = -1834204795160642616L;

    private Boolean toSign = false;

    public ContinueActionDto() {
        super.exchangeEnum = FlowStateExchangeEnum.CONTINUE;
    }

}
