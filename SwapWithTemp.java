// Java program to swap two numbers with temporary variables.

import java.util.Scanner;

public class SwapWithTemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int firstNumber =sc.nextInt();

        System.out.println("Enter the second number: ");
        int secondNumber =sc.nextInt();

        int tempNumber = firstNumber;
        firstNumber = secondNumber;
        secondNumber = tempNumber;

        System.out.println(String.format("The swaped first number is %d and second number is %d",firstNumber, secondNumber));
    }
}
