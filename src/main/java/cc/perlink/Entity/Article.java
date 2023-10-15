package cc.perlink.Entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.sql.Timestamp;

/**
 * 文章
 */
@Data
@ApiModel("文章实体类")
@TableName("Article")
public class Article {
    @ApiModelProperty("文章ID")
    @TableId(type = IdType.AUTO)
    private int id;
    @ApiModelProperty("文章标题")
    private String title;
    @ApiModelProperty("文章创建时间")
    private String date;
    @ApiModelProperty("文章内容")
    private String content;
    @ApiModelProperty("文章摘要")
    private String excerpt;
    @ApiModelProperty("文章封面图")
    private String cover;
    @ApiModelProperty("文章作者")
    private String author;
    @ApiModelProperty("文章分类")
    private String sort;
    @ApiModelProperty("浏览数")
    private int views;
    @ApiModelProperty("评论数")
    private int comnum;
    @ApiModelProperty("是否显示（n/y）")
    private String hide;
    @ApiModelProperty("文章密码")
    private String password;
    @ApiModelProperty("文章标签")
    private String label;
    @ApiModelProperty("备注")
    private String description;
    @ApiModelProperty("用户token")
    private String token;            // 用户token
}