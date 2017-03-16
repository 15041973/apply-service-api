/**   
 * @Title: ContactsService.java 
 * @Package: com.myph.apply.contacts.service
 * @company: 麦芽金服
 * @Description: TODO
 * @date 2016年9月18日 下午3:35:52 
 * @version V1.0   
 */
package com.myph.apply.linkman.service;

import java.util.List;

import com.myph.apply.dto.JkApplyLinkmanDto;
import com.myph.common.result.ServiceResult;

/**
 * 申请件联系人信息Service
 * 
 * @ClassName: ContactsService
 * @Description: TODO
 * @author hf
 * @date 2016年9月18日 下午3:35:52
 * 
 */
public interface ContactsService {

	/**
	 * 获取申请件联系人
	 * 
	 * @名称 getApplyLinkmans
	 * @描述 TODO
	 * @返回类型 ServiceResult<List<JkApplyLinkmanDto>>
	 * @日期 2016年9月18日 下午3:39:22
	 * @创建人 hf
	 * @更新人 hf
	 *
	 */
	ServiceResult<JkApplyLinkmanDto> getSingleApplyLinkman(String applyLoanNo,Integer linkManType);

	/**
	 * 批量插入申请件联系人信息
	 * @param string 
	 * 
	 * @名称 batchAddLinkman
	 * @描述 TODO
	 * @返回类型 ServiceResult<Integer>
	 * @日期 2016年9月18日 下午6:34:36
	 * @创建人 hf
	 * @更新人 hf
	 *
	 */
	ServiceResult<Integer> saveLinkman(JkApplyLinkmanDto record, String operatorUser);

	/**
	 * 蒲亮更新申请单联系人信息
	 * 
	 * @名称 batchUpdateLinkman
	 * @描述 TODO
	 * @返回类型 ServiceResult<Integer>
	 * @日期 2016年9月18日 下午6:38:16
	 * @创建人 hf
	 * @更新人 hf
	 *
	 */
	ServiceResult<Integer> updateLinkman(JkApplyLinkmanDto record,String operatorUser);
	
	ServiceResult<Integer> updateByIdSelective(JkApplyLinkmanDto record);

	ServiceResult<List<JkApplyLinkmanDto>> getApplyLinkmansByAppNo(String applyLoanNo);

    ServiceResult<Integer> checkInfoByApplyLoanNoAndPhone(String applyLoanNo, String phone);
}
