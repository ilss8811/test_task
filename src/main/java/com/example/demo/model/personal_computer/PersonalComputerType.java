package com.example.demo.model.personal_computer;

import com.example.demo.model.AbstractTypeModel;
import com.example.demo.model.television.Television;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "personal_computers_types")
public class PersonalComputerType extends AbstractTypeModel {
    public PersonalComputerType() {}

    public PersonalComputerType(String name, String country, String company, Boolean credit, Boolean online) {
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
    private Set<PersonalComputer> range;

    public Set<PersonalComputer> getRange() {
        return range;
    }

    public void setRange(Set<PersonalComputer> range) {
        this.range = range;
    }
}
