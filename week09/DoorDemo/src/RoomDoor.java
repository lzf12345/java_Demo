public class RoomDoor extends Door {//普通门类


    public RoomDoor(int height, int width, String color, double price) {
        super(height, width, color, price);
    }

    @Override
    public void summary() {
        System.out.println("类型：普通门，规格：");
        super.summary();
    }

    @Override
    void open() {
        System.out.println("正在开门....");
    }

    @Override
    void close() {
        System.out.println("正在关门....");

    }
}
