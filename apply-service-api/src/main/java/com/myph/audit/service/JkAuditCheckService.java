/**   
 * @Title: JkAuditCheckService.java 
 * @Package: com.myph.audit.service
 * @company: 麦芽金服
 * @Description: TODO
 * @date 2016年9月27日 下午3:32:23 
 * @version V1.0   
 */
package com.myph.audit.service;

import com.myph.apply.dto.JkAuditCheckDto;
import com.myph.common.result.ServiceResult;

/**
 * 信审征信核查服务
 * 
 * @ClassName: JkAuditCheckService
 * @Description: TODO
 * @author hf
 * @date 2016年9月27日 下午3:32:23
 * 
 */
public interface JkAuditCheckService {

	/**
	 * 新增
	 * 
	 * @名称 add
	 * @描述 TODO
	 * @返回类型 ServiceResult<String>
	 * @日期 2016年9月27日 下午3:34:04
	 * @创建人 hf
	 * @更新人 hf
	 *
	 */
	ServiceResult<String> add(JkAuditCheckDto jkAuditCheckDto);

	/**
	 * 更新
	 * 
	 * @名称 update
	 * @描述 TODO
	 * @返回类型 ServiceResult<String>
	 * @日期 2016年9月27日 下午3:34:04
	 * @创建人 hf
	 * @更新人 hf
	 *
	 */
	ServiceResult<String> update(JkAuditCheckDto jkAuditCheckDto);

	/**
	 * 查询
	 * 
	 * @名称 update
	 * @描述 TODO
	 * @返回类型 ServiceResult<String>
	 * @日期 2016年9月27日 下午3:34:04
	 * @创建人 hf
	 * @更新人 hf
	 *
	 */
	ServiceResult<JkAuditCheckDto> select(String applyLoanNo);
}
