import java.util.Scanner;
public class Sumaintervala2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        /*2.[Suma intervala] Korisnik unosi cele brojeve m i n sa konzole, m <= n.
        Ispisati sumu brojeva [m, n]. */

        System.out.println("Unesi m");
        int m=sc.nextInt();
        System.out.println("Unesi n");
        int n=sc.nextInt();
        int suma=0;
        if  (m<=n) {
            for (int i = m; i <= n; i++) {
                suma = suma + i;
            }
            System.out.println("Suma od " + m + " do " + n + " je:" + suma);
        }
        else {
            System.out.println("Broj m mora biti veci odbroja n");
        }




    }
}
