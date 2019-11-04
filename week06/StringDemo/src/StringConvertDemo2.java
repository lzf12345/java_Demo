public class StringConvertDemo2 {
    public static void main(String[] args) {

        String str = "12";
        System.out.println(str+1);
        int s1 = Integer.parseInt(str);
        System.out.println(s1+1);

        String str2 = "2.3";
        double s2 = Double.parseDouble(str2);
        System.out.println(s2+1);

        String s= 12 +"";
        System.out.println(s);

        String s3 = String.valueOf(2.3);
        System.out.println(10+s3);

        String s4 = Integer.toString(12);
        System.out.println(s4+1);
    }
}
