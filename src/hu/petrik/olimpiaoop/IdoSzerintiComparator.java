package hu.petrik.olimpiaoop;

import java.util.Comparator;

public class IdoSzerintiComparator implements Comparator<Versenyzo> {


    @Override
    public int compare(Versenyzo v1, Versenyzo v2) {

        int valasz;

        //if (v1.getMp() > v2.getMp()) {
//
        //    valasz = 1;
//
        //} else if (v1.getMp() < v2.getMp()) {
//
        //    valasz = -1;
//
        //} else {
//
        //    valasz = 0;
//
        //}

        return v1.getMp() - v2.getMp();

    }
}
