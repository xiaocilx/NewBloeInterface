package cc.perlink.Entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("链接实体类")
@TableName("Link")
public class Link {
    @ApiModelProperty("链接ID")
    @TableId(type = IdType.AUTO)
    private Integer id;  // id
    @ApiModelProperty("链接名称")
    private String name; // 名称
    @ApiModelProperty("链接地址")
    private String url; // 名称
    @ApiModelProperty("备注")
    private String description;  // 备注
}
