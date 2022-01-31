import java.util.Scanner;
public class Zadatak27 {
    public static void main(String[] args) {
        /*27. Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz.
        Ispisati svaki drugi element tog niza
        Primer: [1, 2, 3, 4, 5] -> 1 3 5
        27* Napraviti funkciju koja ispisuje svaki drugi element zadatog niza.*/
        Scanner sc=new Scanner (System.in);
        System.out.println("Unesi duzinu niza: ");

        int n =sc.nextInt();
        System.out.println("Unesi elemente: ");

        int[] niz =new int [n];

        for (int i=0;i<niz.length;i++){
            int broj=sc.nextInt();
            niz [i]=broj;

        }
        System.out.println("Svaki drugi je: ");
        svakiDrugi(niz);


    }
    public static void svakiDrugi ( int []niz ) {
        for (int i=0; i<niz.length;i=i+2){
            System.out.println(niz[i]);
        }
    }






}
