package com.myph.loan.dto;

import java.math.BigDecimal;

import com.myph.apply.dto.ApplyInfoDto;
import com.myph.common.constant.Constants;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class LoanedInfoDto extends ApplyInfoDto {
    /**
     * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
     */
    private static final long serialVersionUID = 716036151170967666L;

    private String createUser;

    private Long createUserId;
    
    private String createUserName;
    
    private Integer status;

    private BigDecimal repaymentAmount;
    
    private BigDecimal serviceRate;
    
    private BigDecimal interestAmount;
    
    private BigDecimal contractAmount;
    
    private BigDecimal repayMoney;
    
    public String getStatusName(){
        if(null == this.status){
            return "未放款";
        }
        if(this.status.equals(Constants.YES_INT)){
            return "已放款";
        }else{
            return "未放款";
        }
    }

}