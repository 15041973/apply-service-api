/**   
 * @Title: ApplyPersonassetsService.java 
 * @Package: com.myph.apply.service 
 * @company: 麦芽金服
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author 罗荣   
 * @date 2016年9月8日 下午2:57:29 
 * @version V1.0   
 */
package com.myph.personassets.service;

import com.myph.common.result.ServiceResult;
import com.myph.personassets.dto.ApplyPersonassetsDto;

/** 
 * @ClassName: ApplyPersonassetsService 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author 罗荣 
 * @date 2016年9月8日 下午2:57:29 
 *  
 */
public interface ApplyPersonassetsService {
    /**
     * 
     * @名称 insert
     * @描述 根据申请件单号，更新或者插入(这里用一句话描述这个方法的作用)
     * @返回类型 int
     * @日期 2016年9月8日 下午3:02:22
     * @创建人 罗荣
     * @更新人 罗荣
     *
     */
    int insert(ApplyPersonassetsDto record);

    /** 
     * @名称 getByAppNo 
     * @描述 TODO(这里用一句话描述这个方法的作用) 
     * @返回类型 ServiceResult<ApplyPersonassetsDto>     
     * @日期 2016年9月14日 下午3:59:27
     * @创建人  罗荣
     * @更新人  罗荣
     * 
     */
    ServiceResult<ApplyPersonassetsDto> getByAppNo(String appNo);
}
