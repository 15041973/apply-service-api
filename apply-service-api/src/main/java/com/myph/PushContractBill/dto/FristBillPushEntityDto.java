package com.myph.PushContractBill.dto;

import com.myph.common.bean.BaseInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.math.BigDecimal;

/**
 * @author heyx
 * @version V1.0
 * @Title: BillPushDto
 * @Package: com.myph.manage.service.billContract
 * @company: 麦芽金服
 * @Description: TODO (用一句话描述该文件做什么)
 * @date 2017/3/6
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class FristBillPushEntityDto extends BaseInfo {

    private static final long serialVersionUID = -3879576886370386474L;

    private String idCard;

    private String phone;

    private String areaId; //大区
    private String storeId; //门店
    private String bmId; //业务经理
    private String bmName; //业务经理名称
    private String productId; //产品Id
    private String productName; //产品名称
    private String totalTerm; //产品总期数

    private BigDecimal contractAmt	; //合同金额
    private BigDecimal lendAmt	; //借款金额
    private BigDecimal purePrincipal	; //纯本金
    private BigDecimal serviceAmt	; //服务费
    private String 	loanDate	; //放款时间
    private String repayBeginDate	; //还款起始日
    private String 	repayEndDate	; //还款截止日



}
