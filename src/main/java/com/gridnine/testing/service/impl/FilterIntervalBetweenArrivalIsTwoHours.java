package com.gridnine.testing.service.impl;

import com.gridnine.testing.model.Flight;
import com.gridnine.testing.service.Filter;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

public class FilterIntervalBetweenArrivalIsTwoHours implements Filter {

    @Override
    public List<Flight> filter(List<Flight> flights) {
        List<Flight> flightsFilter = flights.stream().filter(flight -> {
            int difference = 0;
            for (int i = 0; i < flight.getSegments().size() - 1; i++) {
                Duration duration = Duration.between(flight.getSegments().get(i).getArrivalDate(),
                        flight.getSegments().get(i + 1).getDepartureDate());
                difference += duration.toHours();
            }
            return difference < 2;
        }).collect(Collectors.toList());
        return flightsFilter;
    }
}
