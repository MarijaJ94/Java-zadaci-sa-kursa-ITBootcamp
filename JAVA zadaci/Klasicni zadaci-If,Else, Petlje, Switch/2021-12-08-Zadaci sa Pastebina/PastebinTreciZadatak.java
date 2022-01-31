import java.util.Scanner;
public class PastebinTreciZadatak {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        /*3. Za unet pozitivan ceo broj n, ispisati sve brojeve od i zakljucno sa 0 do i zakljucno sa n.*/
        System.out.println("Unesi ceo broj");
        int n=sc.nextInt();
        for(int i=0;i<=n;i++)
        System.out.println(i);
    }
}
