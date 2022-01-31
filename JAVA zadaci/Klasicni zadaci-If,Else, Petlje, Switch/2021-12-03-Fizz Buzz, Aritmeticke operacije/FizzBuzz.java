import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*Za uneti celobrojni nenegativan broj n, ispisati za sve brojeve od 1 do i zakljucno sa n nisku "Fizz"
        ako je on deljiv sa 3, nisku "Buzz" ako je on deljiv sa 5, a nisku
        "FizzBuzz" ako je on deljiv i sa 3 i sa 5.*/


        System.out.println("Unesi ceo broj");
        int broj=sc.nextInt();
        if (broj <0 || broj==0){
            System.out.println("Unesi ceo nenegatian broj");
        }
        System.out.println("Unesi n");

        int n=sc.nextInt();
        if (n<0 || n==0){
            System.out.println("Unesi ceo nenegatian broj");
        }

        for (broj=1;broj<=n;broj++)
            if (broj%3==0 && broj%5==0)
                System.out.println(broj+": FizzBuzz");

        else if (broj%3==0){
            System.out.println(broj+": Fizz");
        }
        else if (broj%5==0){
            System.out.println(broj+": Buzz");
        }
        else {
            System.out.println(broj+":");
        }







    }
}
