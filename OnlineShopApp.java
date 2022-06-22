package myOnlineShop;

public class OnlineShopApp {
    public static void main(String[]args){
        Products[] pa = new Products[7];

        pa[0]= new TV("Samsung",1000,30);
        pa[1] = new TV("Sony",2000,50);
        pa[2] = new Eletronics("Apple",250);
        pa[3] = new Books(32,"Sun Press",1942);
        pa[4] = new Books(54,"North korea",1986);
        pa[5] = new ChildrensBooks(15,8,"Pee Wee");
        pa[6] = new Cartoon(14,"Batman","Pee Wee press",1942);

        double TotalRegularPrice = 0;
        double TotalSalePrice = 0;

        for(int i = 0; i<pa.length;i++){
            TotalRegularPrice += pa[i].getRegularPrice();
            TotalSalePrice += pa[i].ComputeSalePrice();

            System.out.println("Item Number "+i+": type = "+pa[i].getClass().getName()
                    +",Regular price = "+pa[i].getRegularPrice()+"Sale price = "+pa[i].ComputeSalePrice());
        }
        System.out.println("Total Regular price = "+TotalRegularPrice );
        System.out.println("Total regular sales ="+TotalSalePrice);
    }
}
