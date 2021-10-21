package hu.szalaiszabolcs.blackjack.kartya;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pakli {
    private List<Kartya> kartyaPakli;

    public List<Kartya> getKartyaPakli() {
        return kartyaPakli;
    }

    private void letrehoz() {
        for (Szin szin: Szin.values()){
            for (Figura figura: Figura.values()) {
                kartyaPakli.add(new Kartya(szin, figura));
            }
        }
    }

    public void kever() {
        Collections.shuffle(kartyaPakli);
    }

    public Pakli() {
        this.kartyaPakli = new ArrayList<>();
        letrehoz();
        kever();
    }
}
