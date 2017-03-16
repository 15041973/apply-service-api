package com.myph.visit.service;

import java.util.List;

import com.myph.common.result.ServiceResult;
import com.myph.common.rom.annotation.BasePage;
import com.myph.common.rom.annotation.Pagination;
import com.myph.flow.dto.ExternalActionDto;
import com.myph.visit.dto.VisitDetailDto;
import com.myph.visit.dto.VisitDto;
import com.myph.visit.dto.VisitQueryDto;

/**
 * 
 * @ClassName: VisitService
 * @Description: 外访管理
 * @author 王海波
 * @date 2016年9月8日 上午10:26:51
 * 
 */
public interface VisitService {
    /**
     * 
     * @名称 listPageInfos
     * @描述 分页查询外访列表
     * @返回类型 ServiceResult<Pagination<VisitDto>>
     * @日期 2016年9月8日 上午10:27:07
     * @创建人 王海波
     * @更新人 王海波
     * 
     */
    ServiceResult<Pagination<VisitDto>> listPageInfos(VisitQueryDto querydto, BasePage basePage);

    /**
     * 
     * @名称 get
     * @描述 根据主键id获取外访信息
     * @返回类型 ServiceResult<VisitDto>
     * @日期 2016年9月8日 上午10:39:03
     * @创建人 王海波
     * @更新人 王海波
     * 
     */
    ServiceResult<VisitDetailDto> get(Long id);

    /**
     * 
     * @名称 getByApplyNO
     * @描述 根据申请单号查询外访结果信息
     * @返回类型 ServiceResult<VisitDetailDto>
     * @日期 2016年9月22日 下午1:42:41
     * @创建人 王海波
     * @更新人 王海波
     *
     */
    ServiceResult<List<VisitDetailDto>> getResultByApplyNO(String applyLoanNo);

    /**
     * 
     * @名称 allotVisit
     * @描述 分配外访任务
     * @返回类型 ServiceResult<Integer>
     * @日期 2016年9月8日 上午10:43:17
     * @创建人 王海波
     * @更新人 王海波
     * 
     */
    ServiceResult<Integer> allotVisit(VisitDetailDto visitDto);

    /**
     * 
     * @名称 recordVisit
     * @描述 记录外访结果
     * @返回类型 ServiceResult<Integer>
     * @日期 2016-9-16 下午6:11:41
     * @创建人 王海波
     * @更新人 王海波
     * 
     */
    ServiceResult<Integer> recordVisit(VisitDetailDto detail);

    /**
     * 
     * @名称 initVisit
     * @描述 初审申请外访
     * @返回类型 ServiceResult<Integer>
     * @日期 2016年9月27日 上午9:18:51
     * @创建人 王海波
     * @更新人 王海波
     *
     */
    ServiceResult<Integer> initAuditFirstVisit(ExternalActionDto actionDto);

    /**
     *
     * @名称 initVisit
     * @描述 外访审申请外访
     * @返回类型 ServiceResult<Integer>
     * @日期 2016年9月27日 上午9:18:51
     * @创建人 王海波
     * @更新人 王海波
     *
     */
    ServiceResult<Integer> initAuditLastVisit(ExternalActionDto actionDto);

}
