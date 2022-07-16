package com.dojoohwan.springbootdb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dojoohwan.springbootdb.mapper.ProductMapper;
import com.dojoohwan.springbootdb.model.MinallBrand;
import com.dojoohwan.springbootdb.model.MinmaxCate;
import com.dojoohwan.springbootdb.model.Product;

@Service
public class ProductService {
    //public List<Product> selectList();

    @Autowired
    ProductMapper productMapper;

    public List<Product> selecList() {
        return productMapper.selectList();
    }

    public List<Product> getMinallCate() {
        return productMapper.getMinallCate();
    }

    public MinallBrand getMinallBrand() {
        return productMapper.getMinallBrand();
    }

    public MinmaxCate getCateMinMax(String cate) {
        return productMapper.getCateMinMax(cate);
    }
}
