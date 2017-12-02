package pl.sdacademy.rozkocha.szymon.sorting;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {
    public static List<Integer> sort(List<Integer> list) {
        List<Integer> result = new ArrayList<>();

        if (list.size() < 2) {
            return result;
        }else if (result.size() == 2) {

            if (result.get(0) > result.get(1)) {
                SortUtils.swap(result,0,1);
            }
            return result;
        }
        int point = result.size() / 2;
        int value = result.get(point);

        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for (int i = 0; i < result.size(); i++) {
            if (i == point)continue;//jak jest jeden parametr, to możemy pominąć wąsy.

            int actual = result.get(i);
            if (actual < value) {
                left.add(actual);
            }else {
                right.add(actual);
            }
        }
        List<Integer> sortedLeft = sort(left);
        List<Integer> sortedRight = sort(right);

        sortedLeft.add(value);
        sortedLeft.addAll(sortedRight);

        return sortedLeft;
    }
}
