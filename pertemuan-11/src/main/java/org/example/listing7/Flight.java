package org.example.listing7;

import org.example.listing1.Passenger;

import java.util.*;

public abstract class Flight {
  private String id;
  protected List<Passenger> passengers = new ArrayList<Passenger>();
  public Flight(String id) {
    this.id = id;
  }
  public String getId() {
    return id;
  }
  public List<Passenger> getPassengersList() {
    return Collections.unmodifiableList(passengers);
  }
  public abstract boolean addPassenger(Passenger passenger);
  public abstract boolean removePassenger(Passenger passenger);
}
