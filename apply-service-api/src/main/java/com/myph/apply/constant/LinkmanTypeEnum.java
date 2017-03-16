/**   
 * @Title: LinkmanType.java 
 * @Package: com.myph.apply.constant
 * @company: 麦芽金服
 * @Description: TODO
 * @date 2016年9月19日 下午1:04:36 
 * @version V1.0   
 */
package com.myph.apply.constant;

import java.util.Map;

import org.springframework.util.CollectionUtils;

import com.google.common.collect.Maps;

/** 
 * 联系人类型
 * @ClassName: LinkmanType 
 * @Description: TODO
 * @author hf 
 * @date 2016年9月19日 下午1:04:36 
 *  
 */
public enum LinkmanTypeEnum {
	
	FAMILY_CONTACT(1,"直系亲属"),WORK_CONTACT(2,"同事"),FRIEND_CONTACT(3,"朋友"),OTHER_CONTACT(4,"其他亲属");
	
	private int type;
	
	private String name;
	
	private static final Map<Integer, String> linkmanTypeMap = Maps.newHashMap();
	
	LinkmanTypeEnum(int type,String name) {
		this.type = type;
		this.name = name;
	}

	public int getType() {
		return type;
	}


	public String getName() {
		return name;
	}
	
	private static void init() {
	    for (LinkmanTypeEnum c : LinkmanTypeEnum.values()){
	        linkmanTypeMap.put(c.type, c.name);
	    }
	}
	
	public static String getName(int type) {
	    if (CollectionUtils.isEmpty(linkmanTypeMap)) {
	        init();
	    }
	    return linkmanTypeMap.get(type);
    }
}
