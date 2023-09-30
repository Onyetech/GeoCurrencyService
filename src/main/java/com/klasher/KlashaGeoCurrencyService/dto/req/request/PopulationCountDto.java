package com.klasher.KlashaGeoCurrencyService.dto.req.request;

public class PopulationCountDto {

    private String year;
    private String value;

    public PopulationCountDto() {
    }

    public PopulationCountDto(String year, String value) {
        this.year = year;
        this.value = value;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "PopulationCountDto{" +
                "year='" + year + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
