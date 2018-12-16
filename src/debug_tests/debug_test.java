package debug_tests;

import java.util.Scanner;

public class debug_test {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.println("Enter your age to see if you are an adult:");
            int age = scan.nextInt();

            if (age < 18) {
                System.out.println("You are under age and not an adult");
            } else {
                System.out.println("You are old enough to party");
            }
        }

    }
}
