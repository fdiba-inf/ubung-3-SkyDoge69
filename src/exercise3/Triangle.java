package exercise3;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c;
        String res;
        do {
            a = input.nextDouble();
            b = input.nextDouble();
            c = input.nextDouble();

        } while (a <= 0 || b <= 0 || c <= 0);


        if (a == b && a == c && b == c) {
            res = "equilateral";
        } else if (a == b || b == c || c == a) {
            res = "isosceles";
        } else {
            res = "scalene";
        }

        double p = (a + b + c)/2;
        double area = sqrt(p * (p - a) * (p - b) * (p -c ));
        System.out.println("Area: " + area);
        System.out.println("Triangle: " + res);

    }
}
