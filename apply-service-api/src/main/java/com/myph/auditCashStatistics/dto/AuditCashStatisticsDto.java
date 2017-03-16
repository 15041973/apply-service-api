package com.myph.auditCashStatistics.dto;

import java.math.BigDecimal;
import com.myph.common.bean.BaseInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class AuditCashStatisticsDto extends BaseInfo  {

    private static final long serialVersionUID = -1392576645143045078L;

    private Long id;

    private String applyLoanNo;

    private String businessType;

    private BigDecimal profits;

    private BigDecimal shareRatio;

    private BigDecimal debtRratio;

}