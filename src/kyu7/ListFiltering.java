package kyu7;

import java.util.ArrayList;
import java.util.List;

public class ListFiltering {
    public static List<Object> filterList(final List<Object> list) {
        List<Object> res = new ArrayList<>();
        for(Object obj : list) {
            if (obj instanceof Integer) {
                res.add((Integer) obj);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(filterList(List.of(1,2,5,"asd")));
    }
}
