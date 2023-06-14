package com.example.billingservice.feign;

import com.example.billingservice.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "INVENTORY-SERVICE")
public interface ProductItemRestClient {
    @GetMapping("/products")
    PagedModel<Product> pageProducts();
    @GetMapping("/products/{id}?projection=fullProduct")
    Product getProductById(@PathVariable("id") Long id);


}
