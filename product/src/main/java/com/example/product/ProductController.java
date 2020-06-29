package com.example.product;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Value("${server.port}")
    String port;
    @RequestMapping(value = "hello")
    public String hello() {
        return "product hello word, port is:" + port;
    }
}
