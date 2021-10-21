package exercise3;

import java.util.Scanner;

public class AngleCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double wert = input.nextInt();
        String type = input.next();
        double res;

        if (type.equals("d")) {
            res = (wert * Math.PI)/180;
            System.out.println(res + "r");
        } else if (type.equals("r")) {
            res = (wert * 180)/Math.PI;
            System.out.println(res + "d");
        }
    }
}
