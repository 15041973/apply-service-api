package com.myph.apply.dto;

import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import com.myph.common.bean.BaseInfo;

/**
 * 
 * @ClassName: FileUploadDto
 * @Description: 根据申请单编号查找文件及申请单部分信息
 * @author 吴阳春
 * @date 2016年9月14日 上午7:25:45
 *
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class FileUploadDto extends BaseInfo {

    private static final long serialVersionUID = 2389074674814380668L;

    private Long id;

    private String applyLoanNo;// 申请件单号
    
    private List<FileDto> fileDtoList;//文件信息

    private Integer state;// 申请件主状态

    private String stateName;// 申请件主状态名称

    private String memberName;// 客户姓名

    private Long productTypeId;// 产品类型

    private String productName;// 产品名称

    private Long fileUpState;// 文件阶段，用于判断要显示的文件阶段

    private Integer isManage;// 是否是管理员 ：0不是，1是，用于辨别是否需要允许展示所有文件

    private Integer isView;// 查看or管理，用于辨别是否需要展示删除与上传按钮：0查看，1管理

}