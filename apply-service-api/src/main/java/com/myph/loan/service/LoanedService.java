/**   
 * @Title: LoanedService.java 
 * @Package: com.myph.loan.service 
 * @company: 麦芽金服
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author 罗荣   
 * @date 2016年10月26日 上午9:31:07 
 * @version V1.0   
 */
package com.myph.loan.service;

import com.alibaba.fastjson.JSONObject;
import com.myph.common.result.ServiceResult;
import com.myph.common.rom.annotation.BasePage;
import com.myph.common.rom.annotation.Pagination;
import com.myph.loan.dto.LoanedInfoDto;
import com.myph.loan.param.QueryListParam;

/**
 * @ClassName: LoanedService
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 罗荣
 * @date 2016年10月26日 上午9:31:07
 * 
 */
public interface LoanedService {
    public ServiceResult<Pagination<LoanedInfoDto>> queryPageList(QueryListParam param, BasePage page);

    public ServiceResult<Integer> loaned(Long[] ids);

    /** 
     * @名称 findDetail 
     * @描述 TODO(这里用一句话描述这个方法的作用) 
     * @返回类型 ServiceResult<LoanedInfoDto>     
     * @日期 2016年10月27日 下午2:07:48
     * @创建人  罗荣
     * @更新人  罗荣
     * 
     */
    public ServiceResult<LoanedInfoDto> findDetail(String applyLoanNo);
    /**
     * 
     * @名称 loanedInit 
     * @描述 提交给流程状态机调用【初始化放款任务表】(这里用一句话描述这个方法的作用) 
     * @返回类型 ServiceResult<Integer>     
     * @日期 2016年10月28日 上午11:06:18
     * @创建人  罗荣
     * @更新人  罗荣
     *
     */
    public ServiceResult<Integer> loanedInit(String applyLoanNo,JSONObject doc);

    /** 
     * @名称 update 
     * @描述 TODO(这里用一句话描述这个方法的作用) 
     * @返回类型 void     
     * @日期 2016年10月27日 下午5:21:36
     * @创建人  罗荣
     * @更新人  罗荣
     * 
     */
    public ServiceResult<Integer> update(String currentUserName, Long currentUserId,Long id);
}
