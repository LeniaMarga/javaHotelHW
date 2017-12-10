package Hotel.Rooms;

import Guests.Guest;

import java.util.ArrayList;

public class SingleBedroom extends Room{
    public SingleBedroom(int roomNumber, int rate, RoomType type, ArrayList<Guest> guests) {
        super (roomNumber, rate, type, guests);
    }

    public int setDayRate() {
        return (int) (rate*0.9);
    }

    public int setNightRate() {
        return (int) (rate+ rate*0.1);
    }

}
