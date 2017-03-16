package com.myph.apply.dto;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;

import com.myph.common.bean.BaseInfo;
import com.myph.common.util.SensitiveInfoUtils;

@Data
@EqualsAndHashCode(callSuper = true)
public class ApplyInfoDto extends BaseInfo {
    private static final long serialVersionUID = 5565321284654526388L;

    private Long id;

    private String applyLoanNo;

    private String memberName;

    private String nameSpell;

    private String phone;

    private String idCard;

    private Long cityId;

    private String cityName;

    private Long storeId;

    private String storeName;

    private Long areaId;

    private String areaName;

    private Long bmId;

    private Long customerServiceId;

    private String bmName;

    private String customerSName;

    private String memberType;

    private String infoChannel;

    private Long loanPurpose;
    
    private String loanPurposeName;

    private BigDecimal affordMonthpay;

    private String applyRemark;

    private Long productType;

    private String productName;

    private BigDecimal expectLoan;

    private String loanPurposes;

    private Integer loanPeriods;

    private BigDecimal applyMoney;

    private BigDecimal auditRatifyMoney;

    private Integer subState;

    private Integer state;

    private Integer clientType;

    private Date loanTime;

    private Date signTime;

    private Integer delFlag;

    private Date createTime;

    private String createuser;

    private Date updateTime;

    private String modifyUser;

    private Date opinionTime;

    private String contractNo;// 合同编号

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("ApplyInfoDto [id=");
        builder.append(id);
        builder.append(", applyLoanNo=");
        builder.append(applyLoanNo);
        builder.append(", memberName=");
        builder.append(SensitiveInfoUtils.maskUserName(memberName));
        builder.append(", nameSpell=");
        builder.append(nameSpell);
        builder.append(", phone=");
        builder.append(SensitiveInfoUtils.maskMobilePhone(phone));
        builder.append(", idCard=");
        builder.append(SensitiveInfoUtils.maskIdCard(idCard));
        builder.append(", cityId=");
        builder.append(cityId);
        builder.append(", cityName=");
        builder.append(cityName);
        builder.append(", storeId=");
        builder.append(storeId);
        builder.append(", storeName=");
        builder.append(storeName);
        builder.append(", areaId=");
        builder.append(areaId);
        builder.append(", areaName=");
        builder.append(areaName);
        builder.append(", bmId=");
        builder.append(bmId);
        builder.append(", customerServiceId=");
        builder.append(customerServiceId);
        builder.append(", bmName=");
        builder.append(bmName);
        builder.append(", customerSName=");
        builder.append(customerSName);
        builder.append(", memberType=");
        builder.append(memberType);
        builder.append(", infoChannel=");
        builder.append(infoChannel);
        builder.append(", loanPurpose=");
        builder.append(loanPurpose);
        builder.append(", affordMonthpay=");
        builder.append(affordMonthpay);
        builder.append(", applyRemark=");
        builder.append(applyRemark);
        builder.append(", productType=");
        builder.append(productType);
        builder.append(", productName=");
        builder.append(productName);
        builder.append(", expectLoan=");
        builder.append(expectLoan);
        builder.append(", loanPurposes=");
        builder.append(loanPurposes);
        builder.append(", loanPeriods=");
        builder.append(loanPeriods);
        builder.append(", applyMoney=");
        builder.append(applyMoney);
        builder.append(", auditRatifyMoney=");
        builder.append(auditRatifyMoney);
        builder.append(", subState=");
        builder.append(subState);
        builder.append(", state=");
        builder.append(state);
        builder.append(", clientType=");
        builder.append(clientType);
        builder.append(", loanTime=");
        builder.append(loanTime);
        builder.append(", signTime=");
        builder.append(signTime);
        builder.append(", delFlag=");
        builder.append(delFlag);
        builder.append(", createTime=");
        builder.append(createTime);
        builder.append(", createuser=");
        builder.append(createuser);
        builder.append(", updateTime=");
        builder.append(updateTime);
        builder.append(", modifyUser=");
        builder.append(modifyUser);
        builder.append(", opinionTime=");
        builder.append(opinionTime);
        builder.append(", contractNo=");
        builder.append(contractNo);
        builder.append("]");
        return builder.toString();
    }

}