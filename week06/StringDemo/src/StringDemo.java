public class StringDemo {
    public static void main(String[] args) {
        String s1 = "Hello world!";
        String s2 = "Hello world!";
        String s3 = new String("Hello world!");

        System.out.println("s1==s2:"+(s1==s2));
        System.out.println("s1==s3:"+(s1==s3));
        System.out.println(s1.equals(s3));
        System.out.println();

        byte[] b = new byte[]{65,66,67,68};
        for(byte k: b)
        {
            System.out.print(k+" ");
        }
        System.out.println();
        String str = new String(b);
        System.out.println(str);
        str = new String(b,1,2);
        System.out.println(str);
        byte[] bytes = str.getBytes();
        for(byte k: bytes)
        {
            System.out.print(k+" ");
        }
        System.out.println();

        char[] ch = {'a','B','好'};
        for(char c : ch){
            System.out.print(c + " ");
        }
        System.out.println();
        str = new String(ch);
        System.out.println(str);
        str = new String(ch,1,2);
        System.out.println(str);
        char[] chs = str.toCharArray();
        for(char c : chs){
            System.out.print(c + " ");
        }
    }
}
