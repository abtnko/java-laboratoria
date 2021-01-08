package Interfejsy;

public class Wykaz {

    ListaDanych _ld;

    public Wykaz(ListaDanych ld){
        _ld = ld;
    }

    public void wyswietlWykaz(){
        System.out.println( "________________________" + "\n" + _ld.getTytul() + "\n" + "________________________");
        System.out.println( "________________________" + "\n" + "L.p. " + _ld.getNaglowek() + "\n" + "________________________");
        String[] tabela = _ld.getTresc();
        for(int i=0; i<tabela.length; i++){
            System.out.println((i+1) + " " + tabela[i]);
        }
        System.out.println(_ld.getInfoDodatkowe());
    }

}




