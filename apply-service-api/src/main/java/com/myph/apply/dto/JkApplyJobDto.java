/**   
 * @Title: JkApplyJobDto.java 
 * @Package: com.myph.apply.dto
 * @company: 麦芽金服
 * @Description: TODO
 * @date 2016年9月12日 下午8:21:54 
 * @version V1.0   
 */
package com.myph.apply.dto;

import java.util.Date;

import com.myph.common.bean.BaseInfo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 申请件工作信息
 * 
 * @ClassName: JkApplyJobDto
 * @Description: TODO
 * @author hf
 * @date 2016年9月12日 下午8:21:54
 * 
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class JkApplyJobDto extends BaseInfo {

	/**
	 * @Fields serialVersionUID : TODO
	 */
	private static final long serialVersionUID = 5144427158131074209L;

	private Long id;

	private String applyLoanNo;

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

	private String otherPositionsCode;

	private Integer otherBusinessType;

	private Integer otherCompanyNature;

	private Date createTime;

	private String createUser;

	private Date modifyTime;

	private String modifyUser;

	private String alternatePhone;

	private Integer state;
}
