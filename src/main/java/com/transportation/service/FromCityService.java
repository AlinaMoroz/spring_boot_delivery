package com.transportation.service;

import com.transportation.models.DayOfWeekFromCity;
import com.transportation.models.FromCity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FromCityService {


    private DayOfWeekFromCity dayOfWeekFromCity = new DayOfWeekFromCity(true,false,false,
            true, false, false, false);
    private List<FromCity> fromCities = new ArrayList<>();


    {
        fromCities.add(new FromCity("Москва, Россия", dayOfWeekFromCity));
        fromCities.add(new FromCity("Питер, Россия", dayOfWeekFromCity));
        fromCities.add(new FromCity("Киев, Украина", dayOfWeekFromCity));
    }
}
