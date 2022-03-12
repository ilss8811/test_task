package com.example.demo.payload.request;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;

public abstract class AbstractRequest {
    @NotBlank
    private String name;

    @NotBlank
    private String serialNumber;

    @NotBlank
    private String color;

    @NotBlank
    private Float width;

    @NotBlank
    private Float length;

    @NotBlank
    private Float height;

    @NotBlank
    private BigDecimal price;

    @NotBlank
    private Boolean stock;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Float getWidth() {
        return width;
    }

    public void setWidth(Float width) {
        this.width = width;
    }

    public Float getLength() {
        return length;
    }

    public void setLength(Float length) {
        this.length = length;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Boolean getStock() {
        return stock;
    }

    public void setStock(Boolean stock) {
        this.stock = stock;
    }
}
