package com.klasher.KlashaGeoCurrencyService.dto.req.request;

import java.util.List;
public class CityDataDto {

    private String city;
    private String country;
    private List<PopulationCountDto> populationCounts;

    public CityDataDto() {
    }

    public CityDataDto(String city, String country, List<PopulationCountDto> populationCounts) {
        this.city = city;
        this.country = country;
        this.populationCounts = populationCounts;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<PopulationCountDto> getPopulationCounts() {
        return populationCounts;
    }

    public void setPopulationCounts(List<PopulationCountDto> populationCounts) {
        this.populationCounts = populationCounts;
    }

    @Override
    public String toString() {
        return "CityDataDto{" +
                "city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", populationCounts=" + populationCounts +
                '}';
    }
}
