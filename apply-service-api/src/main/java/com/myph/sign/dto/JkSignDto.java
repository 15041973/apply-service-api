package com.myph.sign.dto;

import java.util.Date;

import com.myph.common.bean.BaseInfo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 签约
 * @author peterhe
 *
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class JkSignDto extends BaseInfo{
	
    private Long id;

    private String applyLoanNo;

    private String signResult;

    private String remark;

    private Date updateTime;

    private Date createTime;

    private String createUser;
    
    private Long createUserId;

    private Integer delFlag;

}