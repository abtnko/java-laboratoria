package Interfejsy;

public class Towar {
    String nazwa;
    double cenaPodstawowa;
    double cenaPromocyjna;

    public String getNazwa() {
        return nazwa;
    }

    public double getCenaPodstawowa() {
        return cenaPodstawowa;
    }

    public double getCenaPromocyjna() {
        return cenaPromocyjna;
    }

    public Towar(String nazwa, double cenaPodstawowa, double cenaPromocyjna){
        this.nazwa = nazwa;
        this.cenaPodstawowa = cenaPodstawowa;
        this.cenaPromocyjna = cenaPromocyjna;
    }

    public String toString(){
        return nazwa + " " + cenaPodstawowa + " " + cenaPromocyjna;
    }
}
