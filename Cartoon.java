package myOnlineShop;

public class Cartoon extends ChildrensBooks{
    public String getCharecterName() {
        return CharecterName;
    }

    public void setCharecterName(String charecterName) {
        CharecterName = charecterName;
    }

    String CharecterName;
    public Cartoon(double regularPrice , String CharecterName,String Publisher,int yearpublished) {
        super(150,1978,"Sun Press");
    }

    @Override
    public double ComputeSalePrice() {
        return super.getRegularPrice()*0.4;
    }
}
