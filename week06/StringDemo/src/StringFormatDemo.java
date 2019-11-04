import java.text.SimpleDateFormat;
import java.util.Date;

public class StringFormatDemo {
    public static void main(String[] args) {
        int x = 13;
        char ch = 'A';
        byte b = 97;
        double d = 4323232.323323;

        System.out.println(x);
        System.out.println(ch);
        System.out.println(b);
        System.out.println(d);

        String s1 = String.format("%06d",x);
        System.out.println(s1);
        System.out.println(String.format("%-6d",x));
        System.out.println(String.format(",3.2f",d));
        System.out.printf("%c\n",ch);
        System.out.printf("%c\n",b);

        Date dt = new Date();

        System.out.println(String.format("%tF %tT",dt,dt));
        System.out.println("-----------------------------");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(dt));
    }
}
