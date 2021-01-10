package Interfejsy;

public class Promocja implements ListaDanych{

    Towar[] towary;

    public Promocja(Towar[] towary){
        this.towary = towary;
    }

    @Override
    public String getTytul() {
        return "Wykaz towarow";
    }

    @Override
    public String getInfoDodatkowe() {
        return "Sredni rabat: " + wyliczRabat() + "%";
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
        return "Towar";
    }

    private double wyliczRabat(){
        double sumaCenPodstawowych = 0;
        double sumaCenPromocyjnych = 0;
        for (Towar towar: towary){
            sumaCenPodstawowych += towar.getCenaPodstawowa();
            sumaCenPromocyjnych += towar.getCenaPromocyjna();
        }
        return Math.round(100*(sumaCenPromocyjnych - sumaCenPodstawowych)/sumaCenPodstawowych);
    }
}
