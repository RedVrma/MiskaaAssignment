package com.puneetverma.miskaa.rest.models.country;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Translations {

    @SerializedName("de")
    @Expose
    public String de;
    @SerializedName("es")
    @Expose
    public String es;
    @SerializedName("fr")
    @Expose
    public String fr;
    @SerializedName("ja")
    @Expose
    public String ja;
    @SerializedName("it")
    @Expose
    public String it;
    @SerializedName("br")
    @Expose
    public String br;
    @SerializedName("pt")
    @Expose
    public String pt;
    @SerializedName("nl")
    @Expose
    public String nl;
    @SerializedName("hr")
    @Expose
    public String hr;
    @SerializedName("fa")
    @Expose
    public String fa;

    public Translations(String de, String es, String fr, String ja, String it, String br, String pt, String nl, String hr, String fa) {
        this.de = de;
        this.es = es;
        this.fr = fr;
        this.ja = ja;
        this.it = it;
        this.br = br;
        this.pt = pt;
        this.nl = nl;
        this.hr = hr;
        this.fa = fa;
    }

    public String getDe() {
        return de;
    }

    public String getEs() {
        return es;
    }

    public String getFr() {
        return fr;
    }

    public String getJa() {
        return ja;
    }

    public String getIt() {
        return it;
    }

    public String getBr() {
        return br;
    }

    public String getPt() {
        return pt;
    }

    public String getNl() {
        return nl;
    }

    public String getHr() {
        return hr;
    }

    public String getFa() {
        return fa;
    }
}
