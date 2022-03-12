package com.example.demo.payload.request;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;

public abstract class AbstractTypeRequest {
    @NotBlank
    private String name;

    @NotBlank
    private String country;

    @NotBlank
    private String company;

    @NotBlank
    private Boolean credit;

    @NotBlank
    private Boolean online;

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
