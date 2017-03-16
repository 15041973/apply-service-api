/**   
 * @Title: JkRepaymentPlanService.java 
 * @Package: com.myph.sign.service
 * @company: 麦芽金服
 * @Description: TODO
 * @date 2016年10月28日 下午5:13:59 
 * @version V1.0   
 */
package com.myph.sign.service;

import java.util.List;

import com.myph.common.result.ServiceResult;
import com.myph.sign.dto.JkRepaymentPlanDto;

/**
 * @ClassName: JkRepaymentPlanService
 * @Description: TODO
 * @author hf
 * @date 2016年10月28日 下午5:13:59
 * 
 */
public interface JkRepaymentPlanService {

	ServiceResult<Integer> insert(List<JkRepaymentPlanDto> list);

	ServiceResult<List<JkRepaymentPlanDto>> selectByApplyLoanNo(String applyLoanNo);

	ServiceResult<Integer> batchUpdate(List<JkRepaymentPlanDto> list);
	
	ServiceResult<Integer> delete(List<JkRepaymentPlanDto> list);
}
