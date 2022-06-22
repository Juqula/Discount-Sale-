package myOnlineShop;

public class Products {

    private double RegularPrice;

    public double getRegularPrice() {
        return RegularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        RegularPrice = regularPrice;
    }



    public Products(double regularPrice) {
        RegularPrice = regularPrice;
    }
    public double ComputeSalePrice(){
        return 0;
    }
}
