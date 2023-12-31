package com.klasher.KlashaGeoCurrencyService.dto.req.request;

public class CountryCurrencyDto {
    private String name;
    private String currency;
    private String iso2;
    private String iso3;

    public CountryCurrencyDto() {
    }

    public CountryCurrencyDto(String name, String currency, String iso2, String iso3) {
        this.name = name;
        this.currency = currency;
        this.iso2 = iso2;
        this.iso3 = iso3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "CountryCurrencyDto{" +
                "name='" + name + '\'' +
                ", currency='" + currency + '\'' +
                ", iso2='" + iso2 + '\'' +
                ", iso3='" + iso3 + '\'' +
                '}';
    }
}
