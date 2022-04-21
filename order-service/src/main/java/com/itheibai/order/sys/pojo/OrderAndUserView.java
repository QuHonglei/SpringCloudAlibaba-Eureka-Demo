package com.itheibai.order.sys.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "OrderAndUserView对象", description = "")
public class OrderAndUserView {
    @ApiModelProperty("订单id")
    private Long id;

    @ApiModelProperty("用户id")
    private Long userId;

    @ApiModelProperty("商品名称")
    private String name;

    @ApiModelProperty("商品价格")
    private Long price;

    @ApiModelProperty("商品数量")
    private Integer num;

    @ApiModelProperty("用户信息")
    private User user;
}
