package com.myph.apply.dto;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.myph.common.bean.BaseInfo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class ComplianceDto extends BaseInfo {

    private static final long serialVersionUID = 9080787660458827927L;

    private String applyLoanNo;// 申请单编号

    private String contractNo;// 合同号

    private String memberName;// 客户

    private Long areaId;// 大区ID

    private String areaName;// 大区名称

    private Long storeId;// 门店ID

    private String storeName;// 门店名称

    private Long productType;// 产品类型

    private Long productId;// 产品类型
    
    private String stringProductId;//产品listID String形式

    private String productName;// 产品名称

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date submitDates;// 查询进件起始日期

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date submitDatee;// 查询进件结束日期

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date signTimeDates;// 查询签约起始日期

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date signTimeDatee;// 查询签约结束日期

    private Date createTime;// 进件日期

    private Date signTime;// 签约日期
    
    private Date complianceTime;// 合规日期
    
    private Integer result;//合规结果

    private String auditor;// 审批人

    private Integer state;// 子状态

    private Integer subState;// 子状态

    private String stateName;// 状态名称

    private String progress;// 代办or已办
    
    private Integer isManager;//是否管理员
}
