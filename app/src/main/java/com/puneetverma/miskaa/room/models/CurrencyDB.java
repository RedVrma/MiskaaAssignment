package com.puneetverma.miskaa.room.models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;


public class CurrencyDB {

    @ColumnInfo(name="code")
    public String code;

    @ColumnInfo(name="name")
    public String name;

    @ColumnInfo(name="symbol")
    public String symbol;
}
