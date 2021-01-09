package Interfejsy;

public class Wykaz {

    ListaDanych _ld;

    public Wykaz(ListaDanych ld){
        _ld = ld;
    }

    public void wyswietlWykaz(Object[] objects){
        System.out.println( "________________________" + "\n" + _ld.getTytul());
        System.out.println( "________________________" + "\n" + "L.p. " + _ld.getNaglowek());
        String[] tabela = _ld.getTresc(objects);
        for(int i=0; i<tabela.length; i++){
            System.out.println("________________________" + "\n" + (i+1) + " " + tabela[i]);
        }
        System.out.println("________________________" + "\n" +  _ld.getInfoDodatkowe(objects));
    }

}




