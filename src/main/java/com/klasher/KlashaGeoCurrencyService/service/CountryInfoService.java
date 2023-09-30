package com.klasher.KlashaGeoCurrencyService.service;

import com.klasher.KlashaGeoCurrencyService.dto.req.request.*;
import com.klasher.KlashaGeoCurrencyService.dto.res.response.ApiResponse;
import org.springframework.stereotype.Component;

import java.util.List;

public interface CountryInfoService {
    ApiResponse<List<CountryPositionDto>> fetchCountryPositions();
    ApiResponse<List<CountryCapitalDto>> fetchCountryCapitals();
    ApiResponse<List<CountryCurrencyDto>> fetchCountryCurrencies();
    ApiResponse<List<CountryPopulationDto>> fetchCountryPopulations();

}
