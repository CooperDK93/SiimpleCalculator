import java.util.Scanner;

    public class SimpleCalculator {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Give the first number: ");
            double inputOne = Double.parseDouble(scanner.nextLine());
            System.out.println("Give the second number: ");
            double inputTwo = Double.parseDouble(scanner.nextLine());

            double sum = inputOne + inputTwo;
            double difference = inputOne - inputTwo;
            double product = inputOne * inputTwo;
            double quotient = inputOne / inputTwo;

            System.out.println(inputOne + " + " + inputTwo + " = " + sum);
            System.out.println(inputOne + " - " + inputTwo + " = " + difference);
            System.out.println(inputOne + " * " + inputTwo + " = " + product);
            System.out.println(inputOne + " / " + inputTwo + " = " + quotient);

        }
    }



