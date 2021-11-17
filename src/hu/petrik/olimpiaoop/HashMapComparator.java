package hu.petrik.olimpiaoop;

import java.util.Comparator;
import java.util.Map;

public class HashMapComparator implements Comparator<Map.Entry<String, Integer>> {
    @Override
    public int compare(Map.Entry<String, Integer> c1, Map.Entry<String, Integer> c2) {

        return c2.getValue() - c1.getValue();

    }
}
