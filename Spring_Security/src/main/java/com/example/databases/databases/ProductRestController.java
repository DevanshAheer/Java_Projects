package com.example.databases.databases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/product")
public class ProductRestController {

    @Autowired
    ProductRepo repo;
    @Autowired
    public RestTemplate restTemplate;

    @Value("${couponService.url}")
    private String couponServiceURL;

    @PostMapping("/products")
    public Product create(@RequestBody Product product)
    {
        Coupon coupon = restTemplate.getForObject("couponServiceURL"+product.getCouponCode(),Coupon.class );
        product.setPrice(product.getPrice().subtract(coupon.getDiscount()));
        return repo.save(product);
    }
}
