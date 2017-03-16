package com.myph.auditCall.dto;

import com.myph.common.bean.BaseInfo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class AuditCallDto extends BaseInfo {

    private static final long serialVersionUID = -2544198902174235266L;
    
    private Long phoneId;//JkApplyLinkman id
        
    private String name;
    
    private Integer type;
    
    private String typeDescription;
    
    private String phone;
    
    private String oldPhone;//老号码
    
    private String phoneExtension;//分机号码

    private String oldPhoneExtension;//老分机号码
    
    private Integer ifChangePhone;//号码是否更改，1更改，0未更改
    
    private Long remarkId;//电调记录id
    
    private String remark;
    
    private String oldRemark;//老电调信息
    
    private Integer ifChangeRemark;//电调信息是否更改，1更改，0未更改
}
