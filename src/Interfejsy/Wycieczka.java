package Interfejsy;

public class Wycieczka implements ListaDanych {

    Osoba[] osoby;

    public Wycieczka(Osoba[] osoby){
        this.osoby = osoby;
    }

    @Override
    public String getTytul() {
        return "Wykaz uczestnikow";
    }

    @Override
    public String getInfoDodatkowe() {
        return "Suma wplat: " + wyliczSumeWplat();
    }

    @Override
    public String[] getTresc() {
        String[] tresc = new String[osoby.length];
        for(int i=0; i<osoby.length; i++){
            tresc[i] = osoby[i].toString();
        }
        return tresc;
    }

    @Override
    public String getNaglowek() {
        return "Uczestnicy";
    }

    private String wyliczSumeWplat(){
        double sumaWplat = 0;
        for(Osoba osoba:osoby){
            sumaWplat += osoba.getKwotaWplaty();
        }
        return "" + sumaWplat + "";
    }
}
