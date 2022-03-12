package com.example.demo.payload.request.television;

import com.example.demo.payload.request.AbstractRequest;
import com.example.demo.payload.request.AbstractSearchRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class TelevisionSearchRequest extends AbstractSearchRequest {

    private String category = "";

    private String technology = "";

    @NotNull
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
