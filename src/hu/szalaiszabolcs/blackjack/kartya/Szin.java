package hu.szalaiszabolcs.blackjack.kartya;

public enum Szin {
    PIKK('♠', "fekete"),
    KOR('♥', "piros"),
    TREFF('♣', "fekete"),
    KARO('♦', "piros");

    private char megjelenitendoKarakter;
    private String kiirasSzine;

    Szin(char megjelenitendoKarakter, String kiirasSzine) {
        this.megjelenitendoKarakter = megjelenitendoKarakter;
        this.kiirasSzine = kiirasSzine;
    }
}
