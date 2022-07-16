package com.dojoohwan.springbootdb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dojoohwan.springbootdb.mapper.ProductMapper;
import com.dojoohwan.springbootdb.model.Product;

@Service
public class ProductService {

    //public List<Product> selectList();

    @Autowired
    ProductMapper productMapper;

    public List<Product> selecList() {
        return productMapper.selectList();
    }
}
