public class Room8 extends Rooms{
  String north() {

    currentRoom = new Room5();
    return "";
  }

  String west () {
    currentRoom = new Room7();
    return "";
  }

String east (){
    currentRoom = new Room9();
    return "";

}

  Room8() {
    Rooms.navn="Room 8";
    System.out.println(navn);
  }
}
