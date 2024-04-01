package kyu8;

import java.util.Arrays;

public class CountOfPositives {
    public static int[] countPositivesSumNegatives(int[] input)
    {
        int[] arr = new int[2];
        int count = 0;

        if (input == null || input.length == 0) {
            return new int[0];
        }

        for (int i = 0; i < input.length; i++) {
            if (input[i] > 0) {
                count++;
            } else if (input[i] < 0) {
                arr[1] += input[i];
            }
        }

        arr[0] = count;

        return arr;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countPositivesSumNegatives(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15})));
    }
}
