package com.myph.auditCall.service;


import com.myph.auditCall.dto.AuditCallResultDto;
import com.myph.common.result.ServiceResult;

public interface AuditCallResultService {
    ServiceResult<Long> insertSelective(AuditCallResultDto record);

    ServiceResult<Integer> updateByPrimaryKeySelective(AuditCallResultDto record);

    ServiceResult<AuditCallResultDto> selectByApplyNo(String applyLoanNo);

}
