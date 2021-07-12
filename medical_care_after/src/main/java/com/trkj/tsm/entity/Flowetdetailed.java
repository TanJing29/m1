package com.trkj.tsm.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * flowetdetailed
 * @author 
 */
@Data
public class Flowetdetailed implements Serializable {
    /**
     * 流程id
     */
    private Integer fid;

    /**
     * 流程类型
     */
    private String flowname;

    /**
     * 申请人
     */
    private String applyfor;

    /**
     * 当前节点审批人
     */
    private String beforpanel;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 申请流程时间
     */
    private Date initiatetime;

    /**
     * 结束流程时间
     */
    private Date finishtime;

    /**
     * 申请表类型信息
     */
    private String procData;

    private static final long serialVersionUID = 1L;
}