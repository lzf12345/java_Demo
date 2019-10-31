public class ArrayDemo2 {
    public static void main(String[] args) {
        int[][] a = new int[2][];
        a[0] = new int[2];
        a[0][0] = 1;
        a[0][1] = 3;
        a[1] = new int[]{1,2,3,4,5};
        for(int i =0;i<a.length;i++)
        {
            for(int j = 0;j < a[i].length;j++)
                System.out.print(a[i][j]+" ");
            System.out.println();
        }
        System.out.println("--------------------------");

        int[][] b = {{1,2,3,4},{12,23,45,56,54}};
        for(int[] m: b){
            for(int n: m){
                System.out.print(n+" ");
            }
            System.out.println();
        }
    }
}
