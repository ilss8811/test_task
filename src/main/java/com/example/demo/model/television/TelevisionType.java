package com.example.demo.model.television;

import com.example.demo.model.AbstractTypeModel;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "television_types")
public class TelevisionType extends AbstractTypeModel {
    public TelevisionType() {}

    public TelevisionType(String name, String country, String company, Boolean credit, Boolean online) {
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
    private Set<Television> range;

    public Set<Television> getRange() {
        return range;
    }

    public void setRange(Set<Television> range) {
        this.range = range;
    }
}
