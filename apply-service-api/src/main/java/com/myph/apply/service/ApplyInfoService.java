package com.myph.apply.service;

import java.util.Date;
import java.util.List;

import com.myph.apply.dto.ApplyInfoDto;
import com.myph.apply.dto.ApplyManageInfoDto;
import com.myph.apply.dto.FileManageApplyInfoDto;
import com.myph.common.result.ServiceResult;
import com.myph.common.rom.annotation.BasePage;
import com.myph.common.rom.annotation.Pagination;

/**
 *
 * @ClassName: ApplyInfoService
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author heyx
 * @date 2016年9月6日 下午3:49:56
 *
 */
public interface ApplyInfoService {

    /**
     * 申请单管理分页查询
     *
     * @名称 listInfo
     * @描述 TODO
     * @返回类型 ServiceResult<Pagination<ApplyInfoDto>>
     * @日期 2016年9月24日 下午2:54:48
     * @创建人 hf
     * @更新人 hf
     *
     */
    ServiceResult<Pagination<ApplyManageInfoDto>> listInfo(ApplyManageInfoDto querydto, BasePage basePage);

    ServiceResult<Integer> addInfo(ApplyInfoDto addDto);

    ServiceResult<Integer> updateInfo(ApplyInfoDto updateDto);

    ServiceResult<Integer> updateById(ApplyInfoDto updateDto);

    ServiceResult<Integer> deleteInfo(Long id);

    ServiceResult<List<ApplyInfoDto>> listInfoByIdCard(String id);

    ServiceResult<ApplyInfoDto> queryInfoByLoanNo(String id);

    ServiceResult<ApplyInfoDto> queryInfoByAppNo(String appNo);

    /**
     *
     * @名称 goAudit
     * @描述 进入信审并修改MQ任务表状态(这里用一句话描述这个方法的作用)
     * @返回类型 ServiceResult<ApplyInfoDto>
     * @日期 2016年11月2日 下午3:25:04
     * @创建人 罗荣
     * @更新人 罗荣
     *
     */
    ServiceResult<ApplyInfoDto> goAudit(ApplyInfoDto info) throws Exception;

    /**
     *
     * @名称 selectByApplyLoanNo
     * @描述 根据ApplyLoanNo查询申请件信息
     * @返回类型 ServiceResult<FileManageApplyInfoDto>
     * @日期 2016年9月9日 上午10:03:51
     * @创建人 吴阳春
     * @更新人 吴阳春
     *
     */
    ServiceResult<FileManageApplyInfoDto> selectByApplyLoanNo(String applyLoanNo);

    /**
     *
     * @名称 queryCountByIdCard
     * @描述 该身份证是否有正在入库的数据
     * @返回类型 ServiceResult<Integer>
     * @日期 2016年9月8日 下午4:41:04
     * @创建人 heyx
     * @更新人 heyx
     *
     */
    public ServiceResult<ApplyInfoDto> queryCountByIdCard(String idCard);

    /**
     * @名称 queryAbandonCountByIdCard
     * @描述 该身份证最新的申请单数据
     * @返回类型 ServiceResult<Integer>
     * @日期 2016年9月8日 下午4:41:04
     * @创建人 heyx
     * @更新人 heyx
     */
    public ServiceResult<ApplyInfoDto> queryLastApplyInfoByIdCard(String idCard);

    public ServiceResult<ApplyInfoDto> queryAppApplyInfoByIdCard(String idCard);

    /**
     * 暴露给流程控制器的方法： 更新jk_apply表的state和substate字段信息
     *
     * @param applyLoanNo
     * @param srcFlowState
     * @param destFlowState
     * @param destBisState @return
     */
    ServiceResult<Object> updateStateAndSubState(String applyLoanNo, Integer srcFlowState, Integer destFlowState,
            Integer destBisState);

    /**
     *
     * @名称 updateSubState
     * @描述 TODO(这里用一句话描述这个方法的作用)
     * @返回类型 ServiceResult<Integer>
     * @日期 2016年9月13日 下午2:08:12
     * @创建人 罗荣
     * @更新人 罗荣
     *
     */
    ServiceResult<Integer> updateSubState(String applyLoanNo, Integer subState);

    /**
     * @名称 selectByMemberInfo
     * @描述 进件阶段的某个客户申请单(这里用一句话描述这个方法的作用)
     * @返回类型 ServiceResult<ApplyInfoDto>
     * @日期 2016年9月20日 上午11:25:54
     * @创建人 罗荣
     * @更新人 罗荣
     *
     */
    ServiceResult<ApplyInfoDto> selectByMemberInfo(String idno, String mobile, String name);

    public Date getApplyStateLog(String applyLoanNo, int state);

    public Date getApplyStateLogNew(String applyLoanNo, int state);

}
