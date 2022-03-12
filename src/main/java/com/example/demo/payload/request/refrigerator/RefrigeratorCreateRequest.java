package com.example.demo.payload.request.refrigerator;

import com.example.demo.model.AbstractModel;
import com.example.demo.payload.request.AbstractRequest;

import javax.validation.constraints.NotBlank;

public class RefrigeratorCreateRequest extends AbstractRequest {
    @NotBlank
    private Integer doors;

    @NotBlank
    private String compressor;

    @NotBlank
    private Integer typeId;

    public Integer getDoors() {
        return doors;
    }

    public void setDoors(Integer doors) {
        this.doors = doors;
    }

    public String getCompressor() {
        return compressor;
    }

    public void setCompressor(String compressor) {
        this.compressor = compressor;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }
}
