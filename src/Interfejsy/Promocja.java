package Interfejsy;

import java.util.ArrayList;
import java.util.Iterator;

public class Promocja implements ListaDanych{

    public ArrayList<Towar> lista = new ArrayList<>();
    public Towar[] towary;

    @Override
    public String getTytul() {
        return "___________________________________" + "\n" + "Tytul: Interfejsy.Wykaz towarow" + "\n" + "___________________________________";
    }

    @Override
    public String getInfoDodatkowe() {
        wyliczRabat();
        return "___________________________________" + "\n" + "Sredni rabat: " + wyliczRabat() + "%" + "\n" + "___________________________________";
    }

    @Override
    public String[] getTresc() {
        String[] tresc = new String[towary.length];
        for(int i=0; i<towary.length; i++){
            tresc[i] = towary[i].toString();
        }
        return tresc;
    }

    @Override
    public String getNaglowek() {
        return "Naglowek";
    }

    private double wyliczRabat(){
        double sumaCenPodstawowych = 0;
        double sumaCenPromocyjnych = 0;
        Iterator itr = lista.iterator();
        while (itr.hasNext()) {
            Towar tw = (Towar) itr.next();
            sumaCenPodstawowych += tw.getCenaPodstawowa();
            sumaCenPromocyjnych += tw.getCenaPromocyjna();
        }
        return Math.round(100*(sumaCenPromocyjnych - sumaCenPodstawowych)/sumaCenPodstawowych);
    }
}
