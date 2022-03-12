package com.example.demo.payload.request.smart_phone;

import com.example.demo.payload.request.AbstractSearchRequest;

import javax.validation.constraints.NotNull;

public class SmartPhoneSearchRequest extends AbstractSearchRequest {
    private Integer storage = 0;

    private Integer cameras = 0;

    @NotNull
    private Integer typeId;

    public Integer getStorage() {
        return storage;
    }

    public void setStorage(Integer storage) {
        this.storage = storage;
    }

    public Integer getCameras() {
        return cameras;
    }

    public void setCameras(Integer cameras) {
        this.cameras = cameras;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }
}
