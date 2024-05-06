package org.example.listing9;

import org.example.listing1.Passenger;
import org.example.listing7.Flight;

public class BusinessFlight extends Flight {
  public BusinessFlight(String id) {
    super(id);
  }
  
  @Override
  public boolean addPassenger(Passenger passenger) {
    if (passenger.isVip()) {
      return passengers.add(passenger);
    }
    return false;
  }
  
  @Override
  public boolean removePassenger(Passenger passenger) {
    return false;
  }
}
