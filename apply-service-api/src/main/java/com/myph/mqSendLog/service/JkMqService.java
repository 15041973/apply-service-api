package com.myph.mqSendLog.service;

import java.util.Date;
import java.util.List;

import com.myph.mqSendLog.dto.JkMqLogDto;

/**
 * @author rui23
 * @version 创建时间：2016年10月20日 下午4:27:12
 * @类说明
 */
public interface JkMqService {
	public List<JkMqLogDto> queryAllNeedSendMqData(Date startTime, Date endTime);

	/**
	 * 删除不需要重发送mq（征信）的数据
	 * 
	 * @author rui23
	 * @version 创建时间：2016年10月20日 下午4:28:58
	 */
	public void deleteAllDisableData();
	
	public int update(JkMqLogDto dto);
	
	public JkMqLogDto queryByApplyNo(String applyNo);

	/**
	 * 将该申请单设置为不需要再发送状态
	 * 
	 * @author rui23
	 * @param applyNo
	 * @return
	 * @version 创建时间：2016年10月21日 下午5:30:34
	 */
	public int notResend(String applyNo);

	public void insert(JkMqLogDto dto);
	
}
