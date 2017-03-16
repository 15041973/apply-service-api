package com.myph.constant.bis;

import com.myph.common.util.ResultCodeUtils;
import com.myph.constant.BusinessState;
import com.myph.constant.FlowStateEnum;

public enum AbandonBisStateEnum implements BusinessState {
	INIT(1, "客户放弃"), FIRSTAUDITOR_GIVEUP(2, "初审放弃");
	AbandonBisStateEnum(int code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	private int code;
	private String desc;

	@Override
	public Integer getCode() {
		// 转成2为长度的code码，不足两位前面补齐0
		return ResultCodeUtils.getResultCode(FlowStateEnum.ABANDON.getCode() + "",
				ResultCodeUtils.formatString(code, 2));
	}

	@Override
	public String getDesc() {
		return this.desc;
	}

}
