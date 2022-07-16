package com.dojoohwan.springbootdb.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class MinallCate {
    private List<Product> productList = new ArrayList();
    private Integer sum;
    public List<Product> getProductList() {
        return productList;
    }
    public Integer getSum() {
        return sum;
    }
    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
    public void setSum(Integer sum) {
        this.sum = sum;
    }
}
