package com.klasher.KlashaGeoCurrencyService.dto.req.request;

import java.util.List;

public class CountryPopulationDto {
    private String country;
    private String code;
    private String iso3;
    private List<PopulationCountDto> populationCounts;

    public CountryPopulationDto() {
    }

    public CountryPopulationDto(String country, String code, String iso3, List<PopulationCountDto> populationCounts) {
        this.country = country;
        this.code = code;
        this.iso3 = iso3;
        this.populationCounts = populationCounts;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getIso3() {
        return iso3;
    }

    public void setIso3(String iso3) {
        this.iso3 = iso3;
    }

    public List<PopulationCountDto> getPopulationCounts() {
        return populationCounts;
    }

    public void setPopulationCounts(List<PopulationCountDto> populationCounts) {
        this.populationCounts = populationCounts;
    }

    @Override
    public String toString() {
        return "CountryPopulationDto{" +
                "country='" + country + '\'' +
                ", code='" + code + '\'' +
                ", iso3='" + iso3 + '\'' +
                ", populationCounts=" + populationCounts +
                '}';
    }
}
