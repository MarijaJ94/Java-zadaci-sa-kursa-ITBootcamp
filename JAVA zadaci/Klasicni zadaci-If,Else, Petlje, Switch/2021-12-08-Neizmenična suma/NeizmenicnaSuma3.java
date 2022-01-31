import java.util.Scanner;
public class NeizmenicnaSuma3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*3.[Naizmenicna suma] Korisnik unosi vrednost broja n (int) sa konzole.
        Na standardni izlaz ispisati resenje izraza:
        1 - 2 + 3 - .... (+/-) n.*/
        System.out.println("Unesi broj n: ");

        int n = sc.nextInt();
        int suma = 0;
        int suma1=0;
        int suma2=0;
        for (int i = 0; i <= n; i++)
        if (i%2==0){
                suma1=suma1-i;
            }
        else {
            suma2=suma2+i;
        }
        suma=suma1+suma2;
        System.out.println("Neizmenicna suma od " + n + " je: "+ suma);

    }
}