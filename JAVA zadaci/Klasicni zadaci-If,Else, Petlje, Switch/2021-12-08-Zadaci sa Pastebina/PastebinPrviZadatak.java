import java.util.Scanner;
public class PastebinPrviZadatak {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*1. Za unet broj n, ispisati "Paran" ako je paran, a "Neparan" ako je neparan.*/

         int n=sc.nextInt();
         if (n%2==0){
             System.out.println("Paran");
        }
         else{
             System.out.println("Neparan");
         }
       /* int n=0;
        if (sc.hasNextInt())
            n=sc.nextInt();
        else {
            System.out.println("Unesi ceo broj");
        }
        Probala sam da tako da program ne bi pukao kad god se unese podatak koji nije tipa int.
        Ali negde sam pogresila posto mi je ispisivao i poruku "Unesi ceo broj" ali i poruku "Paran".
        Ostavila sam to kao komentar da vidim da li ste na to mislili u "komentaru" za prosli domaci.*/
    }
}
