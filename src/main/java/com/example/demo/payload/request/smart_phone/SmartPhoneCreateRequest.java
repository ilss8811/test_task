package com.example.demo.payload.request.smart_phone;

import com.example.demo.model.AbstractModel;
import com.example.demo.payload.request.AbstractRequest;

import javax.validation.constraints.NotBlank;

public class SmartPhoneCreateRequest extends AbstractRequest {
    @NotBlank
    private Integer storage;

    @NotBlank
    private Integer cameras;

    @NotBlank
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
