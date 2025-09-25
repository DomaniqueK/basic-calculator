import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       Scanner myscanner = new Scanner(System.in);

        System.out.println("Enter the first number.");
        String input = myscanner.nextLine();

        double firstNumber = Double.parseDouble(input);

        System.out.println("Enter the second number");
        String input2 = myscanner.nextLine();

        double secondNumber = Double.parseDouble(input2);
        double total = firstNumber * secondNumber;

        System.out.println(firstNumber + " * " + secondNumber + " = " + total);

    }
}
