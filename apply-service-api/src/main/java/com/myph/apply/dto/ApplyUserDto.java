package com.myph.apply.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import com.myph.common.bean.BaseInfo;
import com.myph.common.util.SensitiveInfoUtils;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class ApplyUserDto extends BaseInfo {

    private static final long serialVersionUID = -4026021493483777726L;

    private Long id;

    private String applyLoanNo; // 申请件单号

    private String memberName; // 客户姓名

    private String nameSpell; // 姓名拼音

    private String phone; // 手机号

    private String idCarNo; // 身份证号

    private Long customerServiceId;

    private Long bmId;

    private String bmName;

    private String customerSName;

    private Integer sex; // 性别

    private String eduCode; // 学历

    private String nation; // 民族

    private String SNSAccount; // QQ微信

    private String censusProvcode; // 户籍省code

    private String censusCitycode; // 户籍市code

    private String censusTowncode; // 户籍区code

    private String censusAddress; // 户籍详细地址

    private String liveProvcode; // 现住址省code

    private String liveCitycode; // 现住址市code

    private String liveTowncode; // 现住址区code

    private String liveAddress; // 现住址详细地址

    private String liveAddr;

    private String censusAddr;

    private String mailAddress; // 邮寄地址

    private String email; // 电子邮箱

    private Integer liveProperty; // 居住属性

    private Integer qualifiType; // 资质分类

    private Integer maritalStatus; // 婚姻状况

    private Integer haveChild; // 有无子女

    private Double haveLoan; // 其他借款

    private Double liveYears; // 现住址居住时间

    @Override
    public String toString() {
        return "ApplyUserDto [id=" + id + ", applyLoanNo=" + applyLoanNo + ", memberName="
                + SensitiveInfoUtils.maskUserName(memberName) + ", nameSpell=" + nameSpell + ", phone="
                + SensitiveInfoUtils.maskMobilePhone(phone) + ", idCarNo=" + SensitiveInfoUtils.maskIdCard(idCarNo)
                + ", customerServiceId=" + customerServiceId + ", bmId=" + bmId + ", bmName=" + bmName
                + ", customerSName=" + customerSName + ", sex=" + sex + ", eduCode=" + eduCode + ", nation=" + nation
                + ", SNSAccount=" + SNSAccount + ", censusProvcode=" + censusProvcode + ", censusCitycode="
                + censusCitycode + ", censusTowncode=" + censusTowncode + ", censusAddress=" + censusAddress
                + ", liveProvcode=" + liveProvcode + ", liveCitycode=" + liveCitycode + ", liveTowncode="
                + liveTowncode + ", liveAddress=" + liveAddress + ", liveAddr=" + liveAddr + ", censusAddr="
                + censusAddr + ", mailAddress=" + mailAddress + ", email=" + email + ", liveProperty=" + liveProperty
                + ", qualifiType=" + qualifiType + ", maritalStatus=" + maritalStatus + ", haveChild=" + haveChild
                + ", haveLoan=" + haveLoan + ", liveYears=" + liveYears + "]";
    }

}