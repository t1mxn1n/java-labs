import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Stock size = ");
        String line = input.nextLine();
        var n = Integer.parseInt(line);

        Stock stock = new Stock(n);
        Producer producer = new Producer(stock);
        Customer customer = new Customer(stock);
        new Thread(producer).start();
        new Thread(customer).start();
    }
}
