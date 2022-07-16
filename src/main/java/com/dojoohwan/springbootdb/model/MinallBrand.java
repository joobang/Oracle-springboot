package com.dojoohwan.springbootdb.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class MinallBrand {
    private String brand;
    private int t_price;
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public int getT_price() {
        return t_price;
    }
    public void setT_price(int t_price) {
        this.t_price = t_price;
    }
}
