package com.myph.auditCashCount.service;

import java.util.List;

import com.myph.auditCashCount.dto.AuditCashCountDto;
import com.myph.common.result.ServiceResult;

public interface AuditCashCountService {

    ServiceResult<Integer> insertSelective(AuditCashCountDto record);

    ServiceResult<Integer> updateByPrimaryKeySelective(AuditCashCountDto record);

    ServiceResult<List<AuditCashCountDto>> selectByApplyLoanNo(String applyLoanNo);

    ServiceResult<Long> checkData(String applyLoanNo, Long liabilitiesTypeNo);

}
