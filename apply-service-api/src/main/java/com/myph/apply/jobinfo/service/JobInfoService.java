/**   
 * @Title: JobInfoService.java 
 * @Package: com.myph.apply.jobinfo.service
 * @company: 麦芽金服
 * @Description: TODO
 * @date 2016年9月12日 下午8:24:12 
 * @version V1.0   
 */
package com.myph.apply.jobinfo.service;

import com.myph.apply.dto.JkApplyJobDto;
import com.myph.common.result.ServiceResult;

/**
 * @ClassName: JobInfoService
 * @Description: TODO
 * @author hf
 * @date 2016年9月12日 下午8:24:12
 * 
 */
public interface JobInfoService {

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
	ServiceResult<Integer> insertSelective(JkApplyJobDto record);

	/**
	 * 根据申请单号查询工作信息
	 * 
	 * @名称 selectJobInfoByAppNO
	 * @描述 TODO
	 * @返回类型 ServiceResult<JkApplyJobDto>
	 * @日期 2016年9月13日 下午4:03:29
	 * @创建人 hf
	 * @更新人 hf
	 *
	 */
	ServiceResult<JkApplyJobDto> selectJobInfoByAppNO(String applyLoanNo);

	/**
	 * 
	 * @名称 updateSelective
	 * @描述 TODO
	 * @返回类型 int
	 * @日期 2016年9月12日 下午8:25:17
	 * @创建人 hf
	 * @更新人 hf
	 *
	 */
	ServiceResult<Integer> updateSelective(JkApplyJobDto record);
}
