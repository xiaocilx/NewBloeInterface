package cc.perlink.Entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 设置
 */
@Data
@ApiModel("设置实体类")
@TableName("Option")
public class Option implements Serializable {
    @ApiModelProperty("设置ID")
    @TableId(type = IdType.AUTO)
    private int id;             // 配置ID，主键，自增
    @ApiModelProperty("名称")
    private String name;  // 名称，不能为空
    @ApiModelProperty("值")
    private String value; // 值，不能为空
    @ApiModelProperty("备注")
    private String description; // 备注
}