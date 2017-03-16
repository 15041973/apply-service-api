package com.myph.auditCashStatistics.service;


import com.myph.auditCashStatistics.dto.AuditCashStatisticsDto;
import com.myph.common.result.ServiceResult;

public interface AuditCashStatisticsService {

    ServiceResult<Integer> insertSelective(AuditCashStatisticsDto record);

    ServiceResult<AuditCashStatisticsDto> selectByApplyLoanNo(String applyLoanNo);

    ServiceResult<Integer> checkData(String applyLoanNo);

    ServiceResult<Integer> updateByApplyLoanNoSelective(AuditCashStatisticsDto auditCashStatisticsDto);

}
