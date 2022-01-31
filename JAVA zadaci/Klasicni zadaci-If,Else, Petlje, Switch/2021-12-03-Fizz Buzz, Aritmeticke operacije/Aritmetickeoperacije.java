import java.util.Scanner;
public class Aritmetickeoperacije {
    public static void main(String[] args) {

        /* 1. Aritmeticke opracije
         Na standardni ulaz se unose dva cela broja. Ispisati na
         standardnom izlazu u zasebnim redovima zbir, razliku, proizvod,
         kolicnik i ostatak deljenja prvog broja drugim
         tim redom.*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi prvi ceo broj: ");

        int broj1 = sc.nextInt();

        System.out.println("Unesi drugi ceo broj: ");

        int broj2 = sc.nextInt();

        int zbir = broj1 + broj2;
        int razlika = broj1 - broj2;
        int proizvod = broj1 * broj2;


        System.out.println(zbir);
        System.out.println(razlika);
        System.out.println(proizvod);


        if (broj2 < 0 || broj2 > 0) {
            long kolicnik = broj1 / broj2;
            System.out.println(kolicnik);

        } else {
            System.out.println("Ne moze da se deli sa nulom.");
        }
        if (broj2 < 0 || broj2 > 0) {
            long ostatakDeljenja = broj1 % broj2;
            System.out.println(ostatakDeljenja);
        } else {
            System.out.println("Ne moze da se deli sa nulom.");


        }


    }
}

