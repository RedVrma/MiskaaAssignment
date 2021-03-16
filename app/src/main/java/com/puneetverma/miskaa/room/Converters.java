package com.puneetverma.miskaa.room;

import android.util.Log;

import androidx.room.TypeConverter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.puneetverma.miskaa.room.models.CurrencyDB;
import com.puneetverma.miskaa.room.models.LanguageDB;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.ArrayList;

public class Converters {

    @TypeConverter
    public static ArrayList<String> fromString(String value) {
        Type listType = new TypeToken<ArrayList<String>>() {}.getType();
        return new Gson().fromJson(value, listType);
    }

    @TypeConverter
    public static String fromList(ArrayList<String> ArrayList) {
        Gson gson = new Gson();
        String json = gson.toJson(ArrayList);
        Log.d("json", "fromList: " + json);
        return json;
    }

    @TypeConverter
    public static ArrayList<Float> fromStringFloat(String value) {
        Type listType = new TypeToken<ArrayList<Float>>() {}.getType();
        return new Gson().fromJson(value, listType);
    }

    @TypeConverter
    public static String fromListFloat(ArrayList<Float> ArrayList) {
        Gson gson = new Gson();
        String json = gson.toJson(ArrayList);
        return json;
    }


//    @TypeConverter
//    public static ArrayList<LanguageDB> fromStringLanguage(String value) {
//        Type listType = new TypeToken<ArrayList<LanguageDB>>() {}.getType();
//        return new Gson().fromJson(value, listType);
//    }
//
//    @TypeConverter
//    public static String fromListLanguage(ArrayList<LanguageDB> ArrayList) {
//        Gson gson = new Gson();
//        String json = gson.toJson(ArrayList);
//        return json;
//    }




}
