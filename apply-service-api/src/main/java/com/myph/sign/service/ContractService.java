/**
 * 
 */
package com.myph.sign.service;

import com.myph.common.result.ServiceResult;
import com.myph.sign.dto.JkContractDto;

/**
 * @author peterhe
 *
 */
public interface ContractService {
	
	/**
	 * 
	 * @名称 insertSelective
	 * @描述 TODO
	 * @返回类型 int
	 * @日期 2016年9月12日 下午8:25:17
	 * @创建人 hf
	 * @更新人 hf
	 *
	 */
	ServiceResult<Integer> insertSelective(JkContractDto record,String user);
	
	ServiceResult<JkContractDto> selectByApplyLoanNo(String applyLoanNo);
	
	ServiceResult<Integer> updateSelective(JkContractDto record);
}
