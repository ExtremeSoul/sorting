package pl.sdacademy.rozkocha.szymon.sorting;

import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class InsertionSort {
    public static List<Integer> sort (Collection<Integer> collection, Comparator<Integer> comparator) {
        List<Integer> in = new LinkedList<>(collection);

        List<Integer> result = new LinkedList<>();

        while (!in.isEmpty()) {
            Integer value = in.remove(0);

            boolean end = true;
            for (int i = result.size() - 1 ; i >= 0 ; --i) {
                //comparator to nazwa i zawiera metode compare
                if (comparator.compare(value, result.get(i)) > 1) { //przyjmujemy dwie wartosci, pierwsza wieksza, druga mniejsza i jesli pierwsza jest wieksza to 1, jesli nie to -1, a jesli sa rowne to 0
                    result.add(i + 1,value);
                    end = false;
                    break;
                }
                if (end) {
                    result.add(0, value);
                }
            }
        }
        return result;
    }
}
