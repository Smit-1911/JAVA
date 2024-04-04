public class RoomArea {
    public static void main(String[] args) {
        
        Room myRoom = new Room(5,6);
        double area = myRoom.getLength() * myRoom.getWidth();
        System.out.println("The area of the room is: " + area);
    }
}
