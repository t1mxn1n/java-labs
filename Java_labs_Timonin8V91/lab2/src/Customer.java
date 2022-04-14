public class Customer implements Runnable {

    Stock stock;
    Customer(Stock stock) {
        this.stock=stock;
    }

    @Override
    public void run(){
        while (true) {
            stock.get();
        }
    }
}
