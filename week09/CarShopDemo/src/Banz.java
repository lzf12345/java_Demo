public class Banz implements ICar {
    private  String color = "黑色";

    public Banz(String color) {
        this.color = color;
    }

    @Override
    public String getName() {
        return this.color+"奔驰";
    }

    @Override
    public double getPrice() {
        double price = 300000;

        if(this.color.equals("红色")){
            price += 10000;
        }

        return price;
    }
}
