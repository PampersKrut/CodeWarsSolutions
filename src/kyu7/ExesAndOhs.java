package kyu7;

import java.util.Arrays;

public class ExesAndOhs {
    public static boolean getXO (String str) {
        String[] arr = str.toLowerCase().split("");
        int counterX = 0;
        int counterO = 0;
        System.out.println(Arrays.toString(arr));

        for (String simbol : arr) {
            if (simbol.equals("x")) {
                counterX++;
            }
            if (simbol.equals("o")) {
                counterO++;
            }
        }

        if (counterX != counterO){
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        System.out.println(getXO("xxOxoOOxX"));
    }
}
