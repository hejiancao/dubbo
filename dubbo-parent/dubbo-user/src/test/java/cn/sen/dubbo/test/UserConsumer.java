package cn.sen.dubbo.test;

import cn.sen.dubbo.model.Order;
import cn.sen.dubbo.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/user-consumer.xml")
public class UserConsumer {

    @Autowired
    private OrderService orderService;

    @Test
    public void consumer() {
        List<Order> orders = orderService.query();
        System.out.println(orders);

    }
}
