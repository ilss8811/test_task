package com.example.demo.model.refrigerator;

import com.example.demo.model.AbstractTypeModel;
import com.example.demo.model.vacuum_cleaner.VacuumCleaner;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "refrigerator_types")
public class RefrigeratorType extends AbstractTypeModel {
    public RefrigeratorType() {}

    public RefrigeratorType(String name, String country, String company, Boolean credit, Boolean online) {
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
    private Set<Refrigerator> range;
}
