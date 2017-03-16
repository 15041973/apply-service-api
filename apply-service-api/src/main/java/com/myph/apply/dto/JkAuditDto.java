/**   
 * @Title: JkAuditVO.java 
 * @Package: com.myph.apply.dto
 * @company: 麦芽金服
 * @Description: TODO
 * @date 2016年9月20日 下午7:11:28 
 * @version V1.0   
 */
package com.myph.apply.dto;

import java.util.Date;

import com.myph.common.bean.BaseInfo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 审批列表VO
 * 
 * @ClassName: JkAuditVO
 * @Description: TODO
 * @author hf
 * @date 2016年9月20日 下午7:11:28
 * 
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class JkAuditDto extends BaseInfo {

	/**
	 * @Fields serialVersionUID : TODO
	 */
	private static final long serialVersionUID = -3589314676295810086L;

	private Long id;

	private String applyLoanNo;

	private String memberName;

	private Long storeId;

	private String storeName;

	private Date fetchTime;// 取件日期

	private int subState;

	private Date applyTime;// 进件日期

	private Date auditFirstTime;// 初审日期

	private Date auditReviewTime;// 复审日期

	private Long employeeId;// 信审人员ID

	private String progress;// 待办/已办

	private String auditor;
	
	private String stateList;// 主状态
	
	private String subStateList;// 子状态

	private Integer state;// 主状态
	
	private Integer type;//1:初审时间 2：终审时间
	
	private String stateDesc;// 状态名称
	
	private int auditState;
	
	private String defaultSort;// 默认排序
	
	private Date lastDate;// 经理终审日期

	private Date superLastDate;// 总监终审日期
}
