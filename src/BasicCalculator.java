import java.util.Scanner;
import java.util.Locale;

public class BasicCalculator {

    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            scanner.useLocale(Locale.ENGLISH);

            System.out.println("Write number 1:");
            double num1 = scanner.nextDouble();
            System.out.println("Write number 2:");
            double num2 = scanner.nextDouble();

            char[] operatorTypes = new char[]{'+', '-', '*', '/'};

            System.out.println("Which operation do you want to execute ('+' '-' '*' '/') ?");
            char operator = scanner.next().charAt(0);

            System.out.println(num1);
            System.out.println(num2);
            System.out.println(operator);
        }
    }
}
