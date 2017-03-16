package com.myph.apply.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.myph.common.bean.BaseInfo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 信审任务
 * 
 * @ClassName: JkAuditTaskDto
 * @Description: TODO
 * @author hf
 * @date 2016年9月22日 下午2:52:38
 *
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class JkAuditTaskDto extends BaseInfo {
	/**
	 * @Fields serialVersionUID : TODO
	 */
	private static final long serialVersionUID = -8862292128021859716L;

	private Long id;

	private String applyLoanNo;

	private Long firstAuditor;

	private Long reviewAuditor;
	
	private Long lastAuditor;

	private Long superLastAuditor;

	private Integer auditState;

	private Integer auditResult;

	private String mainCauseNo;

	private String mainCause;

	private String secondCauseNo;

	private String secondCause;

	private String productTypeNo;

	private Integer loanPeriods;

	private BigDecimal creditMoney;

	private String internalRemark;

	private Integer dataIfSame;

	private String dataCheckRemark;

	private String externalRemark;

	private Date updateTime;

	private Date createTime;

	private Date auditFirstTime;

	private Date auditReviewTime;

	private Integer delFlag;

	private String createUser;

	private Date fetchTime;

}