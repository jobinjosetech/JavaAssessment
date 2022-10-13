// Java program to find the largest among three numbers in general way

import java.util.Scanner;

public class LargestNumberGeneral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int firstNumber =sc.nextInt();

        System.out.println("Enter the second number: ");
        int secondNumber =sc.nextInt();

        System.out.println("Enter the third number: ");
        int thirdNumber =sc.nextInt();

        if((firstNumber > secondNumber) && (firstNumber > thirdNumber)) {
            System.out.println(String.format("The first number %d is the largest number.", firstNumber));
        } else if(secondNumber > thirdNumber) {
            System.out.println(String.format("The second number %d is the largest number.", secondNumber));
        } else {
            System.out.println(String.format("The third number %d is the largest number.", thirdNumber));
        }
    }
}
