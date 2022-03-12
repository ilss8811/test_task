package com.example.demo.model.television;


import com.example.demo.model.AbstractModel;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "televisions")
public class Television extends AbstractModel {

    public Television() {}

    public Television(
            String name,
            String serialNumber,
            String color,
            Float width,
            Float length,
            Float height,
            BigDecimal price,
            Boolean stock,
            String category,
            String technology,
            TelevisionType type) {
        super(
                name,
                serialNumber,
                color,
                width,
                length,
                height,
                price,
                stock
        );
        this.category = category;
        this.technology = technology;
        this.type = type;
    }

    @Column(name = "category")
    private String category;

    @Column(name = "technology")
    private String technology;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "type", nullable = false)
    @JsonBackReference
    private TelevisionType type;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public TelevisionType getType() {
        return type;
    }

    public void setType(TelevisionType type) {
        this.type = type;
    }
}
