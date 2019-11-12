public class Manager extends Employee {
    double bonus;
    public Manager(){

    };

    public Manager(String name, String id, double pay, double bonus) {
        super(name, id, pay);
        this.bonus = bonus;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.printf("bonus：%,.2f\n",bonus);
    }

    @Override
    public void work() {
        System.out.println("我是一名经理！！！");
        showInfo();
    }
}
