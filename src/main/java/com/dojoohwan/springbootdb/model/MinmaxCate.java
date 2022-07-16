package com.dojoohwan.springbootdb.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class MinmaxCate {
    private String category;
    private String min_brand;
    private String max_brand;
    private int min_price;
    private int max_price;
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getMin_brand() {
        return min_brand;
    }
    public void setMin_brand(String min_brand) {
        this.min_brand = min_brand;
    }
    public String getMax_brand() {
        return max_brand;
    }
    public void setMax_brand(String max_brand) {
        this.max_brand = max_brand;
    }
    public int getMin_price() {
        return min_price;
    }
    public void setMin_price(int min_price) {
        this.min_price = min_price;
    }
    public int getMax_price() {
        return max_price;
    }
    public void setMax_price(int max_price) {
        this.max_price = max_price;
    }
}
