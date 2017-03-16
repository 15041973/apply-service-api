package com.myph.apply.dto;

import java.util.Date;

import com.myph.common.bean.BaseInfo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class ApplyProgressDto extends BaseInfo {
	
	private static final long serialVersionUID = 1L;
	
	private int status; // 状态
	
	private Date time; // 时间
	
	private String desc; // 描述
}
