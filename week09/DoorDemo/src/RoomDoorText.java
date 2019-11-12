public class RoomDoorText {
    public static void main(String[] args) {
        Door aDoor = new RoomDoor(220, 150, "白色", 800.00);
        aDoor.summary();//简介
        aDoor.open();
        aDoor.close();

        aDoor = new PasswordDoor(260, 180, "灰色", 3000);
        aDoor.summary();//简介

        aDoor.open();

        if (aDoor instanceof PasswordDoor) { //更换了防盗门的密码
            ((PasswordDoor) aDoor).setPassword();
            aDoor.open();
            aDoor.close();
        }


    }
}
