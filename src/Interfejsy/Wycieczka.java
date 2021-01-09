package Interfejsy;

public class Wycieczka implements ListaDanych {

    String[] tresc;

    @Override
    public String getTytul() {
        return "Wykaz uczestnikow";
    }

    @Override
    public String getInfoDodatkowe(Object[] objects) {
        return "Suma wplat: " + wyliczSumeWplat(objects);
    }

    @Override
    public String[] getTresc(Object[] objects) {
        tresc = new String[objects.length];
        for(int i=0; i<objects.length; i++){
            tresc[i] = objects[i].toString();
        }
        return tresc;
    }

    @Override
    public String getNaglowek() {
        return "Uczestnicy";
    }

    private String wyliczSumeWplat(Object[] objects){
        double sumaWplat = 0;
        for(Osoba osoba:(Osoba[]) objects){
            sumaWplat += osoba.getKwotaWplaty();
        }
        return "" + sumaWplat + "";
    }
}
