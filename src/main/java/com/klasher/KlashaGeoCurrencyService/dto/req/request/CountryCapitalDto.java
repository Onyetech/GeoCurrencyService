package com.klasher.KlashaGeoCurrencyService.dto.req.request;

public class CountryCapitalDto {
    private String name;
    private String capital;
    private String iso2;
    private String iso3;

    public CountryCapitalDto() {
    }

    public CountryCapitalDto(String name, String capital, String iso2, String iso3) {
        this.name = name;
        this.capital = capital;
        this.iso2 = iso2;
        this.iso3 = iso3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getIso2() {
        return iso2;
    }

    public void setIso2(String iso2) {
        this.iso2 = iso2;
    }

    public String getIso3() {
        return iso3;
    }

    public void setIso3(String iso3) {
        this.iso3 = iso3;
    }

    @Override
    public String toString() {
        return "CountryCapitalDto{" +
                "name='" + name + '\'' +
                ", capital='" + capital + '\'' +
                ", iso2='" + iso2 + '\'' +
                ", iso3='" + iso3 + '\'' +
                '}';
    }
}
