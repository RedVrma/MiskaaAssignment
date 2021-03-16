package com.puneetverma.miskaa.rest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class CountriesClient {

    public static Retrofit retrofit=null;
    static String baseSearchUrl="https://restcountries.eu/rest/v2/region/";

    public  static Retrofit getClient()
    {
        if(retrofit==null)
        {
            retrofit = new Retrofit.Builder()
                    .baseUrl(baseSearchUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
