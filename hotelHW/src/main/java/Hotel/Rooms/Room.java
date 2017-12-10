package Hotel.Rooms;

import Guests.Guest;

import java.util.ArrayList;
import java.util.Collection;

public class Room {

    protected int roomNumber;
    protected int rate;
    protected RoomType type;
    protected ArrayList<Guest> guests;

    public Room(int roomNumber, int rate, RoomType type, ArrayList<Guest> guests){
        this.roomNumber = roomNumber;
        this.rate = rate;
        this.type = type;
        this.guests = guests;
    }


    public int getRoomNumber() {
        return roomNumber;
    }

    public int getRate() {
        return rate;
    }

    public RoomType getRoomType() {
        return this.type;
    }

    public int getRoomCapacity() {
        return this.type.roomCapacity ();
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public int getGuestsNumber(){
       return  guests.size();
    }


    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }


    public void roomCheckIn(Guest guest){
        if (guests.size() == 0)
        guests.add(guest);
    }


    public void emptyRoom(ArrayList<Guest> guests){
        guests.removeAll(guests);
    }

     public void removeFirstGuest(){
        guests.remove(0);
    }

    public void removeGuestByName(String name){
        for (Guest guest: guests){
        if (guest.name == name)
        guests.remove (guest);}
    }

    public String findGuest(String name) {
        for (Guest guest: guests){
        if (guest.name == name)
            return   guest.name ;}
        return "No guest";
}


}
