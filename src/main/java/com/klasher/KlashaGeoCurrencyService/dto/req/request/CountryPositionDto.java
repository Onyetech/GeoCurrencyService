package com.klasher.KlashaGeoCurrencyService.dto.req.request;

public class CountryPositionDto {
    private String name;
    private String iso2;
    private double latitude;
    private double longitude;

    public CountryPositionDto() {
    }

    public CountryPositionDto(String name, String iso2, double latitude, double longitude) {
        this.name = name;
        this.iso2 = iso2;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIso2() {
        return iso2;
    }

    public void setIso2(String iso2) {
        this.iso2 = iso2;
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

    @Override
    public String toString() {
        return "CountryPositionDto{" +
                "name='" + name + '\'' +
                ", iso2='" + iso2 + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
