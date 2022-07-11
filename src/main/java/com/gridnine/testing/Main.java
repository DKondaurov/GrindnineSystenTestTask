package com.gridnine.testing;

import com.gridnine.testing.model.Flight;
import com.gridnine.testing.model.FlightBuilder;
import com.gridnine.testing.service.impl.FilterIntervalBetweenArrivalIsTwoHours;
import com.gridnine.testing.service.impl.FilterSegmentsWithArrivalDateBeforeDepartureDate;
import com.gridnine.testing.service.impl.FilterUpToTheCurrentTime;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Flight> flights = FlightBuilder.createFlights();

        FilterUpToTheCurrentTime flight1 = new FilterUpToTheCurrentTime();
        System.out.println(flight1.filter(flights));

        FilterSegmentsWithArrivalDateBeforeDepartureDate flight2 = new FilterSegmentsWithArrivalDateBeforeDepartureDate();
        System.out.println(flight2.filter(flights));

        FilterIntervalBetweenArrivalIsTwoHours flight3 = new FilterIntervalBetweenArrivalIsTwoHours();
        System.out.println(flight3.filter(flights));

    }
}
