package com.example.demo.payload.request.vacuum_cleaner;

import com.example.demo.payload.request.AbstractSearchRequest;

import javax.validation.constraints.NotNull;

public class VacuumCleanerSearchRequest extends AbstractSearchRequest {
    private Integer mods = 0;

    private Integer volume = 0;

    @NotNull
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
