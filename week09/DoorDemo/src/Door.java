public abstract class Door {
    private int height;
    private int width;
    private String color;
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Door(int height, int width, String color, double price) {
        this.height = height;
        this.width = width;
        this.color = color;
        setPrice(price);
    }
    public void summary(){
        System.out.printf("高：%d，宽：%d，颜色：%s，价格：%.2f\n",this.height,this.width,this.color,this.price);
    }
    abstract void open();
    abstract void close();
}
