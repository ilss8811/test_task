package com.example.demo.payload.request.vacuum_cleaner;

import com.example.demo.model.AbstractModel;
import com.example.demo.payload.request.AbstractRequest;

import javax.validation.constraints.NotBlank;

public class VacuumCleanerCreateRequest extends AbstractRequest {
    @NotBlank
    private Integer mods;

    @NotBlank
    private Integer volume;

    @NotBlank
    private Integer typeId;

    public Integer getMods() {
        return mods;
    }

    public void setMods(Integer mods) {
        this.mods = mods;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }
}
