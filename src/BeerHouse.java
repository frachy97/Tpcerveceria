

public class BeerHouse {
    int stock;
    private int tope= 100;

    public BeerHouse() {
        stock=0;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public synchronized void buy(int st) {
        if(stock + st <= tope){
            System.out.println("Se compro: " + st+ " cervezas.");
            stock = stock + st;
        }else{
            if(stock != tope)
            System.out.println("Se compro: " + (tope-stock) + " cervezas.");// siempre pido hasta el tope
            stock = tope;                                                   
        }
        Stock();
    }

    public synchronized void sell(int st) {
        if(stock- st >= 0){
            System.out.println("Se vendio: " + st+" cervezas.");
            stock = stock- st;
        }else{
            if(stock != 0)
            System.out.println("Se vendio: " + stock+" cervezas.");//si pide mas de lo que tengo, le vendo lo q me sobro.
            stock =0;
        }
        Stock();
    }

    public void waitBuy(){
        System.out.println("No se puede comprar porque hay demasiado stock");
        Stock();

    }

    public void Stock(){
        System.out.println("Stock actual ->>>> " + stock);
    }
}
