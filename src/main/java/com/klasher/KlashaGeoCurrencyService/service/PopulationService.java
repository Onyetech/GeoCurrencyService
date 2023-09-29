package com.klasher.KlashaGeoCurrencyService.service;

import java.util.List;
import java.util.Map;

public interface PopulationService {
    List<Map<String, Object>> getTopNCitiesByPopulation(int N);

}
