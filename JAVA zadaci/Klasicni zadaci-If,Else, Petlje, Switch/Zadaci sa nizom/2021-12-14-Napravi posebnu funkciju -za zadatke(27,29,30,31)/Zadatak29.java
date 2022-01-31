import java.util.Scanner;
public class Zadatak29 {
    /*29. -//-. Ispisati svaki treci element u obrnutom redosledu.
    Primer: [1, 2, 3, 4, 5, 6, 7, 8] -> 8 5 2
            29* Napraviti funkciju koja ispisuje svaki treci element niza u obrnutom redosledu.*/

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Unesi duzinu niza: ");
        int n=sc.nextInt();
        System.out.println("Unesi elemente niza: ");
        int [] niz=new int[n];
        for (int i = 0; i<niz.length;i++){
            int broj=sc.nextInt();
            niz[i]=broj;

        }
        System.out.println("Svaki treci element niza u obrnutom redosledu je: ");
        obrnuto(niz);
    }
    public static void obrnuto (int [] niz){
        for (int i=niz.length-1;i>0; i=i-3){
            System.out.println(niz[i]);

        }
    }
}































