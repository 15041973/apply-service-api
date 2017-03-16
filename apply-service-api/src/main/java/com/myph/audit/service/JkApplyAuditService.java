/**   
 * @Title: JkApplyAudit.java 
 * @Package: com.myph.audit.service
 * @company: 麦芽金服
 * @Description: TODO
 * @date 2016年9月20日 下午7:08:50 
 * @version V1.0   
 */
package com.myph.audit.service;

import java.util.List;

import com.myph.apply.dto.JkAuditDto;
import com.myph.apply.dto.JkAuditTaskDto;
import com.myph.common.result.ServiceResult;
import com.myph.common.rom.annotation.BasePage;
import com.myph.common.rom.annotation.Pagination;

/**
 * 信审任务服务
 * 
 * @ClassName: JkApplyAudit
 * @Description: TODO
 * @author hf
 * @date 2016年9月20日 下午7:08:50
 * 
 */
public interface JkApplyAuditService {

	/**
	 * 初审/复审人员查询已办/待办申请单
	 * 
	 * @名称 getFirstJkApply
	 * @描述 TODO
	 * @返回类型 ServiceResult<List<JkAuditVO>>
	 * @日期 2016年9月20日 下午7:37:51
	 * @创建人 hf
	 * @更新人 hf
	 *
	 */
	ServiceResult<Pagination<JkAuditDto>> getJkApplyAuditByTODO(JkAuditDto jkAuditDto, BasePage basePage);

	/**
	 * 初审/复审人员查询已办/待办申请单
	 * 
	 * @名称 getFirstJkApply
	 * @描述 TODO
	 * @返回类型 ServiceResult<Pagination<JkAuditVO>>
	 * @日期 2016年9月20日 下午7:37:51
	 * @创建人 hf
	 * @更新人 hf
	 *
	 */
	ServiceResult<Pagination<JkAuditDto>> getJkApplyAuditByDONE(JkAuditDto jkAuditDto, BasePage basePage);

	/**
	 * 取件
	 * 
	 * @param applyLoanNo
	 * 
	 * @名称 pickup
	 * @描述 TODO
	 * @返回类型 ServiceResult<String>
	 * @日期 2016年9月21日 下午11:24:40
	 * @创建人 hf
	 * @更新人 hf
	 *
	 */
	ServiceResult<String> pickup(JkAuditTaskDto jkAuditTaskDto);

	ServiceResult<JkAuditTaskDto> queryInfoByApplyLoanNo(String applyLoanNo);

	/**
	 * 获取未处理的进件
	 * 
	 * @param integer
	 * 
	 * @名称 getAudits
	 * @描述 TODO
	 * @返回类型 List<JkAuditTask>
	 * @日期 2016年9月22日 下午3:19:18
	 * @创建人 hf
	 * @更新人 hf
	 *
	 */
	ServiceResult<Integer> getAudits(String auditor, Integer code);

	ServiceResult<List<JkAuditTaskDto>> getAuditResult(String auditor, Integer code);

}
