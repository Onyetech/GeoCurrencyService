package com.klasher.KlashaGeoCurrencyService.service.impl;

import com.klasher.KlashaGeoCurrencyService.dto.req.request.CityDataDto;
import com.klasher.KlashaGeoCurrencyService.dto.req.request.PopulationCountDto;
import com.klasher.KlashaGeoCurrencyService.dto.res.response.ApiResponse;
import com.klasher.KlashaGeoCurrencyService.service.PopulationService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@Service
public class PopulationServiceImpl implements PopulationService {

    @Value("${population.get.url}")
    private String apiUrl;

    @Override
    public List<Map<String, Object>> getTopNCitiesByPopulation(int N) {
        RestTemplate restTemplate = new RestTemplate();
        ApiResponse response = restTemplate.getForObject(apiUrl, ApiResponse.class);

        List<Map<String, Object>> resultList = new ArrayList<>();

        for (CityDataDto cityData : response.getData()) {
            String country = cityData.getCountry();

            if ("Italy".equals(country) || "New Zealand".equals(country) || "Ghana".equals(country)) {
                for (PopulationCountDto population : cityData.getPopulationCounts()) {
                    Map<String, Object> cityMap = new HashMap<>();
                    cityMap.put("city", cityData.getCity());
                    cityMap.put("country", country);
                    cityMap.put("year", population.getYear());
                    cityMap.put("population", Double.parseDouble(population.getValue()));
                    resultList.add(cityMap);
                }
            }
        }

        resultList.sort((map1, map2) -> Double.compare((Double) map2.get("population"), (Double) map1.get("population")));

        return resultList.subList(0, Math.min(N, resultList.size()));
    }
}

