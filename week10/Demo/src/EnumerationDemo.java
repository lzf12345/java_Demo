import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {
    public static void main(String[] args) {
        Enumeration<String> weekDays;
        Vector<String> weekDayNames = new Vector<String>();
        weekDayNames.add("星期一");
        weekDayNames.add("星期二");
        weekDayNames.add("星期三");
        weekDayNames.add("星期四");
        weekDayNames.add("星期五");
        weekDayNames.add("星期六");
        weekDayNames.add("星期天");

        weekDays = weekDayNames.elements();
        while (weekDays.hasMoreElements()){
            System.out.println(weekDays.nextElement());
        }
    }
}
