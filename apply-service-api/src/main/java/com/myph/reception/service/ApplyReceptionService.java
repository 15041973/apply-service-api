package com.myph.reception.service;

import java.util.List;

import com.myph.common.result.ServiceResult;
import com.myph.common.rom.annotation.BasePage;
import com.myph.common.rom.annotation.Pagination;
import com.myph.reception.dto.ApplyReceptionDto;

/**
 * 
 * @ClassName: SysTeamService
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author heyx
 * @date 2016年9月1日 下午4:54:32
 *
 */
public interface ApplyReceptionService {

    ServiceResult<Pagination<ApplyReceptionDto>> listInfo(ApplyReceptionDto querydto, BasePage basePage);

    ServiceResult<Integer> addInfo(ApplyReceptionDto addDto);

    ServiceResult<Integer> subMitInfo(ApplyReceptionDto addDto);

    ServiceResult<Integer> updateInfo(ApplyReceptionDto updateDto);

    ServiceResult<Integer> updateState(ApplyReceptionDto updateDto);

    ServiceResult<Integer> updateSubmitInfo(ApplyReceptionDto updateDto);

    ServiceResult<Integer> deleteInfo(Long id);

    ServiceResult<List<ApplyReceptionDto>> listInfoByXXXId(Long id);

    ServiceResult<ApplyReceptionDto> queryInfoById(String id);

    ServiceResult<ApplyReceptionDto> queryInfoByLoanNo(String applyLoanNo);
    
    ServiceResult<ApplyReceptionDto> queryInfoByApplyLoanNo(String applyLoanNo);
    
    public ServiceResult<ApplyReceptionDto> queryInfoByIdCard(String idCard);
    
    /**
     * 校验接待表是否存在保存状态的接待单 - app
     */
    public ServiceResult<ApplyReceptionDto> queryAppEntityByApplyIdCard(String idCard);

}
