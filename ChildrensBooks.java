package myOnlineShop;

public class ChildrensBooks extends Books{
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    int age;
    public ChildrensBooks(double regularPrice, int age, String Publisher) {
        super(100,"Sun Press",2002);
        this.age=age;
    }

    @Override
    public double ComputeSalePrice() {
        return super.getRegularPrice()*0.3;
    }
}
