package exercise3;

import java.util.ArrayList;

public class NumberSearch {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 100; i < 1000; i++) {
            if (i % 5 == 0 && i % 6 == 0) {
                list.add(i);
            }
        }

        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (count == 10) {
                System.out.print("\n");
                count = 0;
            }
            System.out.print(list.get(i));
            if (count != 9) {
                System.out.print(" ");
            }
            count++;
        }
    }
}