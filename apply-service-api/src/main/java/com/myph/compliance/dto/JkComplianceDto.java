package com.myph.compliance.dto;

import java.util.Date;

import com.myph.common.bean.BaseInfo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class JkComplianceDto extends BaseInfo{
 
    private static final long serialVersionUID = 6343600352774937157L;

    private Long id;
    
    private String applyLoanNo;

    private Integer result;

    private String remark;

    private Date updateTime;

    private Integer delFlag;

    private Date createTime;

    private String createUser;

}