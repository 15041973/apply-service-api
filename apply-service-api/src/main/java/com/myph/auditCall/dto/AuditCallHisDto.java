package com.myph.auditCall.dto;

import java.util.Date;

import com.myph.common.bean.BaseInfo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class AuditCallHisDto extends BaseInfo {

    private static final long serialVersionUID = -5026463305158023863L;

    private Long id;

    private String applyLoanNo;

    private String phone;

    private Integer type;

    private String remark;

    private Date time;

}