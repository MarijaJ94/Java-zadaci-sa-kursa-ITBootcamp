import java.util.Scanner;
public class Faktorijel {
    public static void main(String[] args) {
        /*Za uneti pozitivan ceo broj ispisati faktorijel tog broja.
Faktorijel se obelezava sa znakom uzvika "!"
i racuna se kao: n! = n * (n-1) * (n-2) * ... * 2 * 1. Dakle, npr:
5! = 5 * 4 * 3 * 2 * 1 = 120
3! = 3 * 2 * 1 = 6*/
        Scanner sc = new Scanner(System.in);

        int n;
        long faktorijel=1;
        System.out.println("Unesite broj: ");
        n=sc.nextInt();
        if (n<0 || n==0){
            System.out.println("Unesite ceo pozitivan broj");
        }
        else{
            for (int i = 1; i <= n; i++) {
                faktorijel = faktorijel * i;
            }
            System.out.println("Faktorijel unetog broja je: " + faktorijel);
        }









    }
}