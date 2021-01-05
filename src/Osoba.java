public class Osoba {
    String imie;
    String nazwisko;
    long pesel;
    double kwotaWplaty;

    public Osoba(String imie, String nazwisko, long pesel, double kwotaWplaty){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
        this.kwotaWplaty = kwotaWplaty;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public long getPesel() {
        return pesel;
    }

    public double getKwotaWplaty() {
        return kwotaWplaty;
    }

}
