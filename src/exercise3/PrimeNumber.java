package exercise3;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        boolean is_prime = true;
        int i = 2;
        n = input.nextInt();

        while (i < n) {
            if (n % i == 0) {
                is_prime = false;
                break;
            }
                i++;
        }

        System.out.println("Prime number: " + is_prime);

    }
}
