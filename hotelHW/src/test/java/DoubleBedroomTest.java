import Guests.Guest;
import Hotel.Rooms.DoubleBedroom;
import Hotel.Rooms.Room;
import Hotel.Rooms.RoomType;
import Hotel.Rooms.SingleBedroom;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DoubleBedroomTest {
    DoubleBedroom doubleBedroom;
    Room room;
    Guest guest;
    ArrayList<Guest> guests;

    @Before
    public void before(){
        guest = new Guest("Mike");
        ArrayList<Guest> guests = new ArrayList<> ();
        guests.add(guest);
        doubleBedroom = new DoubleBedroom (3,40, RoomType.DOUBLE, guests);
    }

    @Test
    public void canSetDayRate(){
        assertEquals(36, doubleBedroom.setDayRate ());
    }

    @Test
    public void canSetNightRate(){
        assertEquals(44, doubleBedroom.setNightRate ());
    }


}
