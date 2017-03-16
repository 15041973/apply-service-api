package com.myph.mqSendLog.dto;

import java.util.Date;

import com.myph.common.bean.BaseInfo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class JkMqLogDto extends BaseInfo {
	private static final long serialVersionUID = 3230863318146797336L;

	private Long id;

	private String param;

	private String applyLoanNo;

	private Integer isReSend;

	private Date createTime;

	private Date lastSendTime;

	private Integer time;

}