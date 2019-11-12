public abstract class Employee {
    String name;
    String id;
    double pay;

    public Employee(){}
    public Employee(String name, String id, double pay) {
        this.name = name;
        this.id = id;
        this.pay = pay;
    }

    public void showInfo(){
        System.out.print(String.format("name:%s,id:%s,pay:%,.2f，",name,id,pay));
    }
    public abstract void work();
}
