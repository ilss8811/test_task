package com.example.demo.model.smart_phone;

import com.example.demo.model.AbstractTypeModel;
import com.example.demo.model.vacuum_cleaner.VacuumCleaner;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "smart_phone_types")
public class SmartPhoneType extends AbstractTypeModel {
    public SmartPhoneType() {}

    public SmartPhoneType(String name, String country, String company, Boolean credit, Boolean online) {
        super(
                name,
                country,
                company,
                credit,
                online
        );
    }

    @OneToMany(mappedBy = "type", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JsonManagedReference
    private Set<SmartPhone> range;

    public Set<SmartPhone> getRange() {
        return range;
    }

    public void setRange(Set<SmartPhone> range) {
        this.range = range;
    }
}
