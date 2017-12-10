package Hotel;

import Guests.Guest;
import Hotel.Rooms.Room;

import java.util.ArrayList;

public class Hotel {

    private String name;
    private ArrayList<Room> rooms;

    public Hotel(String name, ArrayList<Room> rooms){
        this.name = name;
        this.rooms = rooms;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public int getNumberOfRooms(){
        return this.rooms.size();
    }

    public Room getRoomByNumber(int number) {
        for (Room room : rooms)
            if (room.getRoomNumber ( ) == number) {
                return room;
            }
        return null;
    }

    public String CheckIn(Room room, Guest guest){
            if (room.getGuestsNumber()== 0){
                room.roomCheckIn (guest);
            return "you are checked in";}
            return "sorry no room available";
    }

    public Room hotelFindGuest(String name){
        for (Room room: rooms){
            if (room.findGuest(name) == name)
        return room ;}
        return null;
    }



}
