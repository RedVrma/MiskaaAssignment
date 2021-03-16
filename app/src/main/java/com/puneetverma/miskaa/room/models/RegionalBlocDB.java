package com.puneetverma.miskaa.room.models;

import androidx.room.ColumnInfo;

import java.util.List;

public class RegionalBlocDB {

    @ColumnInfo(name="acronym")
    
    public String acronym;
    @ColumnInfo(name="name")
    
    public String name;
    @ColumnInfo(name="otherAcronyms")
    
    public List<String> otherAcronyms = null;
    @ColumnInfo(name="otherNames")
    
    public List<String> otherNames = null;
}

