package com.myph.PushContractBill.service;

import com.myph.PushContractBill.dto.FristBillPushEntityDto;
import com.myph.PushContractBill.dto.PushContarctAndBillTaskDto;

/**
 * @Title:
 * @Description: (用一句话描述该方法做什么)
 * @author heyx
 * @date 2017/3/7
 * @version V1.0
 */public interface PushContarctAndBillTaskService {

    /**
     * @Title: PushContarctAndBillTaskServiceImpl
     * @Package: com.myph.PushContractBill.service
     * @company: 麦芽金服
     * @Description: 新增推送合同账单推送执行结果表
     * @author heyx
     * @date 2017/3/7
     * @version V1.0
     */
    int insert(PushContarctAndBillTaskDto record);

    /**
     * @Description: 修改记录表状态
     * @author heyx
     * @date 2017/3/14
     * @version V1.0
     */
    int updateByStatuToSuc(PushContarctAndBillTaskDto record);

    /**
     * @Title:
     * @Description: 根据合同单号，账单号，发送状态成功，获取信息
     * @author heyx
     * @date 2017/3/8
     * @version V1.0
     */
    PushContarctAndBillTaskDto selectSuccessInfo(PushContarctAndBillTaskDto record);

    FristBillPushEntityDto selectApplyContractLoan(String contractNo);

    Integer selectSucCount(PushContarctAndBillTaskDto record);

}