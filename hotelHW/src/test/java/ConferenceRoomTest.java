import Guests.Guest;
import Hotel.Rooms.ConferenceRoom;
import Hotel.Rooms.Room;
import Hotel.Rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;
    Room room;
    Guest guest;
    ArrayList<Guest> guests;

    @Before
    public void before() {
        guest = new Guest ("Mike");
        ArrayList<Guest> guests = new ArrayList<> ( );
        guests.add (guest);
        conferenceRoom = new ConferenceRoom ("Hall", 1, 1000, RoomType.CONFERENCE, guests);
    }

    @Test
    public void canGetRoomCapacity(){
        assertEquals (100, conferenceRoom.getRoomCapacity ());
    }

}
