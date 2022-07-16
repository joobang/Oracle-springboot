package com.dojoohwan.springbootdb.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.dojoohwan.springbootdb.model.MinallBrand;
import com.dojoohwan.springbootdb.model.MinmaxCate;
import com.dojoohwan.springbootdb.model.Product;

@Mapper
public interface ProductMapper {
    List<Product> selectList();
    List<Product> getMinallCate();
    MinallBrand getMinallBrand();
    MinmaxCate getCateMinMax(@Param("cate") String cate);
}
