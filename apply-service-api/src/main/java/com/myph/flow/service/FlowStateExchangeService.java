package com.myph.flow.service;

import com.myph.common.exception.DataValidateException;
import com.myph.common.result.ServiceResult;
import com.myph.flow.dto.*;

/**
 * INFO: 统一的流程流转控制管理服务类，定义通用的几类熟悉
 * User: zhaokai
 * Date: 2016/9/17
 * Version: 1.0
 * History: <p>如果有修改过程，请记录</P>
 */
public interface FlowStateExchangeService<T extends BaseActionDto> {

    /**
     * 继续：流程会调整到下一阶段
     *
     * @param obj obj里面需要包含FlowStateExchangeEnum，枚举量会区分是不同动作类型
     * @return
     */
    ServiceResult<ProcessResultDto> doAction(T obj) throws DataValidateException;


}
