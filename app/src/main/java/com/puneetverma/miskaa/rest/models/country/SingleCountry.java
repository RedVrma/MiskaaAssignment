package com.puneetverma.miskaa.rest.models.country;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SingleCountry {

    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("topLevelDomain")
    @Expose
    public List<String> topLevelDomain = null;
    @SerializedName("alpha2Code")
    @Expose
    public String alpha2Code;
    @SerializedName("alpha3Code")
    @Expose
    public String alpha3Code;
    @SerializedName("callingCodes")
    @Expose
    public List<String> callingCodes = null;
    @SerializedName("capital")
    @Expose
    public String capital;
    @SerializedName("altSpellings")
    @Expose
    public List<String> altSpellings = null;
    @SerializedName("region")
    @Expose
    public String region;
    @SerializedName("subregion")
    @Expose
    public String subregion;
    @SerializedName("population")
    @Expose
    public Integer population;
    @SerializedName("latlng")
    @Expose
    public List<Float> latlng = null;
    @SerializedName("demonym")
    @Expose
    public String demonym;
    @SerializedName("area")
    @Expose
    public Float area;
    @SerializedName("gini")
    @Expose
    public Float gini;
    @SerializedName("timezones")
    @Expose
    public List<String> timezones = null;
    @SerializedName("borders")
    @Expose
    public List<String> borders = null;
    @SerializedName("nativeName")
    @Expose
    public String nativeName;
    @SerializedName("numericCode")
    @Expose
    public String numericCode;
    @SerializedName("currencies")
    @Expose
    public List<Currency> currencies = null;
    @SerializedName("languages")
    @Expose
    public List<Language> languages = null;
    @SerializedName("translations")
    @Expose
    public Translations translations;
    @SerializedName("flag")
    @Expose
    public String flag;
    @SerializedName("regionalBlocs")
    @Expose
    public List<RegionalBloc> regionalBlocs = null;
    @SerializedName("cioc")
    @Expose
    public String cioc;

    public SingleCountry(String name, List<String> topLevelDomain, String alpha2Code, String alpha3Code, List<String> callingCodes, String capital, List<String> altSpellings, String region, String subregion, Integer population, List<Float> latlng, String demonym, Float area, Float gini, List<String> timezones, List<String> borders, String nativeName, String numericCode, List<Currency> currencies, List<Language> languages, Translations translations, String flag, List<RegionalBloc> regionalBlocs, String cioc) {
        this.name = name;
        this.topLevelDomain = topLevelDomain;
        this.alpha2Code = alpha2Code;
        this.alpha3Code = alpha3Code;
        this.callingCodes = callingCodes;
        this.capital = capital;
        this.altSpellings = altSpellings;
        this.region = region;
        this.subregion = subregion;
        this.population = population;
        this.latlng = latlng;
        this.demonym = demonym;
        this.area = area;
        this.gini = gini;
        this.timezones = timezones;
        this.borders = borders;
        this.nativeName = nativeName;
        this.numericCode = numericCode;
        this.currencies = currencies;
        this.languages = languages;
        this.translations = translations;
        this.flag = flag;
        this.regionalBlocs = regionalBlocs;
        this.cioc = cioc;
    }

    public String getName() {
        return name;
    }

    public List<String> getTopLevelDomain() {
        return topLevelDomain;
    }

    public String getAlpha2Code() {
        return alpha2Code;
    }

    public String getAlpha3Code() {
        return alpha3Code;
    }

    public List<String> getCallingCodes() {
        return callingCodes;
    }

    public String getCapital() {
        return capital;
    }

    public List<String> getAltSpellings() {
        return altSpellings;
    }

    public String getRegion() {
        return region;
    }

    public String getSubregion() {
        return subregion;
    }

    public Integer getPopulation() {
        return population;
    }

    public List<Float> getLatlng() {
        return latlng;
    }

    public String getDemonym() {
        return demonym;
    }

    public Float getArea() {
        return area;
    }

    public Float getGini() {
        return gini;
    }

    public List<String> getTimezones() {
        return timezones;
    }

    public List<String> getBorders() {
        return borders;
    }

    public String getNativeName() {
        return nativeName;
    }

    public String getNumericCode() {
        return numericCode;
    }

    public List<Currency> getCurrencies() {
        return currencies;
    }

    public List<Language> getLanguages() {
        return languages;
    }

    public Translations getTranslations() {
        return translations;
    }

    public String getFlag() {
        return flag;
    }

    public List<RegionalBloc> getRegionalBlocs() {
        return regionalBlocs;
    }

    public String getCioc() {
        return cioc;
    }
}


