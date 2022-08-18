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

            for (int index=0; index < operatorTypes.length; index++) {
                if(operator == operatorTypes[index]) {
                    double result = calculateOperation(operator, num1, num2);
                    System.out.println("The result of " + "'" + operator + "'" + " is " + result);
                }
            }

            System.out.println("Do you want to exit? - Write number '0' to exit and number '1' to another operation...");
            int leaveCalculator = scanner.nextInt();
            if(leaveCalculator == 0) {
                System.out.println("Calculator stops...");
                System.exit(0);
            }
            if(leaveCalculator == 1) {
                System.out.println("Calculator starts...");
            }
        }
    }

    public static double calculateOperation(char operatorType, double firstNum, double secondNum) {
        char operator = operatorType;
        double result = 0;

        switch(operator) {
            case '+':
                result = firstNum + secondNum;
                break;

            case '-':
                result = firstNum - secondNum;
                break;

            case '*':
                result = firstNum * secondNum;
                break;

            case '/':
                result = firstNum / secondNum;
                break;
        }

        return result;
    }
}
