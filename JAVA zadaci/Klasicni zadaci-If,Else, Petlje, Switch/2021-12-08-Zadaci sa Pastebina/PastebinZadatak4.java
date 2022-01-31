import java.util.Scanner;
public class PastebinZadatak4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        /*4. Za unet negativan ceo broj n, ispisati sve brojeve od i zakljucno sa n do i zakljucno sa 0.*/
        System.out.println("Unesi nenegativan broj");
        int n=sc.nextInt();
        if(n>0) {
            System.out.println("Unesi negativan broj");
        }
            else for(int i=n;i<=0;i++)
            System.out.println(i);
        }
    }

