/**   
 * @Title: CreditLoanProtocolDto.java 
 * @Package: com.myph.sign.dto
 * @company: 麦芽金服
 * @Description: TODO
 * @date 2016年11月3日 下午2:37:58 
 * @version V1.0   
 */
package com.myph.sign.dto;

import java.math.BigDecimal;

import com.myph.common.bean.BaseInfo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/** 
 * 1.信用贷借款协议A版
 * @ClassName: CreditLoanProtocolDto 
 * @Description: TODO
 * @author hf 
 * @date 2016年11月3日 下午2:37:58 
 *  
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class ContractModelView extends BaseInfo {
	
	private String signAddress;//签署地
	
	private int signYear;
	
	private int signMonth;
	
	private int signDay;
	
	private String borrower;//借款人/客户
	
	private String phone;//手机号
	
	private String idCardNo;//身份證賬號
	
	private String presentAddress;//现住址
	
	private String loanPopurse;//借款用途
	
	private BigDecimal contractAmount;//借款本金数额
	
	private String contractAmountCN;//借款本金数额
	
	private BigDecimal principal;//月还款本息数额
	
	private String principalCN;//月还款本息数额
	
	private String contractCN;//月还款本息数额
	
	private int productPeriods;//还款分期月数(产品期数)
	
	private String bankNo;//卡号
	
	private String bankName;//开户行
	
	private String[] repayMoneyArray;//借款本金数额
	
	private String[] principalArray;//月还款本息数额
	
	private int repayMoneyLength;
	
	private int principalLength;
	
	private String loanNo;//借款编号
	
	private String serviceMoneyCN;//咨询费、审核费、服务费
	
	private BigDecimal serviceMoney;//咨询费、审核费、服务费
	
	private String totalCostCN;//费用合计
	
	private BigDecimal totalCost;//费用合计

	private String securityFundCN;//风险金
	
	private BigDecimal securityFund;//风险金
	
	private String productName;//产品名称
	
	private String caseNumber;//案件编号
	
	private String workTelephone;//单位电话
	
}