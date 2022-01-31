import java.util.Scanner;
public class PastebinZadatak7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //7. Napraviti program koji za unet mesec i dan ispisuje odgovarajuci horoskopski znak.
        System.out.println("Unesite mesec: ");
        int mesec = sc.nextInt();
        switch (mesec) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            default:
                System.out.println("Nesto niste dobro uneli");
        }
        System.out.println("Unesite dan");
        int dan=sc.nextInt();
        if(mesec==3 && dan>=21 && dan<=31 || mesec==4 && dan<=20){
            System.out.println("Vas horoskopski znak je Ovan");
        }
        else if (mesec==4 && dan>=21 && dan<=30 || mesec==5 && dan<=21) {
            System.out.println("Vas horoskopski znak je Bik");
        }
        else if (mesec==5 && dan>=21 && dan<=31 || mesec==6 && dan<=21) {
            System.out.println("Vas horoskopski znak su Blizanci");
        }
        else if (mesec==6 && dan>=22 && dan<=30 || mesec==7 && dan<=22) {
            System.out.println("Vas horoskopski znak je Rak");
        }
        else if (mesec==7 && dan>=23 && dan<=31 || mesec==8 && dan<=23) {
            System.out.println("Vas horoskopski znak je Lav");
        }
        else if (mesec==8 && dan>=24 && dan<=31 || mesec==9 && dan<=23) {
            System.out.println("Vas horoskopski znak je Devica");
        }
        else if (mesec==9 && dan>=24 && dan<=30 || mesec==10 && dan<=23) {
            System.out.println("Vas horoskopski znak je Vaga");
        }
        else if (mesec==10 && dan>=24 && dan<=31 || mesec==11 && dan<=22) {
            System.out.println("Vas horoskopski znak je Skorpija");
        }
        else if (mesec==11 && dan>=23 && dan<=30 || mesec==12 && dan<=21) {
            System.out.println("Vas horoskopski znak je Strelac");
        }
        else if (mesec==12 && dan>=22 && dan<=31 || mesec==1 && dan<=20) {
            System.out.println("Vas horoskopski znak je Jarac");
        }
        else if (mesec==1 && dan>=21 && dan<=31 || mesec==2 && dan<=19) {
            System.out.println("Vas horoskopski znak je Vodolija");
        }
        else if (mesec==2 && dan>=20 && dan<=28 || mesec==3 && dan<=20) {
            System.out.println("Vas horoskopski znak su Ribe");
        }
        else {
            System.out.println("Greska");
        }


    }
}