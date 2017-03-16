package com.myph.sign.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.myph.common.bean.BaseInfo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 签约列表查询
 * @author peterhe
 *
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class SignQueryDto extends BaseInfo {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 634264234700806468L;
	
	private Long id;

	private String applyLoanNo;// 申请单号

    private String memberName;// 客户姓名

    private Long areaId; // 大区ID
    
    private String areaName;

    private Long storeId;// 门店ID

    private Long bmId;// 业务经理

    private String bmName;// 业务经理名字
    
    private String phone;

    private Long customerServiceId;// 客服

    private String customerServiceName;// 客服姓名

    private Integer state;// 状态

    private Integer subState;// 子状态
    
    private String subStateList;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date applyTimeStart;// 进件日期起

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date applyTimeEnd;// 进件日期止

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date passTimeStart;// 审核通过日期起

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date passTimeEnd;// 审核通过日期止
    
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date auditReviewTime;//审核通过日期展示
    
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createTime;//进件日期展示
    
    private String stateDesc;// 状态名称
    
    private String defaultSort;// 默认排序

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date passTime;// 信审通过时间

}
