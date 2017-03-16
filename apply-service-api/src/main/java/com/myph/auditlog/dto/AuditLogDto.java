package com.myph.auditlog.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.myph.common.bean.BaseInfo;
import com.myph.constant.ApplyUtils;
import com.myph.constant.FlowStateEnum;
import com.myph.constant.bis.ApplyBisStateEnum;
import com.myph.constant.bis.AuditDirectorBisStateEnum;
import com.myph.constant.bis.AuditFirstBisStateEnum;
import com.myph.constant.bis.AuditLastBisStateEnum;
import com.myph.constant.bis.AuditManagerBisStateEnum;
import com.myph.flow.dto.AbandonActionDto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class AuditLogDto extends BaseInfo {
    /**
     * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
     */
    private static final long serialVersionUID = -890284876347720219L;

    private Long id;

    private String applyLoanNo;

    private Integer auditStage;

    private Integer auditResult;

    private String mainCause;

    private String lesserCause;

    private String productName;

    private Integer loanPeriods;

    private BigDecimal suggestMoney;

    private String interiorRemark;

    private String publicRemark;

    private Date updateTime;

    private Date createTime;

    private Integer delFlag;

    private String createUser;

    private Long backReasonId;

    private String backReasonDesc;

    private Long auditor;

    public String getAuditStageName() {
        String name = null;
        switch (FlowStateEnum.getEnum(this.auditStage)) {
            case AUDIT_MANAGER:
                if (this.auditResult.equals(AuditManagerBisStateEnum.BACK_INIT.getCode())) {
                    name = FlowStateEnum.AUDIT_DIRECTOR.getDesc();
                }
                break;
            case AUDIT_FIRST:
                if (this.auditResult.equals(AuditFirstBisStateEnum.BACK_INIT.getCode())) {
                    name = FlowStateEnum.AUDIT_LASTED.getDesc();
                }
                break;
            case AUDIT_LASTED:
                if (this.auditResult.equals(AuditLastBisStateEnum.BACK_INIT.getCode())) {
                    name = FlowStateEnum.AUDIT_MANAGER.getDesc();
                }
                break;
            case APPLY:
                if (this.auditResult.equals(ApplyBisStateEnum.BACK_INIT.getCode())) {
                    name = FlowStateEnum.AUDIT_FIRST.getDesc();
                }
                break;
            default:
                break;
        }
        if (null == name) {
            name = FlowStateEnum.getDescByCode(this.auditStage);
        }
        return name;
    }

    public String getAuditResultDesc() {
        String desc = AuditFirstBisStateEnum.getName(this.auditResult);
        if (null == desc) {
            desc = AuditLastBisStateEnum.getName(this.auditResult);
        }
        if (null == desc) {
            desc = ApplyBisStateEnum.getName(this.auditResult);
        }
        if (null == desc) {
            desc = ApplyUtils.getFullStateDesc(this.auditStage, this.auditResult);
        }
        return desc;
    }

}