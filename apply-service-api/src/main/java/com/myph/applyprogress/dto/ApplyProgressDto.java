package com.myph.applyprogress.dto;

import java.math.BigDecimal;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import com.myph.apply.dto.ApplyInfoDto;
import com.myph.constant.ApplyUtils;

/**
 * 
 * @ClassName: ApplyprogressDto
 * @Description: 申请进度Dto
 * @author 王海波
 * @date 2016年9月20日 上午9:39:54
 *
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class ApplyProgressDto extends ApplyInfoDto {

    /**
     * @Fields serialVersionUID :
     */
    private static final long serialVersionUID = 6716750781670495651L;

    private String stateDesc; // 状态的中文描述信息
    
    private BigDecimal repayMoney;// 放款金额

    public String getStateDesc() {
        return ApplyUtils.getFullStateDesc(this.getState(), this.getSubState());
    }
}
