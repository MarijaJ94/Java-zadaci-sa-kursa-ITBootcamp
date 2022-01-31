import java.util.Scanner;
public class PastebinZadatak30 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


       /* 30. -//-. Izracunati proizvod elemenata tog niza.
                Primer: [2, 4] -> 8
        30* Napisati funkciju koja racuna proizvod elemenata zadatog niza.*/

        int niz[]=new int[2];
        System.out.println("Unesi pet brojeva");

        for (int i =0;i<niz.length;i++) {
            niz[i] = sc.nextInt();
        }
            double proizvod=1;
        for (int i =0;i<niz.length;i++)

            proizvod=proizvod*niz[i];
            System.out.println(proizvod);








    }
}
