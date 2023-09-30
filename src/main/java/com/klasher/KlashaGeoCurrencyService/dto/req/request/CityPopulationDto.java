package com.klasher.KlashaGeoCurrencyService.dto.req.request;

import java.util.List;

public class CityPopulationDto {
    private String city;
    private String country;
    private List<PopulationCount> populationCounts;

    public static class PopulationCount {
        private String year;
        private String value;
        private String sex;
        private String reliability;

        public PopulationCount() {
        }

        public PopulationCount(String year, String value, String sex, String reliability) {
            this.year = year;
            this.value = value;
            this.sex = sex;
            this.reliability = reliability;
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

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public String getReliability() {
            return reliability;
        }

        public void setReliability(String reliability) {
            this.reliability = reliability;
        }

        @Override
        public String toString() {
            return "PopulationCount{" +
                    "year='" + year + '\'' +
                    ", value='" + value + '\'' +
                    ", sex='" + sex + '\'' +
                    ", reliability='" + reliability + '\'' +
                    '}';
        }
    }

    public CityPopulationDto() {
    }

    public CityPopulationDto(String city, String country, List<PopulationCount> populationCounts) {
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

    public List<PopulationCount> getPopulationCounts() {
        return populationCounts;
    }

    public void setPopulationCounts(List<PopulationCount> populationCounts) {
        this.populationCounts = populationCounts;
    }

    @Override
    public String toString() {
        return "CityPopulationDto{" +
                "city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", populationCounts=" + populationCounts +
                '}';
    }
}
