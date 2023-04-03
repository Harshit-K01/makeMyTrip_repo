package com.MakeMyTrip.springboot.mmt_project.service;

import com.MakeMyTrip.springboot.mmt_project.entity.FlightDetail;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface FlightDetailService {

    List<FlightDetail> findAllFlights();

    Optional<FlightDetail> findFlightById(int theId);

    List<Object> findFlight(String source, String destination, LocalDate departDay, String classType);

    FlightDetail saveFlight(FlightDetail theFlightDetail);

    void deleteFlightById(int theId);
}
