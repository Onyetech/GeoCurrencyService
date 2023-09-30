package com.klasher.KlashaGeoCurrencyService.controller;

import com.klasher.KlashaGeoCurrencyService.dto.req.request.*;
import com.klasher.KlashaGeoCurrencyService.dto.res.response.ApiResponse;
import com.klasher.KlashaGeoCurrencyService.dto.res.response.CountryInfoDto;
import com.klasher.KlashaGeoCurrencyService.service.CountryInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/country")
public class CountryController {

    @Autowired
    private CountryInfoService countryService;

    @GetMapping("/{countryName}")
    public ResponseEntity<CountryInfoDto> getCountryInfo(@PathVariable String countryName) {
        CountryPositionDto countryInfo = new CountryPositionDto();

        ApiResponse<List<CountryPositionDto>> positions = countryService.fetchCountryPositions();
        positions.getData().stream()
                .filter(dto -> countryName.equalsIgnoreCase(dto.getName()))
                .findFirst()
                .ifPresent(position -> {
                    countryInfo.setLatitude(position.getLatitude());
                    countryInfo.setLongitude(position.getLongitude());
                });


        ApiResponse<List<CountryCapitalDto>> capitals = countryService.fetchCountryCapitals();
        capitals.getData().stream()
                .filter(dto -> countryName.equalsIgnoreCase(dto.getName()))
                .findFirst()
                .ifPresent(capital -> {
                    countryInfo.setCapital(capital.getCapital());
                    countryInfo.setIso2(capital.getIso2());
                    countryInfo.setIso3(capital.getIso3());
                });


        ApiResponse<List<CountryCurrencyDto>> currencies = countryService.fetchCountryCurrencies();
        currencies.getData().stream()
                .filter(dto -> countryName.equalsIgnoreCase(dto.getName()))
                .findFirst()
                .ifPresent(currency -> countryInfo.setCurrency(currency.getCurrency()));


        ApiResponse<List<CountryPopulationDto>> populations = countryService.fetchCountryPopulations();

        Optional<CityPopulationDto> targetCountry = populations.getData().stream()
                .filter(dto -> countryName.equalsIgnoreCase(dto.getCountry()))
                .findFirst();

        long totalPopulation = 0;

        if (targetCountry.isPresent()) {
            totalPopulation = targetCountry.get().getPopulationCounts().stream()
                    .mapToLong(populationCountDto -> Long.parseLong(populationCountDto.getValue()))
                    .sum();
        }

        countryInfo.setPopulation(totalPopulation);


        return ResponseEntity.ok(countryInfo);
    }
}

