package com.example.demo.model.refrigerator;

import com.example.demo.model.AbstractModel;
import com.example.demo.model.vacuum_cleaner.VacuumCleanerType;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "refrigerators")
public class Refrigerator extends AbstractModel {
    public Refrigerator() {}

    public Refrigerator(
            String name,
            String serialNumber,
            String color,
            Float width,
            Float length,
            Float height,
            BigDecimal price,
            Boolean stock,
            Integer doors,
            String compressor,
            RefrigeratorType type) {
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
        this.doors = doors;
        this.compressor = compressor;
        this.type = type;
    }

    @Column(name = "doors")
    private Integer doors;

    @Column(name = "compressor")
    private String compressor;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "type", nullable = false)
    @JsonBackReference
    private RefrigeratorType type;

    public Integer getDoors() {
        return doors;
    }

    public void setDoors(Integer doors) {
        this.doors = doors;
    }

    public String getCompressor() {
        return compressor;
    }

    public void setCompressor(String compressor) {
        this.compressor = compressor;
    }

    public RefrigeratorType getType() {
        return type;
    }

    public void setType(RefrigeratorType type) {
        this.type = type;
    }
}
