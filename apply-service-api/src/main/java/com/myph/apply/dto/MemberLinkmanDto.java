package com.myph.apply.dto;

import java.util.Date;

import com.myph.common.bean.BaseInfo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 客户联系人
 * 
 * @ClassName: MemberLinkmanDto
 * @Description: TODO
 * @author hf
 * @date 2016年9月19日 下午6:55:23
 *
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class MemberLinkmanDto extends BaseInfo {
    /**
     * @Fields serialVersionUID : TODO
     */
    private static final long serialVersionUID = -6848481800554922593L;

    private Long id;

    private Long memberId;

    private Integer linkManType;

    private String linkManName;

    private String linkManPhone;

    private String linkManRelation;

    private Integer linkManKnowLoan;

    private String linkManHomeAddress;

    private String linkManHomeName;

    private String linkManCompanyName;

    private String linkManCompanyAddress;

    private String linkManCompanyAddr;

    private Date createTime;

    private String createUser;

    private Date modifyTime;

    private String modifyUser;

    private String alternatePhone;
    
    private Integer clientType;//'信息来源:0web,1app'

}