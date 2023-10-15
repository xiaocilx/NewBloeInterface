package cc.perlink.Entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 用户信息
 */
@Data
@ApiModel("用户实体类")
@TableName("User")
public class User implements Serializable {
    @ApiModelProperty("用户ID")
    @TableId(type = IdType.AUTO)
    private int id;                  // 用户ID
    @ApiModelProperty("用户名")
    private String username;         // 用户名
    @ApiModelProperty("邮箱")
    private String email;            // 邮箱（默认使用邮箱登录）
    @ApiModelProperty("密码")
    private String password;         // 密码
    @ApiModelProperty("用户token")
    private String token;            // 用户token
    @ApiModelProperty("激活状态")
    private String activate;         // 激活状态，默认为0（未激活），1（激活）
    @ApiModelProperty("验证码")
    private String code;             // 验证码
    @ApiModelProperty("用户角色")
    private String role;             // 用户角色
    @ApiModelProperty("登录地址IP")
    private String ip;               // 登录地址IP
    @ApiModelProperty("创建时间")
    private Timestamp createTime;    // 创建时间
    @ApiModelProperty("更新时间")
    private Timestamp updateTime;    // 更新时间
}