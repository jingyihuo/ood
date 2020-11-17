import java.util.List;

public class Flight {
    String flightNumber;
    int duration;
    Airport departure;
    Airport arrival;
    List<Seat> seats;
}

enum FlightStatus {}

class Airport {
    String name;
    Address address;
    String code;
    List<Flight> flightList;

    public List<Flight> getFlightList() {
        return flightList;
    }
}

class Address {
}

class Seat {
    String seatNumber;
    SeatClass sclass;
}

enum SeatClass {

}

class FlightSchedule {
    Flight flight;
    Date departingTime;
    String gate;
    FlightStatus status;

}

class Date {
}

