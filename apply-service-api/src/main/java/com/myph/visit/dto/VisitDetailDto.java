package com.myph.visit.dto;

import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;

import org.springframework.format.annotation.DateTimeFormat;

import com.myph.common.bean.BaseInfo;
import com.myph.common.util.SensitiveInfoUtils;

@Data
@EqualsAndHashCode(callSuper = true)
public class VisitDetailDto extends BaseInfo {
    /**
     * @Fields serialVersionUID :
     */
    private static final long serialVersionUID = -502998817409262126L;
    private Long id;// 外访id
    private String applyLoanNo;// 申请单号
    private String memberName;// 客户姓名
    private String phone;// 手机号
    private String idCard;// 身份证号
    private Integer sex;// 性别
    private String addr;// 住宅详细地址
    private String workAddr;// 单位详细地址
    private String unitTelephone;// 单位电话
    private String extensionNumber;// 分机号
    private String requirement;// 信审外访要求
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date allotTime;// 外访分配时间
    private Date visitTime;// 外访时间
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date finishTime;// 分配外访完成时间
    private Long visitUser;// 外访人
    private Long allotUser;// 分配人
    private Integer state;// 外访状态
    private String remark;// 外访备注
    private Integer visitResult;// 外访结果
    private String visitUserName;// 外访人
    private Integer auditStage;// 信审阶段

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("VisitDetailDto [id=");
        builder.append(id);
        builder.append(", applyLoanNo=");
        builder.append(applyLoanNo);
        builder.append(", memberName=");
        builder.append(SensitiveInfoUtils.maskUserName(memberName));
        builder.append(", phone=");
        builder.append(SensitiveInfoUtils.maskMobilePhone(phone));
        builder.append(", idCard=");
        builder.append(SensitiveInfoUtils.maskIdCard(idCard));
        builder.append(", sex=");
        builder.append(sex);
        builder.append(", addr=");
        builder.append(addr);
        builder.append(", workAddr=");
        builder.append(workAddr);
        builder.append(", unitTelephone=");
        builder.append(SensitiveInfoUtils.maskFixedPhone(unitTelephone));
        builder.append(", extensionNumber=");
        builder.append(SensitiveInfoUtils.maskFixedPhone(extensionNumber));
        builder.append(", requirement=");
        builder.append(requirement);
        builder.append(", allotTime=");
        builder.append(allotTime);
        builder.append(", visitTime=");
        builder.append(visitTime);
        builder.append(", finishTime=");
        builder.append(finishTime);
        builder.append(", visitUser=");
        builder.append(visitUser);
        builder.append(", allotUser=");
        builder.append(allotUser);
        builder.append(", state=");
        builder.append(state);
        builder.append(", remark=");
        builder.append(remark);
        builder.append(", visitResult=");
        builder.append(visitResult);
        builder.append(", visitUserName=");
        builder.append(visitUserName);
        builder.append(", auditStage=");
        builder.append(auditStage);
        builder.append("]");
        return builder.toString();
    }

}
