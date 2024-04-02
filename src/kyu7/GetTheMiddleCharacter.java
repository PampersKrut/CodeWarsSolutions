package kyu7;

public class GetTheMiddleCharacter {
    public static String getMiddle(String word) {
        String[] arr = word.split("");
        String s = "";
        if (word.length() == 1) {
            return  word;
        }
        if (word.length() % 2 == 0) {
            s =  arr[(arr.length / 2) - 1] + arr[arr.length / 2];
        } else if (word.length() % 2 != 0) {
            s = arr[((arr.length - 1) / 2)];
        }

        return s;
    }

    public static void main(String[] args) {
        System.out.println(getMiddle("testing"));
    }
}
