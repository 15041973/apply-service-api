package com.myph.allot.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.myph.apply.dto.ApplyInfoDto;
import com.myph.common.bean.BaseInfo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class AllotLogDto extends BaseInfo{
    /** 
     * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
     */ 
    private static final long serialVersionUID = -999002155839891972L;

    private Long id;

    private String applyLoanNo;

    private Integer auditStage;

    private String oldAuditUser;

    private String newAuditUser;
}