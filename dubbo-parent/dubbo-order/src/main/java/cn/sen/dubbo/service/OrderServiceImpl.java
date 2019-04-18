package cn.sen.dubbo.service;

import cn.sen.dubbo.model.Order;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OrderServiceImpl implements OrderService {

    public List<Order> query() {

        Order order1 = new Order();
        order1.setId(1);
        order1.setPrice(200.0);
        order1.setName("订单1");

        Order order2 = new Order();
        order2.setId(1);
        order2.setPrice(200.0);
        order2.setName("订单1");

        List<Order> list = new ArrayList<Order>(Arrays.asList(order1, order2));
        return list;
    }
}
