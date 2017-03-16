package com.myph.sign.dto;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.myph.common.bean.BaseInfo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class JkContractDto  extends BaseInfo {
    /** 
	 * @Fields serialVersionUID : TODO
	 */ 
	private static final long serialVersionUID = 7071254484803291303L;

	private Long id;

    private String applyLoanNo;

    private String contractNo;

    private BigDecimal totalRate;

    private BigDecimal loanLimitUp;

    private Integer overdueDay;

    private BigDecimal penalty;

    private BigDecimal repayRate;

    private Long productId;

    private String productName;

    private Integer periods;

    private BigDecimal repayMoney;

    private String bankType;

    private String bankCardNo;

    private String bankCity;

    private String bankName;

    private Date signTime;

    private Date updateTime;

    private Date createTime;

    private String createUser;

    private Integer delFlag;
    
    private BigDecimal repaymentAmount;

    private BigDecimal serviceRate;

    private BigDecimal interestAmount;

    private BigDecimal contractAmount;
    
    private Long productType;
    
    private String signResult;
    
    private String remark;
    
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date loanTime;
    
    private boolean isUpdate;
    
    private String loanPurpose;

}