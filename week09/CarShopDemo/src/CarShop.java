public class CarShop {
    private String shopName;
    private int count = 0;
    private double money = 0.00;

    public CarShop(String shopName) {
        this.shopName = shopName;
    }

    public String getShopName() {
        return shopName;
    }

    public int getCount() {
        return count;
    }

    public double getMoney() {
        return money;
    }

    public void sellCar(ICar car){
        System.out.printf("%s售出了一台%s,单价：%,.2f\n",this.shopName,car.getName(),car.getPrice());
        count ++;
        money += car.getPrice();
    }
}
