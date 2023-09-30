package com.klasher.KlashaGeoCurrencyService.controller;

import com.klasher.KlashaGeoCurrencyService.service.PopulationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/population")
public class PopulationController {

    @Autowired
    private PopulationService populationService;

    @GetMapping("/most-populated-cities")
    public List<Map<String, Object>> getMostPopulatedCities(@RequestParam int N) {
        return populationService.getTopNCitiesByPopulation(N);
    }
}

