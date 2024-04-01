package kyu6;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.join;

public class YourOrderPlease {
    public static String order(String words) {
        if (words.isEmpty()) {
            return "";
        }
        String[] wordss = words.split(" ");
        String[] sortedArr = new String[wordss.length];
        for (String n : wordss) {
            int position = Integer.parseInt(n.replaceAll("\\D", ""));
            sortedArr[position - 1] = n;
        }
        return String.join(" ", sortedArr);
    }

    public static void main(String[] args) {
        System.out.println(order("Thi1s wor2ld i4s min3e"));
    }
}
