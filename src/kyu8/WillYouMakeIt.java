package kyu8;

public class WillYouMakeIt {
    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        return distanceToPump / (mpg * fuelLeft) <= 1;
    }

    public static void main(String[] args) {
        System.out.println(zeroFuel(50,25,1));
    }
}
