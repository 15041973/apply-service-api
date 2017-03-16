/**   
 * @Title: ApproveParam.java 
 * @Package: com.myph.manage.param 
 * @company: 麦芽金服
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author 罗荣   
 * @date 2016年9月18日 下午7:00:23 
 * @version V1.0   
 */
package com.myph.approvetask.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.myph.common.rom.annotation.BasePage;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @ClassName: ApproveParam
 * @Description: 审批 列表 查询参数(这里用一句话描述这个类的作用)
 * @author 罗荣
 * @date 2016年9月18日 下午7:00:23
 * 
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class ApproveParamDto extends BasePage {

    /**
     * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
     */
    private static final long serialVersionUID = -9203385804999587954L;

    private String applyLoanNo;// 订单编号

    private String memberName;// 贷款人

    private String idCard;// 身份ID
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date submitDates; // 开始

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date submitDatee; // 结束

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date approveFisrtDates; // 初审开始
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date approveFisrtDatee; // 初审结束
    
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date approveLastDates; // 终审开始
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date approveLastDatee; // 终审结束
    
    private Long areaId;// 区域

    private Long storeId;// 分公司

    private Long proId;// 分产品
    
    private Long productType;//产品分类

    private Integer isAssigned;// 是否分配

    private String sortKey;// 排序关键字

    private String sortValue;// 是升序还是降序
}
