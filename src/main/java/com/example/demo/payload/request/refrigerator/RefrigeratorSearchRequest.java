package com.example.demo.payload.request.refrigerator;

import com.example.demo.payload.request.AbstractSearchRequest;

import javax.validation.constraints.NotNull;

public class RefrigeratorSearchRequest extends AbstractSearchRequest {
    private Integer doors = 0;

    private String compressor = "";

    @NotNull
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
