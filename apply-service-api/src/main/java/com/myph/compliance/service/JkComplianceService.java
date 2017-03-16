package com.myph.compliance.service;

import com.myph.common.result.ServiceResult;
import com.myph.compliance.dto.JkComplianceDto;

public interface JkComplianceService {
    
    ServiceResult<Long> insertSelective(JkComplianceDto record);

    ServiceResult<Integer> updateByPrimaryKeySelective(JkComplianceDto record);

    ServiceResult<JkComplianceDto> selectByApplyNo(String applyLoanNo);

}
