/**   
 * @Title: AuditLogService.java 
 * @Package: com.myph.auditlog.service 
 * @company: 麦芽金服
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author 罗荣   
 * @date 2016年9月26日 下午4:18:41 
 * @version V1.0   
 */
package com.myph.auditlog.service;

import java.util.List;

import com.myph.auditlog.dto.AuditLogDto;
import com.myph.common.result.ServiceResult;

/**
 * @ClassName: AuditLogService
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 罗荣
 * @date 2016年9月26日 下午4:18:41
 * 
 */
public interface AuditLogService {
    /**
     * 
     * @名称 insert 
     * @描述 TODO(这里用一句话描述这个方法的作用) 
     * @返回类型 ServiceResult     
     * @日期 2016年9月28日 上午10:30:19
     * @创建人  罗荣
     * @更新人  罗荣
     *
     */
    ServiceResult insert(AuditLogDto record);
    /**
     * 
     * @名称 selectByApplyLoanNo 
     * @描述 TODO(这里用一句话描述这个方法的作用) 
     * @返回类型 ServiceResult<List<AuditLogDto>>     
     * @日期 2016年9月28日 上午10:30:23
     * @创建人  罗荣
     * @更新人  罗荣
     *
     */
    ServiceResult<List<AuditLogDto>> selectByApplyLoanNo(String applyLoanNo);
}
