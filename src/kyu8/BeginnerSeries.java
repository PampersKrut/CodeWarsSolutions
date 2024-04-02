package kyu8;

public class BeginnerSeries {
    public static int paperWork(int n, int m) {
        return m < 0 || n < 0 ? 0 : n * m;
    }

    public static void main(String[] args) {
        System.out.println(paperWork(2,-1));
    }
}
