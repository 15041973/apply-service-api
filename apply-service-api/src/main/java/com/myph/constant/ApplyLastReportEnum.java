package com.myph.constant;

/**
 * 
 * @ClassName: ApplyFirstReportEnum 
 * @Description: 初审报告验证KEY(这里用一句话描述这个类的作用) 
 * @author 罗荣 
 * @date 2016年11月1日 上午9:24:49 
 *
 */
public enum ApplyLastReportEnum {

    mobile_investigation("电话调查"),
    personassets("现金与流量统计，财务与资产信息");
    
    ApplyLastReportEnum(String desc) {
      this.desc = desc;
    }

    private String desc;
    
    public String getDesc(){
        return this.desc;
    }
    public String getKey(String applyLoanNo){
        return this.name()+":"+applyLoanNo;
    }
}
