/**   
\ * @Title: ApproveTaskService.java 
 * @Package: com.myph.approvetask.service 
 * @company: 麦芽金服
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author 罗荣   
 * @date 2016年9月22日 上午9:06:01 
 * @version V1.0   
 */
package com.myph.approvetask.service;

import com.myph.apply.dto.ApproveDto;
import com.myph.approvetask.dto.ApproveParamDto;
import com.myph.approvetask.dto.ApproveTaskDto;
import com.myph.common.result.ServiceResult;
import com.myph.common.rom.annotation.Pagination;

/**
 * @ClassName: ApproveTaskService
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 罗荣
 * @date 2016年9月22日 上午9:06:01
 * 
 */
public interface ApproveTaskService {
    public ServiceResult<Pagination<ApproveDto>> queryPageList(ApproveParamDto dto);

    /**
     * 
     * @名称 insert
     * @描述 TODO(这里用一句话描述这个方法的作用)
     * @返回类型 int
     * @日期 2016年9月22日 上午9:45:11
     * @创建人 罗荣
     * @更新人 罗荣
     *
     */
    int insert(ApproveTaskDto record);

    /**
     * 
     * @名称 insertFisrtApproveTask
     * @描述 初始化审核任务表,如果存在则更新状态为待初审(这里用一句话描述这个方法的作用)
     * @返回类型 ServiceResult<Integer>
     * @日期 2016年9月22日 上午10:24:26
     * @创建人 罗荣
     * @更新人 罗荣
     *
     */
    public ServiceResult<Integer> insertFisrtApproveTask(String applyLoanNo, String userName);

    /**
     * 
     * @名称 selectByApplyLoanNo
     * @描述 TODO(这里用一句话描述这个方法的作用)
     * @返回类型 ServiceResult<ApproveTaskDto>
     * @日期 2016年9月22日 下午4:02:53
     * @创建人 罗荣
     * @更新人 罗荣
     *
     */
    public ServiceResult<ApproveTaskDto> selectByApplyLoanNo(String applyLoanNo);

    /**
     * @param oldApproveUser 
     * @名称 updateApproveUser
     * @描述 TODO(这里用一句话描述这个方法的作用)
     * @返回类型 ServiceResult<Integer>
     * @日期 2016年9月23日 上午8:58:58
     * @创建人 罗荣
     * @更新人 罗荣
     * 
     */
    public ServiceResult<Integer> updateApproveUser(Long newApproveUser, String applyLoanNo);

    /**
     * @名称 updateFisrtData
     * @描述 更新初审数据(这里用一句话描述这个方法的作用)
     * @返回类型 ServiceResult
     * @日期 2016年9月26日 上午9:59:14
     * @创建人 罗荣
     * @更新人 罗荣
     * 
     */
    public ServiceResult updateFisrtData(ApproveTaskDto taskInfo);

    /**
     * 
     * @名称 updateTaskState
     * @描述 更新任务表状态(这里用一句话描述这个方法的作用)
     * @返回类型 ServiceResult
     * @日期 2016年9月27日 下午4:06:30
     * @创建人 罗荣
     * @更新人 罗荣
     *
     */
    public ServiceResult updateTaskState(String applyLoanNo, Integer state,Integer subState);

    /**
     * 
     * @名称 visitRefuse
     * @描述 更新状态为外访拒绝(这里用一句话描述这个方法的作用)
     * @返回类型 ServiceResult
     * @日期 2016年9月28日 上午8:39:56
     * @创建人 罗荣
     * @更新人 罗荣
     *
     */
    public ServiceResult firstVisitRefuse(String applyLoanNo);
    /**
     * 
     * @名称 lastVisitRefuse 
     * @描述 终审状态为外访拒绝(这里用一句话描述这个方法的作用) 
     * @返回类型 ServiceResult     
     * @日期 2016年10月25日 上午10:56:42
     * @创建人  罗荣
     * @更新人  罗荣
     *
     */
    public ServiceResult lastedVisitRefuse(String applyLoanNo);
    /**
     * 
     * @名称 firstVisitFinish 
     * @描述 初审外访完成(这里用一句话描述这个方法的作用) 
     * @返回类型 ServiceResult     
     * @日期 2016年9月28日 上午9:00:54
     * @创建人  罗荣
     * @更新人  罗荣
     *
     */
    public ServiceResult firstVisitFinish(String applyLoanNo);
    
    
    /**
     * 
     * @名称 lastedVisitFinish 
     * @描述 终审外访完成(这里用一句话描述这个方法的作用) 
     * @返回类型 ServiceResult     
     * @日期 2016年9月28日 上午9:00:54
     * @创建人  罗荣
     * @更新人  罗荣
     *
     */
    public ServiceResult lastedVisitFinish(String applyLoanNo);
}
