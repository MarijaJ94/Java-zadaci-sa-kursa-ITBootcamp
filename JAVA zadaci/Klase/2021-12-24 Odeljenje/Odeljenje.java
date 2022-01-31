package Domci;

import java.util.ArrayList;

public class Odeljenje {
    /*Napisati klasu Odeljenje koja ima sledeca polja:
            - String oznaka
	- ArrayList dnevnik

    Napisati 2 konstruktora, opet na isti nacin.
    Napisati gettere i settere za sva polja.

    Napisati metod upisiUcenika(Ucenik u) koja dodaje ucenika {u} u dnevnik.
    Napisati metod upisiUcenika(Ucenik u, int redniBroj) koji dodaje ucenika {u} u dnevnik na redni broj {redniBroj}
    Napisati metod ispisiUcenika(Ucenik u) koja brise ucenika {u} iz dnevnika.
    Napisati metod ispisiUcenika(int i) koja brise ucenika na poziciji {i} u dnevniku.

    Napisati metod pogledajOcene(Ucenik u) koja ispisuje sve ocene ucenika {u}.

    Napisati metod pogledajOcene(int i) koja ispisuje sve ocene ucenika na poziciji {i} u dnevniku.

    Napisati metod prosecnaOcena(Ucenik u) koja ispisuje prosecnu ocenu ucenika {u}.

    Napisati metod prosecnaOcena(int i) koja ispisuje prosecnu ocenu ucenika na poziciji {i} u dnevniku.

    Napisati metod prosecnaOcenaOdeljenja() koja vraca prosecnu ocenu celog odeljenja (0, ako nema ucenika u odeljenju).
    Napisati metod opisnaOcena(Ucenik u) koja ispisuje:
            - "Odlican"; ako je prosek ucenika {u} 4.5 ili vise
	- "Vrlo dobar"; ako je prosek ucenika {u} [3.5, 4.5)
            - "Dobar"; ako je prosek ucenika {u} [2.5, 3.5)
            - "Dovoljan"; ako je prosek ucenika {u} [1.5, 2.5)
            - "Nedovoljan"; ako ucenik {u} ima barem jednu jedinicu

    Napisati metod izlistajDnevnik() koja vraca String oblika:
    {ime} i {prezime} ima ocene:
    {ocene}
    za sve ucenike.

    Napisati metod String velicinaOdeljenja() koja vraca odgovarajucu poruku:
            - "Veliko odeljenje"; ako ima vise od 25 ucenika
	- "Srednje odeljenje"; ako ima ucenika izmedju 15 i 25
            - "Malo odeljenje"; ako ima ucenika manje od 15
    Napisati toString() metod:
    {Oznaka} odeljenja ima djake:
    {Ime1} {Prezime1}
    {Ime2} {Prezime2}
	.
            .
       .
    {ImeN} {PrezimeN}*/

    private String oznaka;
    private ArrayList<Ucenik> dnevnik = new ArrayList<Ucenik>();


    public Odeljenje(String oznaka, ArrayList<Ucenik> dnevnik) {
        this.oznaka = oznaka;
        this.dnevnik = dnevnik;

    }

    public Odeljenje(String oznaka) {
        this.oznaka = oznaka;
    }

    public String getOznaka() {
        return oznaka;
    }

    public void setOznaka(String oznaka) {
        this.oznaka = oznaka;
    }

    public ArrayList<Ucenik> getDnevnik() {
        return dnevnik;
    }

    public void setDnevnik(ArrayList<Ucenik> dnevnik) {
        this.dnevnik = dnevnik;
    }
    /*Napisati metod upisiUcenika(Ucenik u) koja dodaje ucenika {u} u dnevnik.*/

    public void upisiUcenika(Ucenik u) {
        dnevnik.add(u);
    }
    /*Napisati metod upisiUcenika(Ucenik u, int redniBroj) koji dodaje ucenika {u} u dnevnik na redni broj {redniBroj}*/

    public void upisiUcenika(Ucenik u, int redniBroj) {
        dnevnik.add(redniBroj, u);
    }

    /*Napisati metod ispisiUcenika(Ucenik u) koja brise ucenika {u} iz dnevnika.*/
    public void ispisiUcenika(Ucenik u) {
        dnevnik.remove(u);
    }
    /*Napisati metod ispisiUcenika(int i) koja brise ucenika na poziciji {i} u dnevniku.*/

    public void ispisiUcenika(int i) {
        dnevnik.remove(i);
    }
    /*Napisati metod pogledajOcene(Ucenik u) koja ispisuje sve ocene ucenika {u}.*/

