package com.example.demo.model.smart_phone;

import com.example.demo.model.AbstractModel;
import com.example.demo.model.vacuum_cleaner.VacuumCleanerType;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "smart_phones")
public class SmartPhone extends AbstractModel {
    public SmartPhone() {}

    public SmartPhone(
            String name,
            String serialNumber,
            String color,
            Float width,
            Float length,
            Float height,
            BigDecimal price,
            Boolean stock,
            Integer storage,
            Integer cameras,
            SmartPhoneType type) {
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
        this.storage = storage;
        this.cameras = cameras;
        this.type = type;
    }

    @Column(name = "storage")
    private Integer storage;

    @Column(name = "cameras")
    private Integer cameras;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "type", nullable = false)
    @JsonBackReference
    private SmartPhoneType type;

    public Integer getStorage() {
        return storage;
    }

    public void setStorage(Integer storage) {
        this.storage = storage;
    }

    public Integer getCameras() {
        return cameras;
    }

    public void setCameras(Integer cameras) {
        this.cameras = cameras;
    }

    public SmartPhoneType getType() {
        return type;
    }

    public void setType(SmartPhoneType type) {
        this.type = type;
    }
}
