/**   
 * @Title: AllotService.java 
 * @Package: com.myph.allot.service 
 * @company: 麦芽金服
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author 罗荣   
 * @date 2016年10月24日 下午3:22:30 
 * @version V1.0   
 */
package com.myph.allot.service;

import com.myph.allot.dto.AllotLogDto;
import com.myph.common.result.ServiceResult;

/** 
 * @ClassName: AllotService 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author 罗荣 
 * @date 2016年10月24日 下午3:22:30 
 *  
 */
public interface AllotService {
    public ServiceResult insertLog(AllotLogDto dto);

}
