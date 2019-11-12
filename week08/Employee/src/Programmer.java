public class Programmer extends Employee {
    String developmentLanguage;
    public Programmer() {
    }

    public Programmer(String name, String id, double pay,String developmentLanguage) {
        super(name, id, pay);
        this.developmentLanguage = developmentLanguage;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.printf("developmentLanguage：%s\n",developmentLanguage);
    }

    @Override
    public void work() {
        System.out.println("我是一个程序员！！！");
        showInfo();
    }
}
