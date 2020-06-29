package com.example.consumer;

import com.example.consumer.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @Autowired
    private IProductService productService;

    @RequestMapping(value = "hello")
    public String getConsumer() {
        String str = productService.hello();
        return str;
    }
}
