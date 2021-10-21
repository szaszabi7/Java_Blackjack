package hu.szalaiszabolcs.blackjack.jatek;

import hu.szalaiszabolcs.blackjack.kartya.Figura;
import hu.szalaiszabolcs.blackjack.kartya.Kartya;

import java.util.ArrayList;
import java.util.List;

public class Jatekos {
    private List<Kartya> kezbenTartottLapok;

    private boolean megall;

    public Jatekos() {
        this.kezbenTartottLapok = new ArrayList<>();
        this.megall = false;
    }

    public List<Kartya> getKezbenTartottLapok() {
        return kezbenTartottLapok;
    }

    public boolean isMegall() {
        return megall;
    }

    public void setMegall(boolean megall) {
        this.megall = megall;
    }

    public void huz(Kartya kartya) {
        kezbenTartottLapok.add(kartya);
    }

    public void getErtek() {

    }


    public int lapokErteke() {

        return 0;
    }
}
