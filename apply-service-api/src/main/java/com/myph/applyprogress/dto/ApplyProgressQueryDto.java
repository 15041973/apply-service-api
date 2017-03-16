package com.myph.applyprogress.dto;

import java.util.Date;
import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import org.springframework.format.annotation.DateTimeFormat;

import com.myph.common.bean.BaseInfo;

/**
 * 
 * @ClassName: ApplyprogressQueryDto
 * @Description: 申请进度查询Dto
 * @author 王海波
 * @date 2016年9月20日 上午9:39:34
 *
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class ApplyProgressQueryDto extends BaseInfo {
    /**
     * @Fields serialVersionUID :
     */
    private static final long serialVersionUID = -8164999703836174765L;
    private String applyLoanNo;// 申请单号

    private String memberName;// 客户姓名

    private Long areaId; // 大区ID

    private Long storeId;// 门店ID

    private Long bmId;// 业务经理

    private String bmName;// 业务经理名字

    private Long customerServiceId;// 客服

    private String customerServiceName;// 客服姓名

    private Integer state;// 状态

    private Integer subState;// 子状态
    
    private String subStateList;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date applyTimeStart;// 进件日期起

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date applyTimeEnd;// 进件日期止

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date signTimeStart;// 签约日期起

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date signTimeEnd;// 签约日期止

}
