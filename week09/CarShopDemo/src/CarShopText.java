public class CarShopText {
    public static void main(String[] args) {
        CarShop aShop = new CarShop("啦啦啦4s店");
        aShop.sellCar(new Banz("黑色"));
        aShop.sellCar(new Geely("黑色"));
        aShop.sellCar(new Banz("红色"));
        System.out.printf("%s总销售量：%d台，总销售额：%,.2f元\n",aShop.getShopName(),aShop.getCount(),aShop.getMoney());
    }
}
