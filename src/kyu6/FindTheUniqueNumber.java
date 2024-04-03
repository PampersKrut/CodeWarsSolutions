package kyu6;

import java.util.HashMap;
import java.util.Set;

public class FindTheUniqueNumber {
    public static double findUniq(double arr[]) {
        HashMap<Double, Integer> mapRes = new HashMap<>();
        for (double n : arr) {
            if (mapRes.containsKey(n)) {
                mapRes.put(n, mapRes.get(n) + 1);
            } else {
                mapRes.put(n, 1);
            }
        }
        for (double m : mapRes.keySet()) {
            if (mapRes.get(m) == 1) {
                return m;
            }
        }
        return 0;
    }
}
