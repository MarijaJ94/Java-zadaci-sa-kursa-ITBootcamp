import java.util.Scanner;
public class PastebinZadatak9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*9. Za unet ceo broj n, ispisati za svaki od brojeva [1, n] "Fizz" ako je deljiv sa 3,
        "Buzz" ako je deljiv sa 5, "Zazz" ako je deljiv sa 7 i sve ostale varijacije
        ("BuzzZazz" ako je deljiv i sa 5 i sa 7, ...)
        ako je deljiv sa 3,5,7 FizzBuzzZazz 1
        ako je sa 3 i sa 5 FizzBuzz 2
        ako je sa 3 i sa 7 FizzZazz 3
        ako je sa 5 i sa 7 BuzzZazz 4
        ako je sa 3 Fizz 5
        ako je sa 5 Buzz 6
        ako je sa 7 Zazz 7 
        */


        System.out.println("Unesi ceo broj:");
        int n=sc.nextInt();
        if (n<0 || n==0){
            System.out.println("Unesi ceo nenegativan broj");
        }
        for (int i=1;i<=n;i++){
            if (i%3==0 && i%5==0 && i%7==0) {
                System.out.println(i+": FizzBuzzZazz");
            }
            else if  (i%3==0 && i%5==0) {
                System.out.println(i+": FizzBuzz");
            }
            else if (i%3==0 && i%7==0){
                System.out.println(i+": FizzZazz");
            }
            else if (i%5==0 && i%7==0){
                System.out.println(i+": BuzzZazz");
            }
            else if (i%3==0){
                System.out.println(i+ ": Fizz");
            }
            else if (i%5==0){
                System.out.println(i+ ":Buzz");
            }
            else if (i%7==0){
                System.out.println(i+ ":Zazz");
            }
            else {
                System.out.println(i+":");
            }

        }


    }
}
