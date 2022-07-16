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

    public List<Product> selectList() {
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
    public Product selectProduct(Product product) {
        return productMapper.selectProduct(product);
    }
    public void insertProduct(Product product) {
        Product curr = productMapper.selectProduct(product);
        if(curr == null){
            productMapper.insert(product);
        }else{
            throw new IllegalStateException("product already exist.");
        }
        
    }
    public void updateProdct(Product product) {
        Product curr = productMapper.selectProduct(product);
        if(curr != null){
            curr.setPrice(product.getPrice());
            productMapper.update(product);
        }else{
            throw new IllegalStateException("product does not exist.");
        }
    }
    public void deleteProdcut(Product product) {
        if(productMapper.selectProduct(product) != null){
            productMapper.delete(product);
        }else{
            throw new IllegalStateException("product does not exist.");
        }
    }
}
