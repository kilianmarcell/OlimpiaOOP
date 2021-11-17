package hu.petrik.olimpiaoop;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Feladatok {

    private HashMap<String, ArrayList<Versenyzo>> adatok;

    public Feladatok() {

        this.adatok = new HashMap<>();
        Beolvasas();
        kiir();
        hanySportAg();
        hanyVersenyzo();

    }

    private void Beolvasas() {

        try {

            BufferedReader b = new BufferedReader(new FileReader("eredmenyek.txt"));
            String sor = b.readLine();
            while (sor != null) {

                String[] st = sor.split(" ");
                String sportag = st[0];
                String ido = st[1];
                String nev = st[2] + " " + st[3];
                Versenyzo v = new Versenyzo(nev, ido);

                adatok.putIfAbsent(sportag, new ArrayList<>());
                adatok.get(sportag).add(v);

                sor = b.readLine();

            }

        } catch (Exception e) {

            e.getMessage();

        }

    }

    private void kiir() {

        for (Map.Entry<String, ArrayList<Versenyzo>> entry : adatok.entrySet() ) {

            System.out.println(entry.getKey() + ": ");

            for (Versenyzo e : entry.getValue()) {

                System.out.println("\t" + e);

            }

            System.out.println();

        }

    }

    private void hanySportAg() {

        System.out.println("A sportágak száma: " + adatok.size());

    }

    private void hanyVersenyzo() {

        HashSet<String> nevek = new HashSet<>();
        for (Map.Entry<String, ArrayList<Versenyzo>> e : adatok.entrySet()) {

            for (Versenyzo i : e.getValue()) {

                nevek.add(i.getNev());

            }

        }

        System.out.println("Versenyzők száma: ");

        for (String i : nevek) {

            System.out.println(i);

        }

    }

    private void IdoszeintiRendezes() {

        for (Map.Entry<String, ArrayList<Versenyzo>> entry : adatok.entrySet() ) {

            entry.getValue().sort(new IdoSzerintiComparator());

        }

    }

    private void legtobbGyoztes() {

        HashMap<String, Integer> gyoztes = new HashMap<>();

        for (Map.Entry<String, ArrayList<Versenyzo>> entry : adatok.entrySet() ) {

            String nev = entry.getValue().get(0).getNev();
            gyoztes.putIfAbsent(nev, 0);
            gyoztes.put(nev, gyoztes.get(nev) + 1);

        }

    }

}
