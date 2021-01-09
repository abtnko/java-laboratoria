package Interfejsy;

public class Promocja implements ListaDanych{

    private String[] tresc;

    @Override
    public String getTytul() {
        return "Wykaz towarow";
    }

    @Override
    public String getInfoDodatkowe(Object[] objects) {
        return "Sredni rabat: " + wyliczRabat(objects) + "%";
    }

    @Override
    public String[] getTresc(Object[] lista) {
        tresc = new String[lista.length];
        for(int i=0; i<lista.length; i++){
            tresc[i] = lista[i].toString();
        }
        return tresc;
    }

    @Override
    public String getNaglowek() {
        return "Towar";
    }

    private double wyliczRabat(Object[] objects){
        double sumaCenPodstawowych = 0;
        double sumaCenPromocyjnych = 0;
        for (Towar towar: (Towar[]) objects){
            sumaCenPodstawowych += towar.getCenaPodstawowa();
            sumaCenPromocyjnych += towar.getCenaPromocyjna();
        }
        return Math.round(100*(sumaCenPromocyjnych - sumaCenPodstawowych)/sumaCenPodstawowych);
    }
}
