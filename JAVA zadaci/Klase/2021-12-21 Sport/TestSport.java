import java.util.Scanner;
public class TestSport {
    public static void main(String[] args) {
    /*Napisati glavni program koji kreira tri igraca. U glavnom programu iskoristiti
    (proizvoljan broj puta) sve tipove metoda napisanih u klasi Sportista.*/


        Sport igrac1=new Sport("Petar Petrovic","Kosarka","Partizan",-4);
        igrac1.setBroj(5);

        String ispis;
        ispis=igrac1.toString();
        System.out.println(ispis);

        System.out.println(igrac1.getImeIPrezime()+" je imao odlicnu sezonu u "+ igrac1.getKlub()
                +"u, noseci broj "+ igrac1.getBroj()+" osvojio je titulu prvaka u sportu "+ igrac1.getSport());

    igrac1.setBroj(5);
        
        Sport igrac2=new Sport("Sonja Peric","Odbojka","Zvezda",6);
        ispis=igrac2.toString();
        System.out.println(ispis);

        Sport igrac3=new Sport("Milos Peric","Fudbal","Hajduk",1);
        ispis=igrac3.toString();
        System.out.println(ispis);


    }
}
