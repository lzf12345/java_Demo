public class MainDemo {
    public static void main(String[] args) {
        Employee em;

        Programmer pro = new Programmer("Tom","20180001",5600,"java");

        Manager man = new Manager("Candy","20180002",10000,2000);

        em = pro;
        em.work();
        if(em instanceof Programmer)
            ((Programmer)em).developmentLanguage = "C++";
        em.showInfo();

        em = man;
        em.work();
        if(em instanceof Manager)
            ((Manager)em).bonus = 5000;
        em.showInfo();
    }
}
