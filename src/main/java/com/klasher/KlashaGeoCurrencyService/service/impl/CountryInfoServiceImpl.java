package com.klasher.KlashaGeoCurrencyService.service.impl;

import com.klasher.KlashaGeoCurrencyService.dto.req.request.*;
import com.klasher.KlashaGeoCurrencyService.dto.res.response.ApiResponse;
import com.klasher.KlashaGeoCurrencyService.service.CountryInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class CountryInfoServiceImpl implements CountryInfoService {

    @Value("${positionApiUrl}")
    private String positionApiUrl;

    @Value("${capitalApiUrl}")
    private String capitalApiUrl;

    @Value("${currencyApiUrl}")
    private String currencyApiUrl;

    @Value("${populationApiUrl}")
    private String populationApiUrl;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public ApiResponse<List<CountryPositionDto>> fetchCountryPositions() {
        ResponseEntity<ApiResponse<List<CountryPositionDto>>> response = restTemplate.exchange(
                positionApiUrl,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<ApiResponse<List<CountryPositionDto>>>() {}
        );
        return response.getBody();
    }

    @Override
    public ApiResponse<List<CountryCapitalDto>> fetchCountryCapitals() {
        ResponseEntity<ApiResponse<List<CountryCapitalDto>>> response = restTemplate.exchange(
                capitalApiUrl,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<ApiResponse<List<CountryCapitalDto>>>() {}
        );
        return response.getBody();
    }

    @Override
    public ApiResponse<List<CountryCurrencyDto>> fetchCountryCurrencies() {
        ResponseEntity<ApiResponse<List<CountryCurrencyDto>>> response = restTemplate.exchange(
                currencyApiUrl,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<ApiResponse<List<CountryCurrencyDto>>>() {}
        );
        return response.getBody();
    }


    @Override
    public ApiResponse<List<CountryPopulationDto>> fetchCountryPopulations() {
        ResponseEntity<ApiResponse<List<CountryPopulationDto>>> response = restTemplate.exchange(
                populationApiUrl,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<ApiResponse<List<CountryPopulationDto>>>() {}
        );
        return response.getBody();
    }


    public long calculateCountryPopulation(String countryName, List<CityPopulationDto> cityPopulations) {
        return cityPopulations.stream()
                .filter(city -> countryName.equalsIgnoreCase(city.getCountry()))
                .mapToLong(city -> city.getPopulationCounts().stream()
                        .map(CityPopulationDto.PopulationCount::getValue)
                        .mapToLong(Long::parseLong)
                        .max()
                        .orElse(0))
                .sum();
    }

}
