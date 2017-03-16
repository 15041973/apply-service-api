package com.myph.apply.dto;

import com.myph.common.bean.BaseInfo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 申请件联系人表
 * 
 * @ClassName: JkApplyLinkmanDto
 * @Description: TODO
 * @author hf
 * @date 2016年9月18日 上午10:08:10
 *
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class JkApplyLinkmanDto extends BaseInfo {

	/**
	 * @Fields serialVersionUID : TODO
	 */
	private static final long serialVersionUID = 2351326240098732020L;

	private Long id;

	private String applyLoanNo;

	private Integer linkManType;

	private String linkManName;

	private String linkManPhone;

	private String linkManRelation;

	private String linkManKnowLoan;

	private String linkManHomeAddress;

	private String linkManHomeName;

	private String linkManCompanyName;

	private String linkManCompanyAddress;

	private String linkManCompanyAddr;

	private String createTime;

	private String createUser;

	private String modifyTime;

	private String modifyUser;

	private Integer state;
}