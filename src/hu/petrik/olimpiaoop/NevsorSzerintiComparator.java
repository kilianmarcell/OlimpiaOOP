package hu.petrik.olimpiaoop;

import java.util.Comparator;
import java.util.PrimitiveIterator;

public class NevsorSzerintiComparator implements Comparator<Versenyzo> {
    @Override
    public int compare(Versenyzo v1, Versenyzo v2) {
        return v1.getNev().compareToIgnoreCase(v2.getNev());
    }
}
