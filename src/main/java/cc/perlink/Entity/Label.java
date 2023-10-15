package cc.perlink.Entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.sql.Timestamp;

/**
 * 标签
 */
@Data
@ApiModel("标签实体类")
@TableName("Label")
public class Label {

    @ApiModelProperty("标签ID")
    @TableId(type = IdType.AUTO)
    private Integer id;  // id
    @ApiModelProperty("标签名称")
    @TableField("name")
    private String name; // 名称
    @ApiModelProperty("备注")
    @TableField("description")
    private String description;  // 备注
}