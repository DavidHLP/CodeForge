package com.david.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import java.time.LocalDateTime;


@Data
public abstract class BaseAuditEntity {
	@TableField(value = "created_at", fill = FieldFill.INSERT)
	private LocalDateTime createdAt;


	@TableField(value = "updated_at", fill = FieldFill.INSERT_UPDATE)
	private LocalDateTime updatedAt;
}