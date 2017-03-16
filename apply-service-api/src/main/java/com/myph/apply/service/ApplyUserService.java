package com.myph.apply.service;

import java.util.List;

import com.myph.apply.dto.ApplyUserDto;
import com.myph.common.result.ServiceResult;
import com.myph.common.rom.annotation.BasePage;
import com.myph.common.rom.annotation.Pagination;

/**
 * 
 * @ClassName: SysTeamService
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author heyx
 * @date 2016年9月1日 下午4:54:32
 *
 */
public interface ApplyUserService {

    ServiceResult<Pagination<ApplyUserDto>> listInfo(ApplyUserDto querydto, BasePage basePage);

    /**
     * 
     * @名称 queryInfoByLoanNo
     * @描述 根据申请单号获取个人信息
     * @返回类型 ServiceResult<ApplyUserDto>
     * @日期 2016年9月18日 下午5:20:29
     * @创建人 heyx
     * @更新人 heyx
     *
     */
    ServiceResult<ApplyUserDto> queryInfoByLoanNo(String applyLoanNo);

    ServiceResult<Integer> addInfo(ApplyUserDto addDto, Integer subState);

    ServiceResult<Integer> updateInfo(ApplyUserDto updateDto, Integer subState);

    /**
     * 
     * @名称 updateInfoBack
     * @描述 退回修改
     * @返回类型 ServiceResult<Integer>
     * @日期 2016年9月23日 上午10:09:28
     * @创建人 heyx
     * @更新人 heyx
     *
     */
    ServiceResult<Integer> updateInfoBack(ApplyUserDto updateDto);

    ServiceResult<Integer> deleteInfo(Long id);

    ServiceResult<List<ApplyUserDto>> listInfoByXXXId(Long id);

    ServiceResult<ApplyUserDto> queryInfoById(String id);
}
