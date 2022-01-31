import java.sql.SQLOutput;
import java.util.Scanner;
public class PastebinZadatak6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //6. Ispisati proizvod prvih n celih brojeva [1, n].
        int n=sc.nextInt();
        int proizvod=1;
        for(int i=1;i<=n;i++)
             proizvod=proizvod*i;
            System.out.println(proizvod);


    }
}
