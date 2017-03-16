package com.myph.visit.dto;

import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import org.springframework.format.annotation.DateTimeFormat;

import com.myph.common.bean.BaseInfo;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class VisitQueryDto extends BaseInfo {
    /**
     * @Fields serialVersionUID :
     */
    private static final long serialVersionUID = -8164999703836174765L;
    private String applyLoanNo;// 申请单号

    private String memberName;// 客户姓名

    private Long storeId;// 门店编号

    private String phone;// 手机号

    private Long bmId;// 业务经理ID

    private String bmName;// 业务经理名字

    private Long customerServiceId;// 客服ID

    private String customerServiceName;// 客服姓名

    private Integer state;// 外访状态
    private String progress;// 任务状态：代办，已办
    private Integer isManage;// 角色：副理,客服

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date applyTimeStart;// 进件日期起

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date applyTimeEnd;// 进件日期止

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createTimeStart;// 外访需求日期起

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createTimeEnd;// 外访需求日期止

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date allotTimeStart;// 外访分配时间起

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date allotTimeEnd;// 外访分配时间止

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date visitTimeStart;// 外访完成时间起

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date visitTimeEnd;// 外访完成时间止
}
