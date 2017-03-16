package com.myph.auditCall.constant;

import java.util.Map;

import org.springframework.util.CollectionUtils;

import com.google.common.collect.Maps;

/**
 * 
 * @ClassName: AuditCallHisType
 * @Description: 电调类型
 * @author 吴阳春
 * @date 2016年10月7日 下午10:53:29
 *
 */
public enum AuditCallHisType {

    MY(1, "本人电话"), JOB(2, "工作"), MATE(3, "配偶"), PARENT(4, "父母"), CHILDREN(5, "子女"), WORK(6, "同事"), FRIEND(7, "朋友"),OTHER_MY(8,"备用号码"),OTHER_CONTACT(9,"其他亲属");
    private int type;

    private String name;

    private static final Map<Integer, AuditCallHisType> auditCallHisMap = Maps.newHashMap();

    AuditCallHisType(int type, String name) {
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
        for (AuditCallHisType c : AuditCallHisType.values()){
            auditCallHisMap.put(c.type, c);
        }
    }
    
    public static AuditCallHisType getEnum(Integer code) {
        if (CollectionUtils.isEmpty(auditCallHisMap)) {
            init();
        }
        return auditCallHisMap.get(code);
    }

}
