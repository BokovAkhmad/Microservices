package com.microservices.test.api.controller;

import com.microservices.test.api.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Akhmat on 05.02.2017.
 */

@RestController
public class ProductsController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void saveProduct(@RequestParam String name, @RequestParam Double price) {
        productService.createProduct(name, price);
    }

}
