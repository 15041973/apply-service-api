/**   
 * @Title: SmsServiceDto.java 
 * @Package: com.myph.sms.dto
 * @company: 麦芽金服
 * @Description: TODO
 * @date 2016年9月8日 上午10:13:01 
 * @version V1.0   
 */
package com.myph.apply.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import com.myph.common.bean.BaseInfo;
import com.myph.common.util.SensitiveInfoUtils;

/**
 * 
 * @ClassName: RowKeyServiceDto
 * @Description: 获取征信rowkey
 * @author heyx
 * @date 2016年9月27日 下午4:16:02
 *
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class RowKeyServiceDto extends BaseInfo {

    /**
     * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
     */
    private static final long serialVersionUID = 796492161577014047L;

    private String name;

    private String idno;

    private String mobile;

    @Override
    public String toString() {
        return "RowKeyServiceDto [name=" + SensitiveInfoUtils.maskUserName(name) + ", idno="
                + SensitiveInfoUtils.maskIdCard(idno) + ", mobile=" + SensitiveInfoUtils.maskMobilePhone(mobile) + "]";
    }

}
