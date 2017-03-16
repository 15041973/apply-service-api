package com.myph.compliance.service;

import java.util.List;

import com.myph.common.result.ServiceResult;
import com.myph.compliance.dto.JkComplianceLogDto;

public interface JkComplianceLogService {

    ServiceResult<List<JkComplianceLogDto>> selectByApplyNo(String applyLoanNo);
}
