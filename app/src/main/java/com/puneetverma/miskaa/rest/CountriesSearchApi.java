package com.puneetverma.miskaa.rest;

import com.puneetverma.miskaa.rest.models.country.SingleCountry;
import com.puneetverma.miskaa.room.SingleCountrydb;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CountriesSearchApi {

    @GET("asia")
    Call<ArrayList<SingleCountry>> getCountries(
                //@Query("region") String region
    );


}
