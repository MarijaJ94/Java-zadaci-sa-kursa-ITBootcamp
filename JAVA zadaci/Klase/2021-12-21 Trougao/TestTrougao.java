
import java.util.Scanner;
public class TestTrougao {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        System.out.println("Unesi stranicu A: ");
        double stranicaA=sc.nextDouble();

        System.out.println("Unesi stranicu B: ");
        double stranicaB=sc.nextDouble();

        System.out.println("Unesi stranicu C: ");
        double stranicaC=sc.nextDouble();

        Trougao novi=new Trougao(stranicaA,stranicaB,stranicaC);


        System.out.println("Stranica A je: "+novi.getStranicaA());

        System.out.println("Stranica B je: "+novi.getStranicaB());

        System.out.println("Stranica C je: "+novi.getStranicaC());


        System.out.println("Poluobim trougla je: " +novi.poluobim());

        System.out.println("Obim trugla je: "+novi.obim());

        System.out.println("Povrsina trugla je: "+novi.povrsina());





    }

}
