import java.util.List;

public class Hotel {
    String name;
    Location location;
    List<Room> roomList;
}

class Room {
    RoomStyle roomStyle;
    RoomStatus roomStatus;
}

enum RoomStyle {
    DELUXE, FAMILY,
}

enum RoomStatus {
    AVAILABLE, OCCUPIED, RESERVED;
}

class Location {
    Integer pin;
    String street;
    String city;
    String Country;
}

class Person {
    String name;
    Account account;
}

class Account {
    String username;
    String password;
}

class Guest extends Person {

}

class HouseKeeper extends Person {
}

class Receptionist extends Person {
}
