package com.gridnine.testing.service;

import com.gridnine.testing.model.Flight;
import com.gridnine.testing.model.FlightBuilder;

import java.util.List;

public interface Filter {

    List<Flight> filter(List<Flight> flights);
}
