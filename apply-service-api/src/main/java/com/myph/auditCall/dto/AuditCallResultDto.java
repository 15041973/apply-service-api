package com.myph.auditCall.dto;


import com.myph.common.bean.BaseInfo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class AuditCallResultDto extends BaseInfo {
    
    private static final long serialVersionUID = 2169249449857322596L;

    private Long id;
 
    private String applyLoanNo;

    private Integer ifMyself;

    private Integer ifSign;

    private Integer ifBasicInfoSame;

    private Integer hastCPF;

    private Integer hasLoan;

}