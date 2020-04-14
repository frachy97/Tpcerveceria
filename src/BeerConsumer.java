


public class BeerConsumer extends Thread{
    BeerHouse beerhouse;
    public BeerConsumer(BeerHouse bh)
    {
        beerhouse = bh;
    }


    public void run()
    {
        int i;
        for (i = 1; i <= 50; i++)
        {
            int valorRandom = (int) Math.floor(Math.random()*50+1);
            beerhouse.sell(valorRandom);
        }
    }

}
