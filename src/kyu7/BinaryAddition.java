package kyu7;

public class BinaryAddition {
    public static String binaryAddition(int a, int b){
        int sum = a + b;
        return Integer.toBinaryString(sum);
    }

    public static void main(String[] args) {
        System.out.println(binaryAddition(2, 3));
    }
}
