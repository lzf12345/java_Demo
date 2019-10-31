import java.util.Arrays;
import java.util.Random;

public class ArraySortDemo {
    public static void main(String[] args) {
        Random r = new Random();
        int[] a = new int[5];
        for(int i=0;i < a.length;i++)
        {
            a[i] = r.nextInt(100);
        }
        System.out.println("排序之前：");
        for(int k : a)
        {
            System.out.print(k+" ");
        }
        System.out.println("\n---------------------");
        Arrays.sort(a);
        System.out.println("排序之后（升序）：");
        for(int k : a)
        {
            System.out.print(k+" ");
        }
        System.out.println("\n---------------------");
        System.out.println("排序之后（降序）：");
        for(int i = a.length-1;i >=0; i--)
        {
            System.out.print(a[i]+" ");
        }

    }
}
