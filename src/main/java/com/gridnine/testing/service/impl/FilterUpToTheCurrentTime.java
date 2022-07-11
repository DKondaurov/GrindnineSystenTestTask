package com.gridnine.testing.service.impl;

import com.gridnine.testing.model.Flight;
import com.gridnine.testing.service.Filter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class FilterUpToTheCurrentTime implements Filter {
    @Override
    public List<Flight> filter(List<Flight> flights) {
        List<Flight> flightsFilter = flights.stream().
                filter(flight -> flight.getSegments().get(0).getDepartureDate().isAfter(LocalDateTime.now())).
                collect(Collectors.toList());
        return flightsFilter;
    }
}
