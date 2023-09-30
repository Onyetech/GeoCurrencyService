package com.klasher.KlashaGeoCurrencyService.dto.req.request;

public class CountryInfoDto {
    private double latitude;
    private double longitude;
    private String capital;
    private String currency;
    private String iso2;
    private String iso3;
    private long population;

    public CountryInfoDto() {
    }

    public CountryInfoDto(double latitude, double longitude, String capital, String currency, String iso2, String iso3, long population) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.capital = capital;
        this.currency = currency;
        this.iso2 = iso2;
        this.iso3 = iso3;
        this.population = population;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
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

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "CountryInfoDto{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                ", capital='" + capital + '\'' +
                ", currency='" + currency + '\'' +
                ", iso2='" + iso2 + '\'' +
                ", iso3='" + iso3 + '\'' +
                ", population=" + population +
                '}';
    }
}

