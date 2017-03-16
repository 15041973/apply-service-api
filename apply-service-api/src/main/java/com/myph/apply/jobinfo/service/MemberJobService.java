/**   
 * @Title: MemberJobService.java 
 * @Package: com.myph.apply.jobinfo.service
 * @company: 麦芽金服
 * @Description: TODO
 * @date 2016年9月19日 下午7:06:59 
 * @version V1.0   
 */
package com.myph.apply.jobinfo.service;

import com.myph.apply.dto.MemberJobDto;
import com.myph.common.result.ServiceResult;

/**
 * 客户工作信息表
 * 
 * @ClassName: MemberJobService
 * @Description: TODO
 * @author hf
 * @date 2016年9月19日 下午7:06:59
 * 
 */
public interface MemberJobService {

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
	ServiceResult<Integer> insertSelective(MemberJobDto record);

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
	ServiceResult<Integer> updateSelective(MemberJobDto record);
	
	ServiceResult<MemberJobDto> selectByMemberId(Long memberId);
}
