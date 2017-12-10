import Guests.Guest;
import Hotel.Rooms.*;
import Hotel.Hotel;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    ArrayList<Room> rooms;
    SingleBedroom singleBedroom;
    DoubleBedroom doubleBedroom;
    DiningRoom diningRoom;
    ConferenceRoom conferenceRoom;
    Guest guest;
    ArrayList<Guest> guests;

    @Before
    public void before(){
        Guest guest1 = new Guest("Mike");
        Guest guest2 = new Guest("Monica");
        ArrayList<Room> rooms = new ArrayList<> ();
        ArrayList<Guest> guests = new ArrayList<> ();
        guests.add(guest1);
        guests.add(guest2);
        singleBedroom = new SingleBedroom (3,20, RoomType.SINGLE, guests);
        doubleBedroom = new DoubleBedroom (4,40, RoomType.DOUBLE, guests);
        diningRoom = new DiningRoom ("Dining Hall", 2, 0, RoomType.DINING, guests);
        conferenceRoom = new ConferenceRoom ("Hall", 1, 1000, RoomType.CONFERENCE, guests);
        rooms.add(singleBedroom);
        rooms.add(doubleBedroom);
        rooms.add(diningRoom);
        rooms.add(conferenceRoom);
        hotel = new Hotel ("Majestic", rooms);
    }


    @Test
    public void canGetNumberOfRooms(){
        assertEquals(4, hotel.getNumberOfRooms());
    }

    @Test
    public void canFindRoomByNumber(){
        assertEquals( conferenceRoom, hotel.getRoomByNumber (1));
    }


    @Test
    public void canFindGuestByName(){
        assertEquals(singleBedroom, hotel.hotelFindGuest("Mike"));
    }

    @Test
    public void canCheckIn(){
        Guest guest1 = new Guest("Mike");
        ArrayList<Guest> guests = new ArrayList<> ();
        SingleBedroom singleBedroom1 = new SingleBedroom (5,22, RoomType.SINGLE, guests);
        assertEquals ("you are checked in", hotel.CheckIn (singleBedroom1, guest1));
    }


}
