import java.util.Scanner;
public class Zadatak31 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        /*31. Napisati funkciju koja racuna proizvod 3 broja.
          Hint kako citati ove zadatke:
         - ... racuna proizvod 3 broja = proseldjuje joj se 3 broja (imace 3 argumenta)
         - funkciju koja racuna = vraca odgovarajuci podatak (nece biti void nego nesto konkretno)*/



        System.out.println(proizvod(2,3,4));

    }
    public static double proizvod (int x, int y, int z){
        double p=1;
        p=x*y*z;
        return p;
    }
}
