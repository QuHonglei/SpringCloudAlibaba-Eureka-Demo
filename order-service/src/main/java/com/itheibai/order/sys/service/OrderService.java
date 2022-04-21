package com.itheibai.order.sys.service;

import com.itheibai.order.sys.pojo.Order;
import com.baomidou.mybatisplus.extension.service.IService;
import com.itheibai.order.sys.pojo.OrderAndUserView;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author itheibai
 * @since 2022-04-21
 */
public interface OrderService extends IService<Order> {

    /**
     * 根据订单id,查询订单和用户信息
     * @param id
     * @return
     */
    OrderAndUserView getOrderAndUserViewByIdById(Integer id);
}
