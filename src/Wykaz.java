public class Wykaz {

    public static void main(String[] args) {
        Promocja pr = new Promocja();
        pr.dodajDoListy(new Towar("Towar 1", 192, 99.99));
        pr.dodajDoListy(new Towar("Towar 2", 100, 59.99));
        pr.dodajDoListy(new Towar("Towar 3", 388.90, 355.69));
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




