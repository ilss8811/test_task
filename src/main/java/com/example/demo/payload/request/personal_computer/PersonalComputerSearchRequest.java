package com.example.demo.payload.request.personal_computer;

import com.example.demo.payload.request.AbstractSearchRequest;

import javax.validation.constraints.NotNull;

public class PersonalComputerSearchRequest extends AbstractSearchRequest {
    private String category = "";

    private String processor = "";

    @NotNull
    private Integer typeId;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }
}
