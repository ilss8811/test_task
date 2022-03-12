package com.example.demo.model.vacuum_cleaner;

import com.example.demo.model.AbstractModel;
import com.example.demo.model.television.TelevisionType;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "vacuum_cleaners")
public class VacuumCleaner extends AbstractModel {
    public VacuumCleaner() {}

    public VacuumCleaner(
            String name,
            String serialNumber,
            String color,
            Float width,
            Float length,
            Float height,
            BigDecimal price,
            Boolean stock,
            Integer mods,
            Integer volume,
            VacuumCleanerType type) {
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
        this.mods = mods;
        this.volume = volume;
        this.type = type;
    }

    @Column(name = "mods")
    private Integer mods;

    @Column(name = "volume")
    private Integer volume;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "type", nullable = false)
    @JsonBackReference
    private VacuumCleanerType type;

    public Integer getMods() {
        return mods;
    }

    public void setMods(Integer mods) {
        this.mods = mods;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public VacuumCleanerType getType() {
        return type;
    }

    public void setType(VacuumCleanerType type) {
        this.type = type;
    }
}
