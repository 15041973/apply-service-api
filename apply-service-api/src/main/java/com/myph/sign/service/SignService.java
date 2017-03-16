/**
 * 
 */
package com.myph.sign.service;

import java.util.List;

import com.myph.apply.dto.ApplyInfoDto;
import com.myph.common.result.ServiceResult;
import com.myph.common.rom.annotation.BasePage;
import com.myph.common.rom.annotation.Pagination;
import com.myph.sign.dto.JkContractDto;
import com.myph.sign.dto.JkSignDto;
import com.myph.sign.dto.SignQueryDto;

/**
 * 签约服务
 * 
 * @author peterhe
 *
 */
public interface SignService {

	/**
	 * 
	 * @名称 listPageInfos
	 * @描述 分页查询申请单待签约列表
	 * @返回类型 ServiceResult<Pagination<SignQueryDto>>
	 * @日期
	 * @创建人 peterhe
	 * @更新人 peterhe
	 *
	 */
	ServiceResult<Pagination<SignQueryDto>> listPageInfos(SignQueryDto querydto, BasePage basePage);

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
	ServiceResult<Integer> insertSelective(JkSignDto record);

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
	ServiceResult<Integer> updateSelective(JkSignDto record);

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
	ServiceResult<Integer> insertAllData(boolean isUpdate, JkSignDto record, ApplyInfoDto applyInfo,
			JkContractDto jkContractDto, String createUser);

	/**
	 * 
	 * @名称 selectByApplyLoanNo
	 * @描述 根据单号查询审核记录
	 * @返回类型 ServiceResult<JkSignDto>
	 * @日期 2016年10月28日 上午11:18:06
	 * @创建人 王海波
	 * @更新人 王海波
	 *
	 */
	ServiceResult<JkSignDto> selectByApplyLoanNo(String applyLoanNo);

	/**
	 * 
	 * @名称 selectByApplyLoanNo
	 * @描述 根据单号查询审核记录
	 * @返回类型 ServiceResult<JkSignDto>
	 * @日期 2016年10月28日 上午11:18:06
	 * @创建人 王海波
	 * @更新人 王海波
	 *
	 */
	ServiceResult<List<JkSignDto>> selectListByApplyLoanNo(String applyLoanNo);

}
