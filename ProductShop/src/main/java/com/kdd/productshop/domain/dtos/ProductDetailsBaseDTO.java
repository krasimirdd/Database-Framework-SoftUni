package com.kdd.productshop.domain.dtos;

import com.google.gson.annotations.Expose;

import java.math.BigDecimal;

public class ProductDetailsBaseDTO {
    @Expose
    String name;
    @Expose
    BigDecimal price;

    public ProductDetailsBaseDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
