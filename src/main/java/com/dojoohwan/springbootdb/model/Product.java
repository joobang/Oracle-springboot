package com.dojoohwan.springbootdb.model;

import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class Product {
     private String category;
     private String brand;
     private Integer price;
    public String getCategory() {
        return category;
    }
    public String getBrand() {
        return brand;
    }
    public Integer getPrice() {
        return price;
    }

}
