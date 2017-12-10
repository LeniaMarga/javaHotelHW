package Hotel.Rooms;

import Guests.Guest;

import java.util.ArrayList;

public class ConferenceRoom extends Room {

    protected String name;

    public ConferenceRoom(String name, int roomNumber, int rate, RoomType type, ArrayList<Guest> guests) {
        super (roomNumber, rate, type, guests);
        this.name = name;
    }

    public String getName() {
        return name;
    }


}
