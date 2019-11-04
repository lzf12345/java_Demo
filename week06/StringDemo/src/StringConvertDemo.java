import java.util.Arrays;

public class StringConvertDemo {
    public static void main(String[] args) {
        String sVers = "hello";
        char[] chars = sVers.toCharArray();

        System.out.println("String :"+sVers);
        System.out.print("char :");
        for(char c :chars){
            System.out.print(c);
        }
        System.out.println("\nchars :"+ Arrays.toString(chars));

        System.out.println("----------------------");

        char[] cArray = {'中','国'};
        String s = String.valueOf(cArray);

        System.out.println("cArray:"+Arrays.toString(cArray));
        System.out.println("s:"+s);

        System.out.println("-----------------------");

        System.out.println("sVers："+sVers);
        System.out.println("chars："+chars);
        System.out.println("sVers.equals(chars):"+sVers.equals(chars));
        System.out.println("sVers.equals(String.valueOf(chars)):"+sVers.equals(String.valueOf(chars)));

    }
}
