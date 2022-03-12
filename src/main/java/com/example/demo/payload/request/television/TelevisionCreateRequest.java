package com.example.demo.payload.request.television;

import com.example.demo.model.television.TelevisionType;
import com.example.demo.payload.request.AbstractRequest;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;

public class TelevisionCreateRequest extends AbstractRequest {
    @NotBlank
    private String category;

    @NotBlank
    private String technology;

    @NotBlank
    private Integer typeId;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }
}
