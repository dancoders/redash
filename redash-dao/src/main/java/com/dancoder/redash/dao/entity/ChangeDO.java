package com.dancoder.redash.dao.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import javax.persistence.Table;
import java.sql.Timestamp;

/**
 * @author dancoder
 */
@Data
@Table(name = "changes")
public class ChangeDO {
    @TableId(type = IdType.AUTO)
    private Long id;
    private Long objectVersion;
    private Long userId;
    private Long objectId;
    private String objectType;
    private String change;
    @TableField(fill = FieldFill.INSERT)
    private Timestamp createdAt;
}
