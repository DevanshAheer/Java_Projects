package com.demo.service;

import com.demo.domain.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class OrderServiceTest {

    @Test
    public void getInstanceTest()
    {
        OrderService orderService = OrderService.getInstance();
        assertTrue(orderService instanceof OrderService);

    }

    @Test
    public void placeOrderTest()
    {
        Order order = new Order(4,"TTN", 60);
        assertTrue(OrderService.getInstance().placeOrder(order, "india@gmail.com"));
    }
}
