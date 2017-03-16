package com.myph.audit.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import com.myph.common.bean.BaseInfo;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class AuditThridInfoDto extends BaseInfo {
    private Long id;

    private String applyLoanNo;

    private String infoSource;

    private Long infoSourceNo;

    private Integer status;

    private String remark;

}