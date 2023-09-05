package com.transportation.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FromCity {

    //private Long id;

    private String city;
    private  DayOfWeekFromCity dayOfWeekFromCity;
}
