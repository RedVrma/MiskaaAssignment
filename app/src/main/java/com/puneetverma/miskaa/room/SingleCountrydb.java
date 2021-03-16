package com.puneetverma.miskaa.room;

import androidx.room.ColumnInfo;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.puneetverma.miskaa.room.models.CurrencyDB;
import com.puneetverma.miskaa.room.models.LanguageDB;
import com.puneetverma.miskaa.room.models.RegionalBlocDB;
import com.puneetverma.miskaa.room.models.TranslationsDB;

import java.util.ArrayList;

@Entity
public class SingleCountrydb {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    public int id;

    @ColumnInfo(name="name")

    public String name;
    @ColumnInfo(name="topLevelDomain")

    public ArrayList<String> topLevelDomain = null;
    @ColumnInfo(name="alpha2Code")

    public String alpha2Code;
    @ColumnInfo(name="alpha3Code")

    public String alpha3Code;
    @ColumnInfo(name="callingCodes")

    public ArrayList<String> callingCodes = null;
    @ColumnInfo(name="capital")

    public String capital;
    @ColumnInfo(name="altSpellings")

    public ArrayList<String> altSpellings = null;
    @ColumnInfo(name="region")

    public String region;
    @ColumnInfo(name="subregion")

    public String subregion;
    @ColumnInfo(name="population")

    public Integer population;
    @ColumnInfo(name="latlng")

    public ArrayList<Float> latlng = null;
    @ColumnInfo(name="demonym")

    public String demonym;
    @ColumnInfo(name="area")

    public Float area;
    @ColumnInfo(name="gini")

    public Float gini;
    @ColumnInfo(name="timezones")

    public ArrayList<String> timezones = null;
    @ColumnInfo(name="borders")

    public String borders = null;
    @ColumnInfo(name="nativeName")

    public String nativeName;
    @ColumnInfo(name="numericCode")

    public String numericCode;


//    @ColumnInfo(name="currencies")
    @Embedded
    public ArrayList<CurrencyDB> currencies = null;

    //@ColumnInfo(name="languages")

    public String languages = null;

//    @ColumnInfo(name="translations")
    @Embedded
    public TranslationsDB translations;
    @ColumnInfo(name="flag")

    public String flag;
//    @ColumnInfo(name="regionalBlocs")
    @Embedded
    public ArrayList<RegionalBlocDB> regionalBlocs = null;
    @ColumnInfo(name="cioc")

    public String cioc;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getTopLevelDomain() {
        return topLevelDomain;
    }

    public void setTopLevelDomain(ArrayList<String> topLevelDomain) {
        this.topLevelDomain = topLevelDomain;
    }

    public String getAlpha2Code() {
        return alpha2Code;
    }

    public void setAlpha2Code(String alpha2Code) {
        this.alpha2Code = alpha2Code;
    }

    public String getAlpha3Code() {
        return alpha3Code;
    }

    public void setAlpha3Code(String alpha3Code) {
        this.alpha3Code = alpha3Code;
    }

    public ArrayList<String> getCallingCodes() {
        return callingCodes;
    }

    public void setCallingCodes(ArrayList<String> callingCodes) {
        this.callingCodes = callingCodes;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public ArrayList<String> getAltSpellings() {
        return altSpellings;
    }

    public void setAltSpellings(ArrayList<String> altSpellings) {
        this.altSpellings = altSpellings;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSubregion() {
        return subregion;
    }

    public void setSubregion(String subregion) {
        this.subregion = subregion;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public ArrayList<Float> getLatlng() {
        return latlng;
    }

    public void setLatlng(ArrayList<Float> latlng) {
        this.latlng = latlng;
    }

    public String getDemonym() {
        return demonym;
    }

    public void setDemonym(String demonym) {
        this.demonym = demonym;
    }

    public Float getArea() {
        return area;
    }

    public void setArea(Float area) {
        this.area = area;
    }

    public Float getGini() {
        return gini;
    }

    public void setGini(Float gini) {
        this.gini = gini;
    }

    public ArrayList<String> getTimezones() {
        return timezones;
    }

    public void setTimezones(ArrayList<String> timezones) {
        this.timezones = timezones;
    }

    public String getBorders() {
        return borders;
    }

    public void setBorders(String borders) {
        this.borders = borders;
    }

    public String getNativeName() {
        return nativeName;
    }

    public void setNativeName(String nativeName) {
        this.nativeName = nativeName;
    }

    public String getNumericCode() {
        return numericCode;
    }

    public void setNumericCode(String numericCode) {
        this.numericCode = numericCode;
    }

    public ArrayList<CurrencyDB> getCurrencies() {
        return currencies;
    }

    public void setCurrencies(ArrayList<CurrencyDB> currencies) {
        this.currencies = currencies;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public TranslationsDB getTranslations() {
        return translations;
    }

    public void setTranslations(TranslationsDB translations) {
        this.translations = translations;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public ArrayList<RegionalBlocDB> getRegionalBlocs() {
        return regionalBlocs;
    }

    public void setRegionalBlocs(ArrayList<RegionalBlocDB> regionalBlocs) {
        this.regionalBlocs = regionalBlocs;
    }

    public String getCioc() {
        return cioc;
    }

    public void setCioc(String cioc) {
        this.cioc = cioc;
    }

    public SingleCountrydb(int id, String name, ArrayList<String> topLevelDomain, String alpha2Code, String alpha3Code, ArrayList<String> callingCodes, String capital, ArrayList<String> altSpellings, String region, String subregion, Integer population, ArrayList<Float> latlng, String demonym, Float area, Float gini, ArrayList<String> timezones, String borders, String nativeName, String numericCode, ArrayList<CurrencyDB> currencies, String languages, TranslationsDB translations, String flag, ArrayList<RegionalBlocDB> regionalBlocs, String cioc) {
        this.id = id;
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

    public SingleCountrydb() {
    }




}
