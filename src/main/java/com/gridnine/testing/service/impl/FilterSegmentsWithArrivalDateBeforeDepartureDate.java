package com.gridnine.testing.service.impl;

import com.gridnine.testing.model.Flight;
import com.gridnine.testing.service.Filter;

import java.util.List;
import java.util.stream.Collectors;

public class FilterSegmentsWithArrivalDateBeforeDepartureDate implements Filter {
    @Override
    public List<Flight> filter(List<Flight> flights) {
        List<Flight> flightsFilter = flights.stream().filter(flight -> flight.getSegments().get(0).getDepartureDate().isBefore(flight.getSegments().get(0).getArrivalDate())).collect(Collectors.toList());
        return flightsFilter;
    }
}
