package com.myph.applyprogress.service;

import java.util.List;

import com.myph.applyprogress.dto.ApplyProgressDto;
import com.myph.applyprogress.dto.ApplyProgressQueryDto;
import com.myph.common.result.ServiceResult;
import com.myph.common.rom.annotation.BasePage;
import com.myph.common.rom.annotation.Pagination;

/**
 * 
 * @ClassName: ApplyProgressService
 * @Description: 申请进度查看
 * @author 王海波
 * @date 2016年9月20日 下午4:06:58
 *
 */
public interface ApplyProgressService {
    /**
     * 
     * @名称 listPageInfos
     * @描述 分页查询申请单进度
     * @返回类型 ServiceResult<Pagination<ApplyProgressDto>>
     * @日期 2016年9月20日 下午4:10:48
     * @创建人 王海波
     * @更新人 王海波
     *
     */
    ServiceResult<Pagination<ApplyProgressDto>> listPageInfos(ApplyProgressQueryDto querydto, BasePage basePage);

    /**
     * 
     * @名称 listInfos
     * @描述 查询申请单进度(不分页)
     * @返回类型 ServiceResult<List<ApplyProgressDto>>
     * @日期 2016年9月27日 下午3:23:21
     * @创建人 王海波
     * @更新人 王海波
     *
     */
    ServiceResult<List<ApplyProgressDto>> listInfos(ApplyProgressQueryDto querydto, BasePage basePage);
}
