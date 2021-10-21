package hu.szalaiszabolcs.blackjack.kartya;

public class Kartya {
    private Szin szin;
    private Figura figura;

    public Kartya(Szin szin, Figura figura) {
        this.szin = szin;
        this.figura = figura;
    }

    public Szin getSzin() {
        return szin;
    }

    public Figura getFigura() {
        return figura;
    }

    @Override
    public String toString() {
        return this.szin + " " + this.figura;
    }
}
