import Guests.Guest;
import Hotel.Rooms.Room;
import Hotel.Rooms.RoomType;
import Hotel.Rooms.SingleBedroom;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class SingleBedroomTest {

    SingleBedroom singleBedroom;
    Room room;
    Guest guest;
    ArrayList<Guest> guests;

    @Before
    public void before(){
        guest = new Guest("Mike");
        ArrayList<Guest> guests = new ArrayList<> ();
        guests.add(guest);
        singleBedroom = new SingleBedroom (3,20, RoomType.SINGLE, guests);
    }

    @Test
    public void canSetDayRate(){
        assertEquals(18, singleBedroom.setDayRate ());
    }

    @Test
    public void canSetNightRate(){
        assertEquals(22, singleBedroom.setNightRate ());
    }



}
