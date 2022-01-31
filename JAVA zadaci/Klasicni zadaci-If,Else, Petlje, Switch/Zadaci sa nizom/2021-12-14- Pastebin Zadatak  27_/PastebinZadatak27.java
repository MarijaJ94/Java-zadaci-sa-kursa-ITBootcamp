import java.util.Scanner;
public class PastebinZadatak27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*27. Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz.
        Ispisati svaki drugi element tog niza

        Primer: [1, 2, 3, 4, 5] -> 1 3 5*/

        int [] broj=new int[5];
        System.out.println("Unesi pet brojeva");

        for (int i=0;i<broj.length;i++){
            broj[i]=sc.nextInt();
        }
        System.out.println("Svaki drugi element niza je: ");
        for (int i=0;i<broj.length;i=i+2){
            System.out.println(broj[i]);
        }



    }
}
