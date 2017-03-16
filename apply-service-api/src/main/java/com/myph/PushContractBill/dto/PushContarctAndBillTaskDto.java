package com.myph.PushContractBill.dto;

import com.myph.common.bean.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Date;

/**
 * @Title:
 * @Description: 推送合同账单推送执行结果表
 * @author heyx
 * @date 2017/3/7
 * @version V1.0
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class PushContarctAndBillTaskDto extends BaseEntity {
    private Long id;

    private String contractId;

    private String billId;

    private Integer billPushedStatu;

    private Integer failureTimes;

    private String failureCause;

    private Date lastPushedTime;

    private Date updateTime;

    private Date createdTime;
}