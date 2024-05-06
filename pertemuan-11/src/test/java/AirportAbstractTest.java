import org.example.listing1.Passenger;
import org.example.listing8.EconomyFlight;
import org.example.listing9.BusinessFlight;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class AirportAbstractTest {
  @DisplayName("Given there is an economy flight")
  @Nested
  class EconomyFlightTest {
    private EconomyFlight economyFlight;
    
    @BeforeEach
    void setUp() {
      economyFlight = new EconomyFlight("1");
    }
    
    @Test
    void testEconomyFlightRegularPassenger() {
      Passenger mike = new Passenger("Mike", false);
      assertEquals("1", economyFlight.getId());
      assertEquals(true, economyFlight.addPassenger(mike));
      assertEquals(1, economyFlight.getPassengersList().size());
      assertEquals("Mike",
          economyFlight.getPassengersList().get(0).getName());
      assertEquals(true, economyFlight.removePassenger(mike));
      assertEquals(0, economyFlight.getPassengersList().size());
    }
    
    @Test
    void testEconomyFlightVipPassenger() {
      Passenger james = new Passenger("James", true);
      assertEquals("1", economyFlight.getId());
      assertEquals(true, economyFlight.addPassenger(james));
      assertEquals(1, economyFlight.getPassengersList().size());
      assertEquals("James", economyFlight.getPassengersList().get(0).getName());
      assertEquals(false, economyFlight.removePassenger(james));
      assertEquals(1, economyFlight.getPassengersList().size());
    }
  }
  
  
  @DisplayName("Given there is a business flight")
  @Nested
  class BusinessFlightTest {
    private BusinessFlight businessFlight;
    
    @BeforeEach
    void setUp() {
      businessFlight = new BusinessFlight("2");
    }
    
    @Test
    void testBusinessFlightRegularPassenger() {
      Passenger mike = new Passenger("Mike", false);
      assertEquals(false, businessFlight.addPassenger(mike));
      assertEquals(0, businessFlight.getPassengersList().size());
      assertEquals(false, businessFlight.removePassenger(mike));
      assertEquals(0, businessFlight.getPassengersList().size());
    }
    
    @Test
    void testBusinessFlightVipPassenger() {
      Passenger james = new Passenger("James", true);
      assertEquals(true, businessFlight.addPassenger(james));
      assertEquals(1, businessFlight.getPassengersList().size());
      assertEquals(false, businessFlight.removePassenger(james));
      assertEquals(1, businessFlight.getPassengersList().size());
    }
  }
}
