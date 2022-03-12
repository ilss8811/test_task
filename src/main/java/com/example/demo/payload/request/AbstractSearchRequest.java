package com.example.demo.payload.request;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestParam;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;

public abstract class AbstractSearchRequest {

    private String name = "";

    private String serialNumber = "";

    private String color = "";

    private Float width = 0F;

    private Float length = 0F;

    private Float height = 0F;

    private BigDecimal price_from = BigDecimal.ZERO;

    private BigDecimal price_to = BigDecimal.ZERO;

    private Boolean stock = false;

    private Boolean alphabet_sort = false;

    private Boolean price_sort = false;

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

    public BigDecimal getPrice_from() {
        return price_from;
    }

    public void setPrice_from(BigDecimal price_from) {
        this.price_from = price_from;
    }

    public BigDecimal getPrice_to() {
        return price_to;
    }

    public void setPrice_to(BigDecimal price_to) {
        this.price_to = price_to;
    }

    public Boolean getStock() {
        return stock;
    }

    public void setStock(Boolean stock) {
        this.stock = stock;
    }

    public Boolean getAlphabet_sort() {
        return alphabet_sort;
    }

    public void setAlphabet_sort(Boolean alphabet_sort) {
        this.alphabet_sort = alphabet_sort;
    }

    public Boolean getPrice_sort() {
        return price_sort;
    }

    public void setPrice_sort(Boolean price_sort) {
        this.price_sort = price_sort;
    }
}
