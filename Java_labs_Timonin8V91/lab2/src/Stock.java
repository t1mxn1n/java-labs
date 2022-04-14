public class Stock
{
    int size;
    private int amount = 0;

    public Stock(int size) {
        this.size = size;
    }

    public synchronized void get()
    {
        while (amount < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        amount--;
        System.out.println("Потреблен товар, количество товара на складе: " + amount);
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        notify();
    }
    public synchronized void put() {
        while (amount >= size) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        amount++;
        System.out.println("Произведен товар, количество товара на складе: " + amount);
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        notify();
    }
}