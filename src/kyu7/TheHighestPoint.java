package kyu7;

import java.util.Arrays;

public class TheHighestPoint {
    public static int[] minMax(int[] arr) {
        int[] arrMinMax = {arr[0],arr[0]};
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arrMinMax[0]) {
                arrMinMax[0] = arr[i];
            }
            if (arr[i] > arrMinMax[1]) {
                arrMinMax[1] = arr[i];
            }
        }
        return arrMinMax;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(minMax(new int[] {-112,-2,5,213,2})));
    }

}
