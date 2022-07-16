package com.dojoohwan.springbootdb.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
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
    public void setCategory(String category) {
        this.category = category;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }

}
