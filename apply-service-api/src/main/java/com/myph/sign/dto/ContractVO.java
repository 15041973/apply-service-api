/**   
 * @Title: ContractVO.java 
 * @Package: com.myph.sign.dto
 * @company: 麦芽金服
 * @Description: TODO
 * @date 2016年10月18日 下午6:47:09 
 * @version V1.0   
 */
package com.myph.sign.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.myph.common.bean.BaseInfo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @ClassName: ContractVO
 * @Description: TODO
 * @author hf
 * @date 2016年10月18日 下午6:47:09
 * 
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class ContractVO extends BaseInfo {

	/**
	 * @Fields serialVersionUID : TODO
	 */
	private static final long serialVersionUID = -1490468691764329229L;

	private String applyLoanNo; // 申请件单号

	private String contractNo; // 合同单号

	private String liveAddress; // 现住址详细地址

	private String mailAddress; // 邮寄地址

	private String memberName;// 客户

	private String phone;// 手机号

	private String idCard;// 身份证号

	private String bmName;// 业务经理

	private String customerSName;// 客服

	private BigDecimal applyMoney;// 贷款申请金额

	private BigDecimal auditRatifyMoney;// 信审审批金额

	private BigDecimal repayMoney;// 签约金额

	private BigDecimal totalRate;// 综合服务费

	private String productName;// 产品名称

	private Integer periods;// 贷款期数

	private String bankType;// 银行名

	private Date loanTime;// 放款日期

	private String bankCardNo;// 银行名卡号

	private String bankCity;// 开户城市

	private String bankName;// 开户行

	private Integer interviewResults;// 面签结果

	private String remark;// 备注

}
