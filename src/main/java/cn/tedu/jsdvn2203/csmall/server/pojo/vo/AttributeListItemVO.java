package cn.tedu.jsdvn2203.csmall.server.pojo.vo;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AttributeListItemVO {
    private Long id;
    private Long templateId;
    private String name;
    private String description;
    private Integer type;
    private Integer inputType;
    private String valueList;
    private String unit;
    private Integer sort;
    private Integer isAllowCustomize;
    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;
}
