package com.myph.auditCall.service;

import java.util.List;

import com.myph.auditCall.dto.AuditCallHisDto;
import com.myph.common.result.ServiceResult;

public interface AuditCallHisService {

    ServiceResult<Long> insertSelective(AuditCallHisDto record);

    ServiceResult<Integer> updateByPrimaryKeySelective(AuditCallHisDto record);

    ServiceResult<List<AuditCallHisDto>> selectByApplyNo(String applyLoanNo);

}
