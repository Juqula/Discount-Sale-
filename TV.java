package myOnlineShop;

public class TV extends Eletronics{
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    int size;
    public TV(String manufacturer, double regulaprice,int size) {
        super(manufacturer, regulaprice);
        this.size=size;
    }

    @Override
    public double ComputeSalePrice() {
        return super.getRegularPrice()*0.8;
    }
}
