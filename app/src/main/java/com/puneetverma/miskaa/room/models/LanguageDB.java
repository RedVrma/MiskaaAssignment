package com.puneetverma.miskaa.room.models;

import androidx.room.ColumnInfo;

public class LanguageDB {


    @ColumnInfo(name="iso6391")
    public String iso6391;
    @ColumnInfo(name="iso6392")
    public String iso6392;
    @ColumnInfo(name="name")
    public String name;
    @ColumnInfo(name="nativeName")
    public String nativeName;

    public LanguageDB(String iso6391, String iso6392, String name, String nativeName) {
        this.iso6391 = iso6391;
        this.iso6392 = iso6392;
        this.name = name;
        this.nativeName = nativeName;
    }

    public String getIso6391() {
        return iso6391;
    }

    public String getIso6392() {
        return iso6392;
    }

    public String getName() {
        return name;
    }

    public String getNativeName() {
        return nativeName;
    }


    @Override
    public String toString() {
        return "LanguageDB{" +
                "iso6391='" + iso6391 + '\'' +
                ", iso6392='" + iso6392 + '\'' +
                ", name='" + name + '\'' +
                ", nativeName='" + nativeName + '\'' +
                '}';
    }
}
