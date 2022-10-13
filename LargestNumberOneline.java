// Java program to find the largest among three numbers using one line code.

import java.util.Scanner;

public class LargestNumberOneline {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int firstNumber =sc.nextInt();

        System.out.println("Enter the second number: ");
        int secondNumber =sc.nextInt();

        System.out.println("Enter the third number: ");
        int thirdNumber =sc.nextInt();

        String value = (firstNumber > secondNumber)?
                (firstNumber > thirdNumber?
                        String.format("The first number %d is the largest number.", firstNumber)
                            : String.format("The third number %d is the largest number.", thirdNumber))
                : (secondNumber > thirdNumber?
                        String.format("The second number %d is the largest number.", secondNumber)
                            : String.format("The third number %d is the largest number.", thirdNumber));

        System.out.println(value);

    }
}
