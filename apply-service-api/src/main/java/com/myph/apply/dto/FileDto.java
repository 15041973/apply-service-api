package com.myph.apply.dto;

import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import com.myph.common.bean.BaseInfo;

/**
 * 
 * @ClassName: FileDto
 * @Description: 文件基本信息
 * @author 吴阳春
 * @date 2016年9月13日 下午4:23:32
 *
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class FileDto extends BaseInfo {

    private static final long serialVersionUID = -4209497667745055997L;

    private Long id;

    private String applyLoanNo;// 申请件单号

    private String fileName;// 文件名称

    private String fileFormart;// 文件格式

    private Long fileSize;// 文件大小

    private String fileStr;// 大数据附件ID（文件路径）

    private Long uploadState;// 文件上传阶段

    private String uploadStateName;// 上传阶段名称

    private String uploadType;// 上传目录
    
    private Long uploadId;// 上传目录id

    private Date createTime;// 创建时间

}