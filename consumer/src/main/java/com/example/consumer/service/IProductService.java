package com.example.consumer.service;

import com.example.consumer.service.impl.ProductFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "product-server", fallback = ProductFallBack.class )
public interface IProductService {
    @RequestMapping(value = "hello")
    String hello();
}
