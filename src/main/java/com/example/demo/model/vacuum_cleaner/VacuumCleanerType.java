package com.example.demo.model.vacuum_cleaner;

import com.example.demo.model.AbstractTypeModel;
import com.example.demo.model.television.Television;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "vacuum_cleaners_types")
public class VacuumCleanerType extends AbstractTypeModel {
    public VacuumCleanerType() {}

    public VacuumCleanerType(String name, String country, String company, Boolean credit, Boolean online) {
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
    private Set<VacuumCleaner> range;

    public Set<VacuumCleaner> getRange() {
        return range;
    }

    public void setRange(Set<VacuumCleaner> range) {
        this.range = range;
    }
}
