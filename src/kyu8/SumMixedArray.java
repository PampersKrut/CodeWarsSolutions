package kyu8;

import java.util.ArrayList;
import java.util.List;

public class SumMixedArray {
    public static int sum(List<?> mixed) {
        int sum = 0;
        for (Object obj : mixed) {
            if(obj instanceof Integer) {
                sum += (Integer) obj;
            } else if (obj instanceof String) {
                sum += Integer.parseInt((String) obj);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(List.of(5,"123",32,"123",5)));
    }
}
