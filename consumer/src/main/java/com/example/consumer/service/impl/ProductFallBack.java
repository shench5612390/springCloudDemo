package com.example.consumer.service.impl;

import com.example.consumer.service.IProductService;
import org.springframework.stereotype.Component;

@Component
public class ProductFallBack implements IProductService {
    @Override
    public String hello() {
        return "触发服务降级接口";
    }
}
