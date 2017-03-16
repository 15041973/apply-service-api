/**   
 * @Title: MemberLinkmanService.java 
 * @Package: com.myph.apply.linkman.service
 * @company: 麦芽金服
 * @Description: TODO
 * @date 2016年10月12日 上午10:41:43 
 * @version V1.0   
 */
package com.myph.apply.linkman.service;

import java.util.List;

import com.myph.apply.dto.MemberLinkmanDto;
import com.myph.common.result.ServiceResult;

/**
 * 会员模块联系人
 * 
 * @ClassName: MemberLinkmanService
 * @Description: TODO
 * @author hf
 * @date 2016年10月12日 上午10:41:43
 * 
 */
public interface MemberLinkmanService {

    /**
     * 插入申请件联系人信息
     * 
     * @param string
     * 
     * @名称 saveLinkman
     * @描述 TODO
     * @返回类型 ServiceResult<Integer>
     * @日期 2016年9月18日 下午6:34:36
     * @创建人 hf
     * @更新人 hf
     *
     */
    ServiceResult<Integer> saveLinkman(MemberLinkmanDto record, String operatorUser);

    /**
     * 更新申请单联系人信息
     * 
     * @名称 updateLinkman
     * @描述 TODO
     * @返回类型 ServiceResult<Integer>
     * @日期 2016年9月18日 下午6:38:16
     * @创建人 hf
     * @更新人 hf
     *
     */
    ServiceResult<Integer> updateLinkman(MemberLinkmanDto record, String operatorUser);

    /**
     * 
     * @名称 getLinkmansByMemId
     * @描述 根据客户Id查询联系人信息
     * @返回类型 ServiceResult<List<MemberLinkmanDto>>
     * @日期 2016年10月14日 下午2:31:22
     * @创建人 王海波
     * @更新人 王海波
     *
     */
    ServiceResult<List<MemberLinkmanDto>> getLinkmansByMemId(Long memberId);

    ServiceResult<MemberLinkmanDto> selectSingleMemberLinkman(Long memberId,Integer linkManType);
    
    ServiceResult<MemberLinkmanDto> selectByMemberId(Long memberId);

    ServiceResult<Integer> updateSelective(MemberLinkmanDto memberLinkmanDto);

    ServiceResult<Integer> updateSelectiveById(MemberLinkmanDto memberLinkmanDto);

    ServiceResult<MemberLinkmanDto> selectLinkmanByMemberIdAndPhone(Long memberId, String phone);

}
