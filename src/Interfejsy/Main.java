package Interfejsy;

public class Main {
    public static void main(String[] args) {
        Osoba[] osoby = new Osoba[3];
        osoby[1] = new Osoba("Anna", "Kowalska", 353523354, 54);
        osoby[2] = new Osoba("Jan", "Kowalski", 636436346, 100);
        osoby[3] = new Osoba("Piotr", "Jablonski", 543345345, 352);

        ListaDanych ld = new Wycieczka()
        Wykaz wycieczka = new Wykaz() {
        };

        ListaDanych pr = new Promocja();
        pr.dodajDoListy(new Towar("Interfejsy.Towar 1", 192, 99.99));
        pr.dodajDoListy(new Towar("Interfejsy.Towar 2", 100, 59.99));
        pr.dodajDoListy(new Towar("Interfejsy.Towar 3", 388.90, 355.69));
        System.out.println(pr.getTytul());
        System.out.println(pr.getListe());
        System.out.println(pr.getInfoDodatkowe());

        Wycieczka w = new Wycieczka();
        w.dodajDoListy(new Osoba("Anna", "Kowalska", 353523354, 54));
        w.dodajDoListy(new Osoba("Jan", "Kowalski", 636436346, 100));
        w.dodajDoListy(new Osoba("Piotr", "Jablonski", 543345345, 352));
        System.out.println(w.getTytul());
        System.out.println(w.getListe());
        System.out.println(w.getInfoDodatkowe());
    }
}
