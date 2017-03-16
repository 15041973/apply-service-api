package com.myph.auditCashCount.dto;

import java.math.BigDecimal;

import com.myph.common.bean.BaseInfo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class AuditCashCountDto extends BaseInfo {

    private static final long serialVersionUID = 3035847143667019447L;

    private Long id;

    private String applyLoanNo;

    private Long liabilitiesTypeNo;

    private BigDecimal oneMonth;

    private BigDecimal twoMonth;

    private BigDecimal threeMonth;

    private BigDecimal fourMonth;

    private BigDecimal fiveMonth;

    private BigDecimal sixMonth;
    
    private String nodeCode;
    
    private Integer state;

}