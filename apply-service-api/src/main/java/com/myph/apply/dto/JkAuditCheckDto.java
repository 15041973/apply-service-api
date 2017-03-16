package com.myph.apply.dto;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.myph.common.bean.BaseInfo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 信审征信核查DTO
 * 
 * @ClassName: JkAuditCheckDto
 * @Description: TODO
 * @author hf
 * @date 2016年9月27日 下午3:23:08
 *
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class JkAuditCheckDto extends BaseInfo {
	/**
	 * @Fields serialVersionUID : TODO
	 */
	private static final long serialVersionUID = -3887344862226516948L;

	private Long id;

	private String applyLoanNo;

    private Integer houseLoanSum;

    private Integer otherLoanSum;

    private Integer creditCardSum;

    private String accountState;

    private String dgzCount;

    private String securityLevel;

    private String selfSecurityLevel;

    private BigDecimal creditDemurrageMoney;

    private Integer creditSixMOverdueThree;

    private Integer creditSixMOverdueTwo;

    private Integer creditOneMOverdueThree;

    private Integer creditTwoMOverdueSeven;

    private BigDecimal loanDemurrageMoney;

    private Integer loanThreeMEnsureLoan;

    private Integer loanSixMOverueThree;

    private Integer loanSixMOverdueTwo;

    private Integer loanOneMOverdueThree;

    private Integer loanTwoMOverdueSeven;

    private Integer unCnacleCreCradAmount;

    private Integer ifZeroCreditSum;

    private BigDecimal creditAmountSum;

    private BigDecimal creditAmountUseSum;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date pionCardDate;

    private BigDecimal sixMavglimit;

    private Integer cardlimitupeighty;

    private Integer noPayLoanNum;

    private BigDecimal noPayRemain;

    private BigDecimal sixAvgRepay;

    private Integer assureNum;

    private BigDecimal assureMoney;

    private BigDecimal assureRemain;

    private Long houseMortRemain;

    private BigDecimal houseMPay;

    private BigDecimal carLoanRemain;

    private BigDecimal carMPay;

    private BigDecimal elseLoanRemain;

    private BigDecimal elseLoanMPay;

    private Integer searchNum;

    private Integer userType;

}