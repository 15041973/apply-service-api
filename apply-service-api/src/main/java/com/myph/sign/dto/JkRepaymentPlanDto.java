package com.myph.sign.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.myph.common.bean.BaseInfo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 还款计划
 * @ClassName: JkRepaymentPlan 
 * @Description: TODO
 * @author hf 
 * @date 2016年10月28日 上午10:29:14 
 *
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class JkRepaymentPlanDto extends BaseInfo {
    /** 
	 * @Fields serialVersionUID : TODO
	 */ 
	private static final long serialVersionUID = 1052640524064604495L;

	private Long id;

    private String applyLoanNo;

    private String contractNo;

    private Integer repayPeriod;

    private Date agreeRepayDate;

    private Date repayDate;

    private Integer repayState;

    private BigDecimal initialPrincipal;

    private BigDecimal principal;

    private BigDecimal interest;

    private BigDecimal reapyAmount;

    private BigDecimal endPrincipal;

    private BigDecimal aheadAmount;

    private BigDecimal returnAmount;

    private Date updateTime;

    private Date createTime;

    private String createUser;

    private Integer delflag;

}