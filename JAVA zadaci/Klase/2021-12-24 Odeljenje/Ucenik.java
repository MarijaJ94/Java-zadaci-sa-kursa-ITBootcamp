package Domci;

import java.util.ArrayList;

public class Ucenik {
    /*Napisati klasu Ucenik koja ima sledeca polja:
	- String ime
	- String prezime
	- ArrayList ocene

    Napisati 2 konstruktora, jedan koji prima argumente za sva polja, a drugi koji prima ime i prezime,
    a ocene postavlja na praznu listu.
    Napisati gettere i settere za sva polja.
    Napisati toString() metod:
	{ime} i {prezime} ima ocene:
	{ocene}
    Napisati metod proske koji racuna prosek Ucenika.*/

    private String ime;
    private String prezime;

    private  ArrayList<Integer>ocene=new ArrayList<Integer>();

    public Ucenik(String ime1,String prezime1,ArrayList ocene1){
        ime=ime1;
        prezime=prezime1;
        ocene=ocene1;
    }

    public Ucenik(String ime1,String prezime1) {
        ime = ime1;
        prezime = prezime1;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public ArrayList<Integer> getOcene() {
        return ocene;
    }

    public void setOcene(ArrayList<Integer> ocene) {
        this.ocene = ocene;
    }
    public double prosek(){
        double prosek=0;
        double suma=0;
        for (int i=0; i<ocene.size();i++){
            suma=suma+ocene.get(i);


        }
        prosek=suma/ocene.size();


        return prosek;
    }



    /*{ime} i {prezime} ima ocene:
	{ocene}*/

    public String toString(){
        StringBuilder sb =new StringBuilder();
        sb.append(ime);
        sb.append(" ");
        sb.append(prezime);
        sb.append(" ima ocene: \n");
        sb.append(ocene+"\n");


        return sb.toString();




    }



}




