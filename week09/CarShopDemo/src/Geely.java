public class Geely implements ICar {
    private String color;

    public Geely(String color) {
        this.color = color;
    }

    @Override
    public String getName() {
        return this.color+"吉利";
    }

    @Override
    public double getPrice() {
        double price = 100000;
        return price;
    }

}
