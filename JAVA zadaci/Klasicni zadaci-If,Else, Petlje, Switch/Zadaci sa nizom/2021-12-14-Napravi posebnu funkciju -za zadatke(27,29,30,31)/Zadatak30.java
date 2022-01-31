import java.util.Scanner;
public class Zadatak30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*-//-. Izracunati proizvod elemenata tog niza.
        Primer: [2, 4] -> 8
        30* Napisati funkciju koja racuna proizvod elemenata zadatog niza.*/
        System.out.println("Unesi duzinu niza: ");
        int n=sc.nextInt();
        System.out.println("Unesi elemente niza: ");
        int []niz=new int[n];
        for ( int i=0; i<niz.length;i++){
            int b=sc.nextInt();
            niz [i]=b;
        }
        double p= proizvod(niz);
        System.out.println(p);


    }
    public static double proizvod (int [] nekiNiz){
        int p=1;
        for (int i=0; i<nekiNiz.length;i++){

             p=p*nekiNiz[i];

        }
        return p;


    }

}
