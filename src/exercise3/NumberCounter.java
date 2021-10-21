package exercise3;

import java.util.Scanner;

public class NumberCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        int positive_numbers = 0, negative_numbers = 0, sum = 0, count = 0;
        double average;

        do {
            a = input.nextInt();
            if (a > 0) {
                positive_numbers++;
            } else if ( a < 0 ) {
                negative_numbers++;
            }
            sum += a;
            count++;
        } while (a != 0);

        average = sum/(count - 1);

        System.out.println("Positive numbers: " + positive_numbers);
        System.out.println("Negative numbers: " + negative_numbers);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("End");
    }

}
