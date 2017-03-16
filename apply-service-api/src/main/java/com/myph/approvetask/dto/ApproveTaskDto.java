package com.myph.approvetask.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.myph.common.bean.BaseInfo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class ApproveTaskDto extends BaseInfo{
    /** 
     * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
     */ 
    private static final long serialVersionUID = 7242017750569322488L;

    private Long id;

    private String applyLoanNo;

    private Long firstAuditor;

    private Long reviewAuditor;

    private Integer auditState;
    
    private String auditStateName;

    private Integer auditResult;

    private String mainCauseNo;

    private String mainCause;

    private String secondCauseNo;

    private String secondCause;

    private Long productTypeNo;
    
    private Long proId;
    
    private String productName;

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
    
    private Integer confinementTime;
    
    private Date auditLastDate;
    
    private Date auditSuperLastDate;
    
    private Long lastAuditor;

    private Long superLastAuditor;
    
    private Date passTime;

}