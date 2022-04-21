package com.itheibai.order.sys.service.impl;

import com.itheibai.order.sys.pojo.Order;
import com.itheibai.order.sys.dao.OrderDao;
import com.itheibai.order.sys.pojo.OrderAndUserView;
import com.itheibai.order.sys.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author itheibai
 * @since 2022-04-21
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderDao, Order> implements OrderService {
    @Autowired
    OrderDao orderDao;

    @Override
    public OrderAndUserView getOrderAndUserViewByIdById(Integer id) {
        return orderDao.getOrderAndUserViewByIdById(id);
    }
}
