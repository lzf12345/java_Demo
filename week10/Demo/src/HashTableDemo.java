import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable balance = new Hashtable();
        balance.put("张三",new Double(100.00));
        balance.put("李四",new Double(200.00));
        balance.put("王五",new Double(300.00));
        balance.put("钱六",new Double(400.00));
        balance.put("孙七",new Double(500.00));

        Enumeration names;
        String str;

        names = balance.keys();
        while(names.hasMoreElements()){
            str = names.nextElement().toString();
            System.out.println(str+":"+balance.get(str));
        }

        Scanner input = new Scanner(System.in);
        System.out.print("请输入要查找的帐号：");
        String  key = input.nextLine();

        if (balance.containsKey(key)) {

            double x = (Double)balance.get(key);
            System.out.println("变动前的金额：");
            System.out.println(x);

            balance.put(key,x+500);

            System.out.println("改变后的金额：");
            System.out.println(balance.get(key));
        }else
            System.out.println("key为"+key+"的帐号未找到！！");
        input.close();
    }

}