    //NIsam sigurna da li ovo radi

    public void pogledajOcene(Ucenik u) {

        StringBuilder sb = new StringBuilder();
        sb.append(u.getOcene());
    }
    //    Napisati metod pogledajOcene(int i) koja ispisuje sve ocene ucenika na poziciji {i} u dnevniku.

    public void pogledajOcene(int i) {


        StringBuilder sb = new StringBuilder();
        sb.append(dnevnik.get(i).getOcene());
    }
    // Napisati metod prosecnaOcena(Ucenik u) koja ispisuje prosecnu ocenu ucenika {u}.

    public void prosecnaOcena(Ucenik u) {
        StringBuilder sb = new StringBuilder();
        sb.append(u.prosek());

    }
    // Napisati metod prosecnaOcena(int i) koja ispisuje prosecnu ocenu ucenika na poziciji {i} u dnevniku.

    public void prosecnaOcena(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(dnevnik.get(i).prosek());
    }

    //   Napisati metod prosecnaOcenaOdeljenja() koja vraca prosecnu ocenu celog odeljenja
    //   (0, ako nema ucenika u odeljenju).
    public double prosecnaOcenaOdeljenja() {
        double suma = 0;
        double prosek = 0;
        for (int i = 0; i < dnevnik.size(); i++) {
            suma = suma + dnevnik.get(i).prosek();


        }
        prosek = suma / dnevnik.size();
        return prosek;
    }

    /*Napisati metod opisnaOcena(Ucenik u) koja ispisuje:
        - "Odlican"; ako je prosek ucenika {u} 4.5 ili vise
- "Vrlo dobar"; ako je prosek ucenika {u} [3.5, 4.5)
        - "Dobar"; ako je prosek ucenika {u} [2.5, 3.5)
        - "Dovoljan"; ako je prosek ucenika {u} [1.5, 2.5)
        - "Nedovoljan"; ako ucenik {u} ima barem jednu jedinicu*/

    public void opisnaOcena(Ucenik u) {
        String opisnaOcena;
        double prosecnaOcena;
        if (u.prosek() >= 4.5) {
            System.out.println("Odlican");
        } else if (u.prosek() >= 3.5 && u.prosek() < 4.5) {
            System.out.println("Vrlo dobar");
        } else if (u.prosek() >= 2.5 && u.prosek() < 3.5) {
            System.out.println("Dobar");
        } else if (u.prosek() >= 1.5 && u.prosek() < 2.5) {
            System.out.println("Dovoljan");
        } else if (proveraJedinice(u) == true) {
            System.out.println("Nedovoljan");
        }


    }

    private boolean proveraJedinice(Ucenik u) {
        for (int i = 0; i < u.getOcene().size(); i++) {
            if (u.getOcene().get(i) == 1) {
                return true;
            }
        }
        return false;


    }
    //Napisati metod izlistajDnevnik() koja vraca String oblika:
    //    {ime} i {prezime} ima ocene:
    //    {ocene}
    //    za sve ucenike.

    public String izlistajDnevnik() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < dnevnik.size(); i++) {
            sb.append(dnevnik.get(i).getIme());
            sb.append(" i ");
            sb.append(dnevnik.get(i).getPrezime());
            sb.append(" ima ocene: ");
            sb.append("\n");
            sb.append(dnevnik.get(i).getOcene());


        }
        return sb.toString();


    }
    /*Napisati metod String velicinaOdeljenja() koja vraca odgovarajucu poruku:
            - "Veliko odeljenje"; ako ima vise od 25 ucenika
	- "Srednje odeljenje"; ako ima ucenika izmedju 15 i 25
            - "Malo odeljenje"; ako ima ucenika manje od 15*/

    public String velicinaOdeljenja(){
        String velicina="";
        if (dnevnik.size()>=25){
            velicina="Veliko odeljenje";
        }
        else if (dnevnik.size()>15 &&dnevnik.size()<25){

            velicina="Srednje odeljenja";
        }
        else if (dnevnik.size()<15){

            velicina="Malo odeljenje";
        }
        return velicina;


    }

    /*Napisati toString() metod:
    {Oznaka} odeljenja ima djake:
    {Ime1} {Prezime1}
    {Ime2} {Prezime2}
	.
            .
       .
    {ImeN} {PrezimeN}*/
    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append(oznaka +" Odeljenje ima djake: "+"\n");
        for (int i=0;i< dnevnik.size();i++){
            sb.append(dnevnik.get(i).getIme()+" "+ dnevnik.get(i).getPrezime()+"\n");

        }
        return sb.toString();
    }



}



