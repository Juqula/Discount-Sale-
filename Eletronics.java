package myOnlineShop;

public class Eletronics extends Products{

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private String color;
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    private String manufacturer;
    public Eletronics(String manufacturer, double regulaprice) {
        super(regulaprice);

    }

    @Override
    public double ComputeSalePrice() {
        return super.getRegularPrice()*0.6;
    }
}
