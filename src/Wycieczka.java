import java.util.ArrayList;
import java.util.Iterator;

public class Wycieczka implements ListaDanych {

    public ArrayList<Osoba> lista = new ArrayList<>();

    @Override
    public String getTytul() {
        return "___________________________________" + "\n" + "Tytul: Uczestnicy wycieczki" + "\n" + "___________________________________";
    }

    @Override
    public void dodajDoListy(Object object){
        lista.add((Osoba) object);
    }

    @Override
    public String getInfoDodatkowe() {
        return "___________________________________" + "\n" + "Suma wplat wszystkich uczestnikow: " + wyliczSumeWplat() + "\n" + "___________________________________";
    }

    @Override
    public String getListe() {
        String osoba = "";
        int i = 1;
        Iterator itr = lista.iterator();
        while (itr.hasNext()) {
            Osoba os = (Osoba) itr.next();
            osoba += i + " " + os.getImie() + " " + os.getNazwisko() + " " + os.getPesel() + " " + os.getKwotaWplaty() + "\n";
            i ++;
        }
        return osoba;
    }

    private double wyliczSumeWplat(){
        double sumaWplat = 0;
        Iterator itr = lista.iterator();
        while (itr.hasNext()) {
            Osoba os = (Osoba) itr.next();
            sumaWplat += os.getKwotaWplaty();
        }
        return sumaWplat;
    }
}
