package com.itheibai.user.sys.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author itheibai
 * @since 2022-04-21
 */
@Getter
@Setter
@TableName("tb_user")
@ApiModel(value = "User对象", description = "")
public class User {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("收件人")
    @TableField("username")
    private String username;

    @ApiModelProperty("地址")
    @TableField("address")
    private String address;


}
