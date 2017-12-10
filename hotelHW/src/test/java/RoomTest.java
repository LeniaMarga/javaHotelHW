import Guests.Guest;
import Hotel.Rooms.Room;
import Hotel.Rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;


import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;
    Guest guest;
    ArrayList<Guest> guests;

    @Before
    public void before(){
        guest = new Guest("Mike");
        ArrayList<Guest> guests = new ArrayList<> ();
        guests.add(guest);
        room = new Room(3,30, RoomType.SINGLE, guests);
    }


    @Test
    public void canGetRoomCapacity(){
        assertEquals (1, room.getRoomCapacity ());
    }

    @Test
    public void canGetGuestsNumber(){
        ArrayList<Guest> guests = new ArrayList<> ();
        Room room1 = new Room (4,32,RoomType.SINGLE, guests);
        assertEquals (0, room1.getGuestsNumber ());
    }

    @Test
    public void canFindGuestByName(){
        assertEquals("No guest", room.findGuest("Phil"));
    }

//    @Test
//    public void canCheckIn(){
//        guests.add(guest);
//        assertEquals("No guest", room.findGuest("Phil"));
//    }



}
