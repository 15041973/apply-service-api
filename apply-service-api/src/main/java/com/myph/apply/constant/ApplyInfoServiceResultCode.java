package com.myph.apply.constant;

import com.myph.common.constant.CodeStartEnum;
import com.myph.common.constant.ServiceResultCode;
import com.myph.common.util.ResultCodeUtils;
import com.myph.constant.ApplyServiceCodeEnum;

/**
 * 
 * @ClassName: TeamServiceResultCode
 * @Description: 实现ServiceResultCode
 *               <p>
 *               如果有修改过程，请记录
 *               </P>
 * @author heyx
 * @date 2016年9月7日 上午10:28:25
 *
 */
public enum ApplyInfoServiceResultCode implements ServiceResultCode {

    DEL_FAIL(2, "删除团队失败"), UPDATE_FAIL(3, "更新团队失败"), ADD_FAIL(4, "新增团队失败"),
    APPINFO_UPDATE_NOFOUND(5,"更新信息没有匹配");

    ApplyInfoServiceResultCode(int code, String message) {
        this.message = message;
        this.code = code;
    }

    private String message;
    private int code;

    @Override
    public Integer getCode() {
        return ResultCodeUtils.getResultCode(CodeStartEnum.EMPLOYEE_SERVICE.getCode(),
                ApplyServiceCodeEnum.APPLY_SERVICE.getCode(), this.formartCode());
    }

    @Override
    public String getMsg() {
        return this.message;
    }

    public String formartCode() {
        return ResultCodeUtils.formatString(this.code, 4);
    }
}
