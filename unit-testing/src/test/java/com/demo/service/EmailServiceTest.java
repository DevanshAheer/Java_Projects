package com.demo.service;

import com.demo.domain.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class EmailServiceTest {

    @Test
    public void sendEmailTest() {
        Order order = new Order();
        assertTrue(EmailService.getInstance().sendEmail(order, " devansh@gmail"));
    }

    @Test(expected = Exception.class)
    public void getInstanceTestFoeException(){
        Order order = new Order();
        EmailService.getInstance().sendEmail(order);
    }

    @Test
    public void getInstanceTest()
    {
        EmailService emailService = EmailService.getInstance();
        assertTrue(emailService instanceof EmailService);
    }


}

