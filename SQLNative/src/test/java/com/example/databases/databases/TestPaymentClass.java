package com.example.databases.databases;

import com.example.SINGLE_TABLE.Check;
import com.example.SINGLE_TABLE.CreditCard;
import com.example.SINGLE_TABLE.PaymentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;



@SpringBootTest
class TestPaymentClass {
    @Autowired
    PaymentRepository repository;

    @Test
	void contextLoads() {
	}

    @Test
    public void createPayment()
    {
        CreditCard cc = new CreditCard();
        cc.setId(1);
        cc.setAmount(20000);
        cc.setCreditCard("12344");
        repository.save(cc);
    }
}
