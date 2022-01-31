import java.util.Scanner;
public class ProsecnaVrednostNiza {
    public static Scanner sc=new Scanner (System.in);
    /*41. Napisati funkciju koja racuna prosecnu vrednost double[] niza.*/
    public static void main(String[] args) {
        System.out.println("Unesi duzinu niza: ");
        int n=sc.nextInt();
        System.out.println("Unesi elemente niza: ");
        double [] niz=new double[n];
        for (int i=0; i<niz.length;i++){
            double br=sc.nextDouble();
            niz[i]=br;
        }

        for (int i=0; i<niz.length;i++){
            System.out.println("Elementi niza su:" +niz[i]);
        }


        prosek(niz);
        System.out.println("Prosecna vrednost niza je:" + prosek(niz));


    }
    public static double prosek(double []niz){
        double suma=0;
        int duz=niz.length;
        double pr;

        for (int i=0;i<niz.length;i++){
            suma=suma+niz[i];
        }
        pr=suma/duz;
        return (pr);
    }


}
