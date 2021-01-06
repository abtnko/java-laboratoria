import java.util.ArrayList;
import java.util.Iterator;

public class Promocja implements ListaDanych{

    public ArrayList<Towar> lista = new ArrayList<>();

    @Override
    public String getTytul() {
        return "___________________________________" + "\n" + "Tytul: Wykaz towarow" + "\n" + "___________________________________";
    }

    @Override
    public String getInfoDodatkowe() {
        wyliczRabat();
        return "___________________________________" + "\n" + "Sredni rabat: " + wyliczRabat() + "%" + "\n" + "___________________________________";
    }

    @Override
    public String getListe() {
        String towar = "";
        int i = 1;
        Iterator itr = lista.iterator();
        while (itr.hasNext()) {
            Towar tw = (Towar) itr.next();
            towar += i + " " + tw.getNazwa() + " " + tw.getCenaPodstawowa() + " " + tw.getCenaPromocyjna() + "\n";
            i ++;
        }
        return towar;
    }

    @Override
    public void dodajDoListy(Object object) {
        lista.add((Towar) object);
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
