

public class BeerProducter extends Thread{
    BeerHouse beerhouse;
    public boolean execute= true;

    public BeerProducter(BeerHouse bh)
    {
        beerhouse = bh;
    }


    public void run()
    {

            int i;
            for (i = 1; i <=50; i++)
            {
                while (execute){
                    if (beerhouse.getStock() == 100){
                        this.stopThread();
                    }
                    int valorRandom = (int) Math.floor(Math.random() * 19+ 1);
                    beerhouse.buy(valorRandom);
                }

            }

    }

    public void stopThread() {
        execute= false;
    }


}
