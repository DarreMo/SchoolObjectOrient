package ChuckALuckSpel;

import java.util.Random;

public class Dobbelsteen {

    private int laatsteWaarde = 0;

    public int gooi() {

        Random zeide = new Random();

        int waarde = zeide.nextInt(5);
        this.laatsteWaarde = waarde +1;
        return waarde;
    }

    public int getLaatsteWaarde() {

        return this.laatsteWaarde;
    }
}