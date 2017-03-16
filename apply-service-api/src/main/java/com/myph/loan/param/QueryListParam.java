/**   
 * @Title: QueryListParam.java 
 * @Package: com.myph.loan.param 
 * @company: 麦芽金服
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author 罗荣   
 * @date 2016年10月26日 下午2:28:42 
 * @version V1.0   
 */
package com.myph.loan.param;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.myph.common.bean.BaseInfo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/** 
 * @ClassName: QueryListParam 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author 罗荣 
 * @date 2016年10月26日 下午2:28:42 
 *  
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class QueryListParam extends BaseInfo{

    /** 
     * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
     */ 
    private static final long serialVersionUID = -767638164968965103L;
    
    private String applyLoanNo;// 订单编号

    private String memberName;// 贷款人

    private String contractNo;// 身份ID
    
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date submitDates; // 开始
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date submitDatee; // 结束
    
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date signDates; // 开始
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date signDatee; // 结束
    
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date loanDates; // 开始
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date loanDatee; // 结束

    private Long areaId;// 区域

    private Long storeId;// 分公司

    private Long proId;// 分产品
    
    private Long productType;//产品分类
    
    private Integer status;
}
