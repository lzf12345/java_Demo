public class StaticText {
    public static void main(String[] args) {
        StaticDemo.show();
        System.out.println("-----------------");
        StaticDemo s1 = new StaticDemo();
        s1.show();
        StaticDemo s2 = new StaticDemo();
        s2.show();
        StaticDemo.show();

    }
}
