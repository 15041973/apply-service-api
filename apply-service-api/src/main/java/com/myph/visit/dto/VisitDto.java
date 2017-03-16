package com.myph.visit.dto;

import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;

import com.myph.common.bean.BaseInfo;
import com.myph.common.util.SensitiveInfoUtils;

@Data
@EqualsAndHashCode(callSuper = true)
public class VisitDto extends BaseInfo {
    /**
     * @Fields serialVersionUID :
     */
    private static final long serialVersionUID = -5647703977147564164L;

    private Long id;// 外访主键
    private String applyLoanNo;// 申请单号

    private Integer auditStage;// 信审阶段

    private Long allotUser;// 分配人

    private Long visitUser;// 外访人

    private Date visitTime;// 外访时间

    private String requirement;// 信审外访要求

    private String remark;// 外访备注

    private Integer state;// 外访状态

    private Integer visitResult;// 外访结果

    private Date updateTime;// 修改时间

    private Integer delFlag;// 删除标记

    private Date createTime;// 外访申请时间

    private Date allotTime;// 外访分配时间

    private Date finishTime;// 外访完成时间

    private Long applyUser;// 申请人

    private String memberName;// 客户姓名

    private String phone;// 手机号

    private Long bmId;// 业务经理

    private Long storeId;// 门店编号

    private Long customerServiceId;// 客服

    private Date applyTime;// 进件日期

    private String bmName;// 业务经理
    private String visitUserName;// 外访人
    private String storeName;// 门店编号
    private String customerServiceName;// 客服

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("VisitDto [id=");
        builder.append(id);
        builder.append(", applyLoanNo=");
        builder.append(applyLoanNo);
        builder.append(", auditStage=");
        builder.append(auditStage);
        builder.append(", allotUser=");
        builder.append(allotUser);
        builder.append(", visitUser=");
        builder.append(visitUser);
        builder.append(", visitTime=");
        builder.append(visitTime);
        builder.append(", requirement=");
        builder.append(requirement);
        builder.append(", remark=");
        builder.append(remark);
        builder.append(", state=");
        builder.append(state);
        builder.append(", visitResult=");
        builder.append(visitResult);
        builder.append(", updateTime=");
        builder.append(updateTime);
        builder.append(", delFlag=");
        builder.append(delFlag);
        builder.append(", createTime=");
        builder.append(createTime);
        builder.append(", allotTime=");
        builder.append(allotTime);
        builder.append(", finishTime=");
        builder.append(finishTime);
        builder.append(", applyUser=");
        builder.append(applyUser);
        builder.append(", memberName=");
        builder.append(SensitiveInfoUtils.maskUserName(memberName));
        builder.append(", phone=");
        builder.append(SensitiveInfoUtils.maskMobilePhone(phone));
        builder.append(", bmId=");
        builder.append(bmId);
        builder.append(", storeId=");
        builder.append(storeId);
        builder.append(", customerServiceId=");
        builder.append(customerServiceId);
        builder.append(", applyTime=");
        builder.append(applyTime);
        builder.append(", bmName=");
        builder.append(bmName);
        builder.append(", visitUserName=");
        builder.append(visitUserName);
        builder.append(", storeName=");
        builder.append(storeName);
        builder.append(", customerServiceName=");
        builder.append(customerServiceName);
        builder.append("]");
        return builder.toString();
    }

}
