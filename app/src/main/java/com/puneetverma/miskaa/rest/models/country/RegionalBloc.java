package com.puneetverma.miskaa.rest.models.country;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RegionalBloc {

    @SerializedName("acronym")
    @Expose
    public String acronym;
    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("otherAcronyms")
    @Expose
    public List<Object> otherAcronyms = null;
    @SerializedName("otherNames")
    @Expose
    public List<Object> otherNames = null;

    public RegionalBloc(String acronym, String name, List<Object> otherAcronyms, List<Object> otherNames) {
        this.acronym = acronym;
        this.name = name;
        this.otherAcronyms = otherAcronyms;
        this.otherNames = otherNames;
    }

    public String getAcronym() {
        return acronym;
    }

    public String getName() {
        return name;
    }

    public List<Object> getOtherAcronyms() {
        return otherAcronyms;
    }

    public List<Object> getOtherNames() {
        return otherNames;
    }
}
