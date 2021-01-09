package Interfejsy;

public class Main {
    public static void main(String[] args) {
        Osoba[] osoby = new Osoba[3];
        osoby[0] = new Osoba("Anna", "Kowalska", 353523354, 54);
        osoby[1] = new Osoba("Jan", "Kowalski", 636436346, 100);
        osoby[2] = new Osoba("Piotr", "Jablonski", 543345345, 352);

        ListaDanych ldW = new Wycieczka();
        Wykaz wycieczka = new Wykaz(ldW);
        wycieczka.wyswietlWykaz(osoby);

        Towar[] towary = new Towar[3];
        towary[0] = new Towar("Towar 1", 100, 90.99);
        towary[1] = new Towar("Towar 2", 250, 239.90);
        towary[2] = new Towar("Towar 3", 55.50, 49.80);

        ListaDanych ldP = new Promocja();
        Wykaz promocja = new Wykaz(ldP);
        promocja.wyswietlWykaz(towary);

    }
}
