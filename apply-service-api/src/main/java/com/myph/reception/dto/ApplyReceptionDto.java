package com.myph.reception.dto;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.myph.common.bean.BaseInfo;
import com.myph.common.util.SensitiveInfoUtils;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class ApplyReceptionDto extends BaseInfo {
    private static final long serialVersionUID = -4263659891590893806L;

    private Long id;

    private String applyLoanNo; // 申请件单号

    private String memberName;// 客户姓名

    private String nameSpell;// 姓名拼音

    private String phone;// 手机号

    private String idCard;// 身份证号

    private Long cityId;// 城市Id

    private String cityCode;// 城市Id

    private Long storeId;// 门店编号

    private String storeName; // 组织名称

    private Long areaId;// 大区

    private String areaName;// 大区name

    private Long bmId;// 业务经理

    private String bmName;// 业务经理名字

    private Long customerServiceId;

    private String customerSName;

    private String memberType;// 客户类型

    private String infoChannel;// 信息获知渠道

    private Long loanUse;// 借款用途

    private String affordMonthRepay;// 可承受月还款额

    private Long prodType;// 产品类型

    private Long productId;// 产品id

    private Integer loanPeriods;// 贷款期数

    private BigDecimal applyMoney;// 申请金额

    private String expectLoanAmount;// 期望获得贷款额

    private Integer state;// 受理结论

    private Integer clientType;

    private Date updateTime;// 修改时间

    private Integer delFlag;// 删除标记

    private Date createTime;// 创建时间

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date queryTime;// 查询时间

    private String createUser;// 创建人

    private Date allotDate;// 创建时间

    private String loanPurpose;// 贷款详细用途

    private String description;// 描述

    @Override
    public String toString() {
        return "ApplyReceptionDto [applyLoanNo=" + applyLoanNo + ", memberName="
                + SensitiveInfoUtils.maskUserName(memberName) + ", nameSpell=" + nameSpell + ", phone="
                + SensitiveInfoUtils.maskMobilePhone(phone) + ", idCard=" + SensitiveInfoUtils.maskIdCard(idCard)
                + ", cityId=" + cityId + ",cityCode=" + cityCode + ", storeId=" + storeId + ", storeName=" + storeName
                + ", areaId=" + areaId + ", bmId=" + bmId + ", bmName=" + bmName + ", customerServiceId="
                + customerServiceId + ", customerSName=" + customerSName + ", memberType=" + memberType
                + ", infoChannel=" + infoChannel + ", loanUse=" + loanUse + ", affordMonthRepay=" + affordMonthRepay
                + ", prodType=" + prodType + ", productId=" + productId + ", loanPeriods=" + loanPeriods
                + ", applyMoney=" + applyMoney + ", expectLoanAmount=" + expectLoanAmount + ", state=" + state
                + ", clientType=" + clientType + ", createUser=" + createUser + "]";
    }
}