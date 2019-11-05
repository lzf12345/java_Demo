public class StaticDemo {
    private static int count = 0 ;
    public StaticDemo(){
        count++;
        System.out.printf("正在实例化第%d个对象……\n",count);
    }

    public static void show() {
        System.out.println("count=" + count);
    }
}
