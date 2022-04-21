package com.itheibai.order.sys.dao;

import com.itheibai.order.sys.pojo.Order;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheibai.order.sys.pojo.OrderAndUserView;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author itheibai
 * @since 2022-04-21
 */
@Mapper
public interface OrderDao extends BaseMapper<Order> {

    OrderAndUserView getOrderAndUserViewByIdById(Integer id);
}
