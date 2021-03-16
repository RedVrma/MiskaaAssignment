package com.puneetverma.miskaa.room;


import android.content.Context;

import androidx.appcompat.widget.AppCompatButton;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.puneetverma.miskaa.rest.models.country.SingleCountry;

@Database(entities = {SingleCountrydb.class}, version = 1, exportSchema = false)
@TypeConverters({Converters.class})
public abstract class AppDatabase extends RoomDatabase
{

    public abstract UserDao userDao();

    public static AppDatabase INSTANCE;

    public static AppDatabase getDBInstance(Context context)
    {
        if(INSTANCE==null)
        {
            INSTANCE = Room.databaseBuilder(context.getApplicationContext()
                    , AppDatabase.class, "CountryDatabase")
                    .allowMainThreadQueries()
                    .build();
        }
        return INSTANCE;
    }

}
