import java.util.Scanner;
public class PastebinZadatak5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        /*5. Za unet pozitivan ceo broj n, ispisati sve brojeve od i zakljucno sa -14 do i zakljucno sa 2n.*/
        System.out.println("Unesi pozitivan broj");
        int n=sc.nextInt();
        int nn=2*n;
        if (n>0){
            for (int i = -14; i<=2*n; ++i)
                System.out.println(i);
        }


    }
}
