package Domci;

import java.util.ArrayList;

public class TestOdeljenje {
    public static void main(String[] args) {






        ArrayList<Integer> perineOcene = new ArrayList<Integer>();
        perineOcene.add(5);
        perineOcene.add(3);
        perineOcene.add(1);
        perineOcene.add(2);

        ArrayList<Integer> sonjineOcene = new ArrayList<Integer>();

        sonjineOcene.add(5);
        sonjineOcene.add(2);
        sonjineOcene.add(4);
        sonjineOcene.add(2);

        ArrayList<Integer> tanjineOcene = new ArrayList<Integer>();

        tanjineOcene.add(5);
        tanjineOcene.add(5);
        tanjineOcene.add(5);
        tanjineOcene.add(5);

        ArrayList<Integer> draganoveOcene = new ArrayList<Integer>();

        draganoveOcene.add(5);
        draganoveOcene.add(2);
        draganoveOcene.add(4);
        draganoveOcene.add(1);



        Ucenik prvi  = new Ucenik("Pera", "Peric",perineOcene);


        Ucenik drugi = new Ucenik("Sonja", "Peric",sonjineOcene);

        Ucenik treci = new Ucenik("Tanja", "Ilic",tanjineOcene);

       Ucenik cetvrti = new Ucenik("Dragan", "Jovanovic",draganoveOcene);


        ArrayList<Ucenik> dnevnik1V = new ArrayList<Ucenik>();

        Odeljenje prvo = new Odeljenje("1-V", dnevnik1V);

        dnevnik1V.add(prvi);
        dnevnik1V.add(drugi);

        dnevnik1V.add(treci);
        dnevnik1V.add(cetvrti);

        System.out.println(prvo.toString());

        System.out.println(prvi.getOcene()+prvi.getIme()+prvi.getPrezime()+
                drugi.getIme()+drugi.getPrezime()+drugi.getOcene());
        System.out.println(prvo.getDnevnik()+prvo.getOznaka()+prvo.prosecnaOcenaOdeljenja());




    }
}
