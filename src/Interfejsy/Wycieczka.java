package Interfejsy;

import java.util.Iterator;

public class Wycieczka implements ListaDanych {

    public Osoba[] uczestnicy;
    private String[] tresc;

    @Override
    public String getTytul() {
        return "___________________________________" + "\n" + "Tytul: Uczestnicy wycieczki" + "\n" + "___________________________________";
    }

    @Override
    public String getInfoDodatkowe() {
        return "___________________________________" + "\n" + "Suma wplat wszystkich uczestnikow: " + wyliczSumeWplat() + "\n" + "___________________________________";
    }

    @Override
    public String[] getTresc() {
        tresc = new String[uczestnicy.length];
        for(int i=0; i<uczestnicy.length; i++){
            tresc[i] = uczestnicy[i].toString();
        }
        return tresc;
    }

    @Override
    public String getNaglowek() {
        return "Naglowek";
    }

    private double wyliczSumeWplat(){
        double sumaWplat = 0;
        Iterator itr = tresc[i].iterator();
        while (itr.hasNext()) {
            Osoba os = (Osoba) itr.next();
            sumaWplat += os.getKwotaWplaty();
        }
        return sumaWplat;
    }
}
