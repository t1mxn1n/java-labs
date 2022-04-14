public class Producer implements Runnable {

    Stock stock;
    Producer(Stock stock) {
        this.stock=stock;
    }

    @Override
    public void run() {
       while (true){
            stock.put();
        }
    }
}