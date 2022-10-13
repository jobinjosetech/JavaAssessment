// Java Program to find ASCII value of a given character.

import java.util.Scanner;

public class ASCIIValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ASCII character: ");
        char ascii_char = sc.next().charAt(0);
        System.out.println(String.format("The ASCII value of %c is %d", ascii_char, (int)ascii_char));
    }
}
