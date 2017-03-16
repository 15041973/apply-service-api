/**   
 * @Title: LinkmanType.java 
 * @Package: com.myph.apply.constant
 * @company: 麦芽金服
 * @Description: TODO
 * @date 2016年9月19日 下午1:04:36 
 * @version V1.0   
 */
package com.myph.compliance.constant;

public enum ComplianceResultEnum {
	
	PASS(1,"通过"),ROLLBACK(2,"回退");
	
	private int type;
	
	private String name;
	
	ComplianceResultEnum(int type,String name) {
		this.type = type;
		this.name = name;
	}

	public int getType() {
		return type;
	}


	public String getName() {
		return name;
	}

}
