import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;

/*
Из файла file.txt считываюстя построчно арифметические выражения
При помощи рег. выр. получаю два числа и арифметический символ (*, +, -, /)
И в зависимости от символа получаю результат
 */

public class Main {
    public static void main(String[] args) throws Exception {
        String source = "file.txt";

        FileReader fileReader = new FileReader(source);
        Scanner scanner = new Scanner(fileReader);

        String reg_num = "-?\\d+(\\.\\d+)?";
        String reg_symbol = "([-+*\\/])";

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            ArrayList<Float> numbers = new ArrayList<>();
            ArrayList<String> symbols = new ArrayList<>();

            Pattern num = Pattern.compile(reg_num);
            Pattern sym = Pattern.compile(reg_symbol);

            Matcher m = num.matcher(line);
            Matcher m1 = sym.matcher(line);

            while (m.find()) {
                numbers.add(Float.parseFloat(m.group()));
            }
            while (m1.find()) {
                symbols.add(m1.group());
            }
            String symbol = symbols.get(symbols.size() - 1);

            String result = "";

            switch (symbol) {
                case "+" -> {
                    result = Float.toString(numbers.get(0) + numbers.get(1));
                }
                case "-" -> {
                    if (numbers.get(1) < 0) {
                        float temp_number = numbers.get(1);
                        numbers.remove(1);
                        numbers.add(-temp_number);
                    }
                    result = Float.toString(numbers.get(0) - numbers.get(1));
                }
                case "*" -> {
                    result = Float.toString(numbers.get(0) * numbers.get(1));
                }
                case "/" -> {
                    if (numbers.get(1) == 0) {
                        result = "ZeroDivisionError";
                    }
                    else {
                        result = String.format("%.1f", numbers.get(0) / numbers.get(1));
                    }
                }
            }
            System.out.println(numbers.get(0) + " " + symbol + " " + numbers.get(1) + " = " + result);
        }
        fileReader.close();
    }
}

/*
OUTPUT EXAMPLE:

1.0 - 2.0 = -1.0
3.0 + 2.0 = 5.0
9.0 / 3.0 = 3,0
5.0 / 2.0 = 2,5
7.0 / 3.0 = 2,3
2.0 * 5.0 = 10.0
-9.0 * 4.0 = -36.0
-9.0 - 5.0 = -14.0
5.0 / 0.0 = ZeroDivisionError
-8.0 + 4.0 = -4.0
0.0 / 4.0 = 0,0

 */
