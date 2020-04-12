package com.siep.client;

import java.util.List;
 
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.siep.pojo.Product;
 
@FeignClient(value = "SIEP-WEB-DATA-SERVICE")
public interface ProductClientFeign {
 
    @GetMapping("/products")
    public List<Product> listProdcuts();
}
