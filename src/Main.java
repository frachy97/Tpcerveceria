
public class Main{
    public static void main(String[]args){

        BeerHouse beerhouse=new BeerHouse();
        BeerProducter p =new BeerProducter(beerhouse);
        BeerConsumer c =new BeerConsumer(beerhouse);

        p.start();
        c.start();
        }
}
