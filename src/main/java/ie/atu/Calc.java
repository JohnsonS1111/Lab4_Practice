package ie.atu;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {

        delete();
    }

    private static void delete() {
        System.out.println("Enter first number");
        Scanner inputs = new Scanner(System.in);
        int firstNum = inputs.nextInt();

        System.out.println("Please enter second number: ");
        int secondNum = inputs.nextInt();

        int total = firstNum - secondNum;
        System.out.println("the total is " +total);
    }
}
