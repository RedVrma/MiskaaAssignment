package com.puneetverma.miskaa.rest;

import org.json.JSONStringer;


public class RestApiUtils {

    public static CountriesSearchApi getCountrySearchApi()
    {
        return CountriesClient.getClient().create(CountriesSearchApi.class);
    }
}
