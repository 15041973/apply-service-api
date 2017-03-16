/**   
 * @Title: JkApplyAudit.java 
 * @Package: com.myph.audit.service
 * @company: 麦芽金服
 * @Description: TODO
 * @date 2016年9月20日 下午7:08:50 
 * @version V1.0   
 */
package com.myph.reception.service;

import com.myph.common.result.ServiceResult;
import com.myph.reception.dto.ApplyReceptionManageDto;

/**
 * 
 * @ClassName: ApplyReceptionManageService
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author heyx
 * @date 2016年11月17日 上午10:33:30
 *
 */
public interface ApplyReceptionManageService {

    /**
     * 
     * @名称 batchUpdateCustomer
     * @描述 批量修改
     * @返回类型 ServiceResult<Integer>
     * @日期 2016年11月17日 上午10:33:30
     * @创建人 heyx
     * @更新人 heyx
     *
     */
    ServiceResult<Integer> updateCustomer(ApplyReceptionManageDto parmDto);
}
