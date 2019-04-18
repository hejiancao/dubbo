package cn.sen.dubbo.test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/spring/order-provider.xml")
public class TestOrder {

    @Test
    public void start() throws IOException {
        System.out.println("dubbo提供者服务启动了...");
        // 让服务阻塞
        System.in.read();
    }
}
