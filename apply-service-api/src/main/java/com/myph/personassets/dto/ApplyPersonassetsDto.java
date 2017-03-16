/**   
 * @Title: ApplyPersonassetsDto.java 
 * @Package: com.myph.apply.dto 
 * @company: 麦芽金服
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author 罗荣   
 * @date 2016年9月8日 下午2:56:37 
 * @version V1.0   
 */
package com.myph.personassets.dto;

import java.math.BigDecimal;

import com.myph.common.bean.BaseInfo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @ClassName: ApplyPersonassetsDto
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 罗荣
 * @date 2016年9月8日 下午2:56:37
 * 
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class ApplyPersonassetsDto extends BaseInfo {

    /**
     * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
     */
    private static final long serialVersionUID = 8493416236045872657L;
    private Long id;

    private String applyLoanNo;

    private Integer houseNum;

    private Integer carNum;

    private Integer loanHouseNum;

    private Integer loanCarNum;

    private BigDecimal loanHouseAmount;

    private BigDecimal loanCarAmount;
    
    private Integer state;
}
