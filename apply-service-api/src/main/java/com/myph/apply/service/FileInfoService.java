package com.myph.apply.service;

import java.util.List;
import java.util.Map;

import com.myph.apply.dto.FileDto;
import com.myph.common.result.ServiceResult;

/**
 * 
 * @ClassName: FileInfoService 
 * @Description: 申请附件关联表服务
 * @author 吴阳春 
 * @date 2016年9月13日 下午4:59:28 
 *
 */
public interface FileInfoService {

    ServiceResult<Integer> insertSelective(FileDto record);

    ServiceResult<FileDto> selectByPrimaryKey(Long id);

    ServiceResult<List<FileDto>> selectByApplyLoanNo(String applyLoanNo);

    ServiceResult<Integer> deleteByFileIdList(List<Long> fileIdList);

    ServiceResult<List<Long>> selectFileInfo(String applyLoanNo, Long fileUpState);

}
