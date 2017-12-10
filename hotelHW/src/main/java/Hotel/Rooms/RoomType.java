package Hotel.Rooms;

public enum RoomType {
    SINGLE(1),
    DOUBLE(2),
    FAMILY(4),
    DINING(80),
    CONFERENCE(100);

    protected int capacity;

    RoomType(int capacity) {
        this.capacity = capacity;
    }

    public int roomCapacity() {
        return capacity;
    }

}
