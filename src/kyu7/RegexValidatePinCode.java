package kyu7;

public class RegexValidatePinCode {
    public static boolean validatePin(String pin) {
        if ((pin.length() == 4 || pin.length() == 6) && pin.matches("0?\\d+") == true) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(validatePin("-111"));
    }
}
