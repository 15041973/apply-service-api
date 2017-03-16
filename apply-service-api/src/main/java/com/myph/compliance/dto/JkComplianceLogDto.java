package com.myph.compliance.dto;

import java.util.Date;

import com.myph.common.bean.BaseEntity;
import com.myph.common.bean.BaseInfo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class JkComplianceLogDto extends BaseInfo{

    private static final long serialVersionUID = -8463406758426163284L;

    private Long id;
    
    private String applyLoanNo;

    private Integer result;

    private String remark;

    private Date updateTime;

    private Integer delFlag;

    private Date createTime;

    private String createUser;

}