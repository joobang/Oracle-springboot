package com.dojoohwan.springbootdb.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.dojoohwan.springbootdb.model.Product;

@Mapper
public interface ProductMapper {
    List<Product> selectList();
}
