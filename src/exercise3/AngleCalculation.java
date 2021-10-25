package exercise3;

import java.util.Scanner;

public class AngleCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        double wert;
        String type;

        do {
            wert = input.nextDouble();
            type = input.next();
            double res;
            if (type.equals("d")) {
                res = (wert * Math.PI)/180;
                System.out.println("Angle: " + res + "r");
            } else if (type.equals("r")) {
                res = (wert * 180)/Math.PI;
                System.out.println("Angle: " + res + "d");
            } else {
                break;
            }
        } while (true);



    }
}
