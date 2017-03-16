package com.myph.apply.dto;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import com.myph.common.bean.BaseInfo;

/**
 * 
 * @ClassName: FileManageApplyInfoDto 
 * @Description: 用于附件管理-管理员页面
 * @author 吴阳春 
 * @date 2016年9月9日 上午10:03:11 
 *
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class FileManageApplyInfoDto extends BaseInfo {

    private static final long serialVersionUID = 6204844397169067437L;

    private Long id;

    private String applyLoanNo;
    
    private String contractNo;

    private String memberName;

    private String nameSpell;

    private String phone;

    private String idCard;

    private Long cityId;

    private Long storeId;
    
    private String storeName;//门店名称

    private Long areaId;
    
    private String areaName;//大区名称

    private Long bmId;
    
    private String bmName;//业务经理姓名

    private Long customerServiceId;
    
    private String customerServiceName;//客服姓名

    private String memberType;

    private String infoChannel;

    private String loanPurpose;

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

    private String stateName;//主状态名称
    
    private Integer delFlag;

    private Date createTime;

    private String createuser;

    private Date updateTime;

    private String modifyUser;

}