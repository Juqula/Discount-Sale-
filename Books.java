package myOnlineShop;

public class Books extends Products{
    public int getYearpbluished() {
        return yearpbluished;
    }

    public void setYearpbluished(int yearpbluished) {
        this.yearpbluished = yearpbluished;
    }

    private int yearpbluished;

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String publisher) {
        Publisher = publisher;
    }

    private String Publisher;


    public Books(double regularPrice, String Publisher,int yearpublished) {
        super(regularPrice);

        this.Publisher=Publisher;
        this.yearpbluished=yearpublished;

    }
    public double ComputeSalePrice(){
        return super.getRegularPrice()*0.5;
    }
}
