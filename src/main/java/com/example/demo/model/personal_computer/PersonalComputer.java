package com.example.demo.model.personal_computer;

import com.example.demo.model.AbstractModel;
import com.example.demo.model.television.TelevisionType;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "personal_computers")
public class PersonalComputer extends AbstractModel {
    public PersonalComputer() {}

    public PersonalComputer(
            String name,
            String serialNumber,
            String color,
            Float width,
            Float length,
            Float height,
            BigDecimal price,
            Boolean stock,
            String category,
            String processor,
            PersonalComputerType type) {
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
        this.processor = processor;
        this.type = type;
    }

    @Column(name = "category")
    private String category;

    @Column(name = "processor")
    private String processor;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "type", nullable = false)
    @JsonBackReference
    private PersonalComputerType type;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public PersonalComputerType getType() {
        return type;
    }

    public void setType(PersonalComputerType type) {
        this.type = type;
    }
}
