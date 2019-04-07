package com.sagar.spring.properties;

import java.util.Properties;

public class CountryNLangs {

    private Properties countryNlangs;

    public Properties getCountryNlangs() {
        return countryNlangs;
    }

    public void setCountryNlangs(Properties countryNlangs) {
        this.countryNlangs = countryNlangs;
    }

    @Override
    public String toString() {
        return "[Country And Langs = " + countryNlangs + "]";
    }
}
