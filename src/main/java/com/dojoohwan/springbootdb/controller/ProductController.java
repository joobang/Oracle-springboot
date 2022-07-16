package com.dojoohwan.springbootdb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dojoohwan.springbootdb.model.Product;
import com.dojoohwan.springbootdb.service.ProductService;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public List<Product> getSelecList() {
        List<Product> list = productService.selecList();
        return list;
    }
    // @RequestMapping(value = "/", method = RequestMethod.GET)
    // public String index() {
    //     return "Hello, World!";
    // }
}
