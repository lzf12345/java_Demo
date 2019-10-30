import java.sql.SQLOutput;

public class ArrayDemo1 {
    public static void main(String[] args) {
        int[] a= new int[5];
        a[0]=1;
        a[1]=2;
        a[2]=3;
        a[3]=4;
        a[4]=5;
        for(int i=0;i < a.length;i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println("\n-----------------------");
        for(int k:a){
            System.out.print(k+" ");
        }
        int b[];
        b = new int[5];
        for(int i=0;i < b.length;i++) {
            b[i] = i+4;
        }
        System.out.println("\n-----------------------");
        for(int k:b){
            System.out.print(k+" ");
        }
        int[] c = {4,3,2,1,5};
        System.out.println("\n-----------------------");
        for(int k:c){
            System.out.print(k+" ");
        }
    }
}
