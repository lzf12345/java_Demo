import java.util.Scanner;

public class PasswordDoor extends Door implements IAlarm {
    private String password;

    public PasswordDoor(int height, int width, String color, double price) {
        super(height, width, color, price);
        password = "000000";
    }

    public void setPassword() {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入旧密码：");
        if(password.equals(in.nextLine())) {
            System.out.print("请输入新密码：");
            this.password = in.nextLine();
            System.out.println("修改成功，请牢记新密码！！！");
        }
        else {
            System.out.println("非法用户正在试图改密码....");
            alarm();
        }
    }

    @Override
    void open() {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入密码：");
        if(password.equals(in.nextLine())) {

            System.out.println("密码正确，正在开门....");
        }
        else {
            System.out.println("非法用户正在试图开门....");
            alarm();
        }
    }


    @Override
    void close() {
        System.out.println("正在关门....");
    }

    @Override
    public void alarm() {
        System.out.println("发出报警声音，同时自动拔打报警电话....");
    }
}
