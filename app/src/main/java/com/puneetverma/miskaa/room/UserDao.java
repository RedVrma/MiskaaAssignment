package com.puneetverma.miskaa.room;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.puneetverma.miskaa.rest.models.country.SingleCountry;

import java.util.List;

@Dao
public interface UserDao {

    @Query("SELECT * FROM SingleCountrydb")
    List<SingleCountrydb> getAllCountries();

    @Insert
    void addCountry(SingleCountrydb singleCountrydb);

    @Delete
    void deleteCountry(SingleCountrydb singleCountrydb);

    @Query("DELETE from SingleCountrydb")
    void delete();
}
