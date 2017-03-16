package com.myph.apply.dto;

import java.util.Date;

import com.myph.common.bean.BaseInfo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 客户工作信息DTO
 * 
 * @ClassName: MemberJob
 * @Description: TODO
 * @author hf
 * @date 2016年9月14日 下午5:14:50
 *
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class MemberJobDto extends BaseInfo {
	/**
	 * @Fields serialVersionUID : TODO
	 */
	private static final long serialVersionUID = 3390765590016947447L;

	private Long id;

	private Long memberId;

	private String unitName;

	private Integer unitNums;

	private String companyAddress;

	private Date unitCreateDate;

	private String unitTelephone;

	private String extensionNum;

	private Date accessCompanyDate;

	private Integer businessType;

	private Integer positionsCode;

	private Integer companyNature;

	private Long monthlySalary;

	private Long otherIncomes;

	private Integer salaryWay;

	private Integer salaryDay;

	private String detailAddr;

	private Integer otherBusinessType;

	private Integer otherCompanyNature;

	private String otherPositionsCode;

	private Date createTime;

	private String createUser;

	private Date modifyTime;

	private String modifyUser;

	private String alternatePhone;
}