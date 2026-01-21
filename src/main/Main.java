package main;

import domain.TV;

public class Main {

    static void main(String[] args) {
        TV tv = new TV();

        tv.ukljuci();
        tv.pojacajTon();
        tv.ispis();
        tv.pojacajTon();
        tv.ispis();
        tv.iskljuci();
        tv.pojacajTon();
        tv.ukljuci();
        tv.ispis();
        tv.mute();
        tv.ispis();
        tv.mute();
        tv.pojacajTonZa(5);
        tv.ispis();
        tv.pojacajTonZa(9);
        tv.ispis();
        tv.pojacajTonZaSkener();
        tv.ispis();
    }
}
