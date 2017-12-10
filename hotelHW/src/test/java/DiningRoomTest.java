import Guests.Guest;
import Hotel.Rooms.DiningRoom;
import Hotel.Rooms.Room;
import Hotel.Rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {
    DiningRoom diningRoom;
    Room room;
    Guest guest;
    ArrayList<Guest> guests;

    @Before
    public void before() {
        guest = new Guest ("Mike");
        ArrayList<Guest> guests = new ArrayList<> ( );
        guests.add (guest);
        diningRoom = new DiningRoom ("Dining Hall", 2, 0, RoomType.DINING, guests);
    }

    @Test
    public void canGetRoomCapacity(){
        assertEquals (80, diningRoom.getRoomCapacity ());
    }
}
