package com.dojoohwan.springbootdb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dojoohwan.springbootdb.model.MinallBrand;
import com.dojoohwan.springbootdb.model.MinallCate;
import com.dojoohwan.springbootdb.model.Product;
import com.dojoohwan.springbootdb.service.ProductService;
import com.google.gson.Gson;

@RestController
public class ProductController {
    

    @Autowired
    ProductService productService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public List<Product> getSelecList() {
        List<Product> list = productService.selecList();
        return list;
    }
    // 1. 모든 카테고리의 상품 구매할 때 최저가 조회 API
    @RequestMapping(value = "/product/all/all/min", method = RequestMethod.GET)
    public String getMinallCate() {
        Gson gson = new Gson();
        MinallCate minall = new MinallCate();
        List<Product> list = productService.getMinallCate();
        int sum = list.stream().mapToInt(l -> l.getPrice()).sum();
        
        minall.setProductList(list);
        minall.setSum(sum);
        return gson.toJson(minall);
    }

    // 2. 한 브랜드에서 모든 카테고리 상품 구매할 경우 최저가 및 브랜드 조회 API
    @RequestMapping(value = "/product/all/brand/min", method = RequestMethod.GET)
    public MinallBrand getBrandallmin() {
       return productService.getMinallBrand();
    }
    
}
