/**   
 * @Title: ApproveDto.java 
 * @Package: com.myph.apply.dto 
 * @company: 麦芽金服
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author 罗荣   
 * @date 2016年9月19日 上午8:54:55 
 * @version V1.0   
 */
package com.myph.apply.dto;

import java.util.Date;

import com.myph.common.bean.BaseInfo;
import com.myph.constant.FlowStateEnum;
import com.myph.constant.bis.ApplyBisStateEnum;
import com.myph.constant.bis.AuditDirectorBisStateEnum;
import com.myph.constant.bis.AuditFirstBisStateEnum;
import com.myph.constant.bis.AuditLastBisStateEnum;
import com.myph.constant.bis.AuditManagerBisStateEnum;
import com.myph.constant.bis.SignBisStateEnum;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/** 
 * @ClassName: ApproveDto 
 * @Description: 列表显示实体(这里用一句话描述这个类的作用) 
 * @author 罗荣 
 * @date 2016年9月19日 上午8:54:55 
 *  
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class ApproveDto extends BaseInfo{

    /** 
     * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
     */ 
    private static final long serialVersionUID = 2895196914534968366L;
    
    private String applyLoanNo;
    
    private String memberName;
    
    private String idCard;
    
    private String areaName;
    
    private Long areaId;
    
    private String storeName;
    
    private Long storeId;
    
    private String proName;
    
    private Long proId;
    
    private Date submitDate;
    
    private Date firstApproveDate;
    
    private Date lastApproveDate;
    
    private Long firstApproveUserId;

    private Long reviewAuditorUserId;
    
    private Long lastAuditorUserId;
    
    private Long superLastAuditorUserId;
    
    private String firstAuditorName;
    
    private String reviewAuditorName;
    
    private String LastAuditorName;
    
    private String superLastAuditorName;
    
    private Integer state;
    
    private Integer subState;
    
    private String stateName;
    
    private Long  id;
    
    public boolean getEditAuditor(){
        if(this.subState.equals(ApplyBisStateEnum.BACK_INIT.getCode())){
            return false;
        }
        if(null == firstApproveUserId && this.subState.equals(AuditFirstBisStateEnum.INIT.getCode())){
            return false;
        }
        if(null == reviewAuditorUserId && this.subState.equals(AuditLastBisStateEnum.INIT.getCode())){
            return false;
        }
        if(null == lastAuditorUserId && this.subState.equals(AuditManagerBisStateEnum.INIT.getCode())){
            return false;
        }
        if(null == superLastAuditorUserId && this.subState.equals(AuditDirectorBisStateEnum.INIT.getCode())){
            return false;
        }
        if(this.state.equals(FlowStateEnum.SIGN.getCode())){
            return false;
        }
        if(this.state.equals(FlowStateEnum.REJECT.getCode())){
            return false;
        }
        if(this.state.equals(FlowStateEnum.ABANDON.getCode())){
            return false;
        }
        if(this.state.equals(FlowStateEnum.FINISH.getCode())){
            return false;
        }
        if(this.state.equals(FlowStateEnum.CONTRACT.getCode())){
            return false;
        }
        if(this.state.equals(FlowStateEnum.FINANCE.getCode())){
            return false;
        }
        if(this.state.equals(FlowStateEnum.EXTERNAL_FIRST.getCode())){
            return false;
        }
        if(this.state.equals(FlowStateEnum.EXTERNAL_LAST.getCode())){
            return false;
        }
        return true;
    }

}
