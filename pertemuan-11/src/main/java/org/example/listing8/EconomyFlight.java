package org.example.listing8;

import org.example.listing1.Passenger;
import org.example.listing7.Flight;

public class EconomyFlight extends Flight {
  public EconomyFlight(String id) {
    super(id);
  }
  
  @Override
  public boolean addPassenger(Passenger passenger) {
    return passengers.add(passenger);
  }
  
  @Override
  public boolean removePassenger(Passenger passenger) {
    if (!passenger.isVip()) {
      return passengers.remove(passenger);
    }
    return false;
  }
}
