package com.example.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "product-server" )
public interface IProductService {
    @RequestMapping(value = "hello")
    String hello();
}
