package com.myph.apply.service;

import com.myph.apply.dto.ComplianceDto;
import com.myph.common.result.ServiceResult;
import com.myph.common.rom.annotation.BasePage;
import com.myph.common.rom.annotation.Pagination;
import com.myph.compliance.dto.JkComplianceDto;

public interface ComplianceService {

    ServiceResult<Pagination<ComplianceDto>> getJkApplyCompliance(ComplianceDto complianceDto, BasePage basePage);
    
    ServiceResult<JkComplianceDto> queryComplianceByAppNo(String applyLoanNo);
}
