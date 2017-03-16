package com.myph.reception.dto;

import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import com.myph.common.bean.BaseEntity;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class ApplyReceptionManageDto extends BaseEntity {
    private static final long serialVersionUID = 5633366755540758011L;

    private Long id;

    private String customerServiceIds;

    private Long newCustomerServiceId;

    private String newCustomerSName;

    private Long oldCustomerServiceId;

    private Long storeId;

    private String applyLoanNo;

    private Date createTime;// 创建时间

    private String createUser;// 创建人

    private String description;// 描述

}