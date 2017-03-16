/**   
 * @Title: JkApplyAudit.java 
 * @Package: com.myph.audit.service
 * @company: 麦芽金服
 * @Description: TODO
 * @date 2016年9月20日 下午7:08:50 
 * @version V1.0   
 */
package com.myph.audit.service;

import java.util.List;

import com.myph.apply.dto.JkAuditTaskDto;
import com.myph.audit.dto.AuditThridInfoDto;
import com.myph.common.result.ServiceResult;

/**
 * 
 * @ClassName: AuditThridInfoService
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author heyx
 * @date 2016年9月29日 上午11:05:14
 *
 */
public interface AuditThridInfoService {
    /**
     * 
     * @名称 queryInfoByAppNo
     * @描述 根据申请单号获取数据
     * @返回类型 ServiceResult<List<AuditThridInfoDto>>
     * @日期 2016年9月29日 下午4:56:21
     * @创建人 heyx
     * @更新人 heyx
     *
     */
    ServiceResult<List<AuditThridInfoDto>> queryInfoByAppNo(String applyLoanNo);

    /**
     * 
     * @名称 batchAdd
     * @描述 批量新增
     * @返回类型 ServiceResult<Integer>
     * @日期 2016年9月29日 下午4:56:26
     * @创建人 heyx
     * @更新人 heyx
     *
     */
    ServiceResult<Integer> batchAdd(List<AuditThridInfoDto> record, JkAuditTaskDto auditTaskDto);

    /**
     * 
     * @名称 batchUpdate
     * @描述 批量修改
     * @返回类型 ServiceResult<Integer>
     * @日期 2016年9月29日 下午4:56:31
     * @创建人 heyx
     * @更新人 heyx
     *
     */
    ServiceResult<Integer> batchUpdate(List<AuditThridInfoDto> record, JkAuditTaskDto auditTaskDto);
}
