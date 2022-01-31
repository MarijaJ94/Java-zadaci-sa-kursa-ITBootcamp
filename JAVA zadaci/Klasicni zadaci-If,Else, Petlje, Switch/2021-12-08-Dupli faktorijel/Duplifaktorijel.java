import java.util.Scanner;
public class Duplifaktorijel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*[Dupli faktorijel] Napisati program koji racuna dupli faktorijel unetg broja n.
        Dupli faktorijel broja n je:
        n!! = n * (n-2) * (n-4) * ... * (2 ili 1)*/

        System.out.println("Unesi broj: ");

        long dupliFaktorijel = 1;

        int n = sc.nextInt();

        if (n%2==0)
        for (int i=2;i<=n;i=i+2) {

            dupliFaktorijel=dupliFaktorijel * i;

        }
        else if (n%2!=0) {
            for (int i=1;i<=n;i=i+2) {
                dupliFaktorijel=dupliFaktorijel * i;
            }
        }
        System.out.println(dupliFaktorijel);


    }


    }

