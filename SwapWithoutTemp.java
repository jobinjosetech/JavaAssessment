// Java program to swap two numbers without temporary variables.

import java.util.Scanner;

public class SwapWithoutTemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int firstNumber =sc.nextInt();

        System.out.println("Enter the second number: ");
        int secondNumber =sc.nextInt();

        firstNumber = firstNumber + secondNumber;
        secondNumber = firstNumber - secondNumber;
        firstNumber = firstNumber - secondNumber;

        System.out.println(String.format("The swapped first number is %d and second number is %d", firstNumber, secondNumber));
    }
}
