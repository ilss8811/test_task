package com.example.demo.model;

import javax.persistence.*;

@MappedSuperclass
public abstract class AbstractTypeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "country")
    private String country;

    @Column(name = "company")
    private String company;

    @Column(name = "credit")
    private Boolean credit;

    @Column(name = "online")
    private Boolean online;

    public AbstractTypeModel() {}

    public AbstractTypeModel(String name, String country, String company, Boolean credit, Boolean online) {
        this.name = name;
        this.country = country;
        this.company = company;
        this.credit = credit;
        this.online = online;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Boolean getCredit() {
        return credit;
    }

    public void setCredit(Boolean credit) {
        this.credit = credit;
    }

    public Boolean getOnline() {
        return online;
    }

    public void setOnline(Boolean online) {
        this.online = online;
    }
}
