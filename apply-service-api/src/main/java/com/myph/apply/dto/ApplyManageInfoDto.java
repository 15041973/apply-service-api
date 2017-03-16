/**   
 * @Title: ApplyManageInfoDto.java 
 * @Package: apply_manage
 * @company: 麦芽金服
 * @Description: TODO
 * @date 2016年9月24日 下午3:58:18 
 * @version V1.0   
 */
package com.myph.apply.dto;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.myph.common.bean.BaseInfo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @ClassName: ApplyManageInfoDto
 * @Description: TODO
 * @author hf
 * @date 2016年9月24日 下午3:58:18
 * 
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class ApplyManageInfoDto extends BaseInfo {

	/**
	 * @Fields serialVersionUID : TODO
	 */
	private static final long serialVersionUID = -3521690911677322125L;

	private Long id;

	private String applyLoanNo;

	private String memberName;

	private String nameSpell;

	private String phone;

	private String idCard;

	private Long cityId;

	private Long storeId;

	private Long areaId;

	private Long bmId;

	private Long customerServiceId;

	private String bmName;

	private String customerSName;

	private String memberType;

	private String infoChannel;

	private Long loanPurpose;

	private BigDecimal affordMonthpay;

	private String applyRemark;

	private Long productType;

	private BigDecimal expectLoan;

	private String loanPurposes;

	private Integer loanPeriods;

	private BigDecimal applyMoney;

	private BigDecimal auditRatifyMoney;

	private Integer subState;

	private Integer state;

	private Integer clientType;

	private Date loanTime;

	private Date signTime;

	private Integer delFlag;

	private Date createTime;

	private String createuser;

	private Date updateTime;

	private String modifyUser;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date applyTimeStart;// 进件日期起

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date applyTimeEnd;// 进件日期止

	private String storeName;// 门店名称

	private String stateDesc;// 状态名称
	
	private String subStateList;
	
	private String defaultSort;// 默认排序
}
