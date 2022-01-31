import java.util.Scanner;
public class PastebinZadatak8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /*8. Korisnik unosi ime, prezime i godinu rodjena. Ispisati:
	"Dobrodosao u {x}. razred, {ime} {prezime}",
	pod pretpostavkom da je trenutna godina 2021. Pretpostavimo da ima 12 razreda.
	 A ako korisnik nije djak ispisati jednu odgovarajucu
    poruku od:
	"{ime} {prezime} je zavrsio skolu" ili "{ime} {prezime} tek treba da zapocne obrazovanje"*/
        System.out.println("Unesi ime");
        String ime = sc.next();
        System.out.println("Unesi Prezime");
        String prezime = sc.next();
        System.out.println("Unesi godinu rodjenja");
        int godina = sc.nextInt();

        if (godina > 2014 && godina<=2021) {
            System.out.println(ime+" "+ prezime+ " "+ "tek treba da zapocne obrazovanje");
        } else if (godina == 2014) {
            System.out.println("Dobrodosao u prvi razred"+" "+ime+" "+prezime+ "." );
        } else if (godina == 2013) {
            System.out.println("Dobrodosao u drugi razred"+" "+ime+" "+prezime+ "." );
        } else if (godina == 2012) {
            System.out.println("Dobrodosao u treci razred"+" "+ime+" "+prezime+ "." );
        } else if (godina == 2011) {
            System.out.println("Dobrodosao u cetvrti razred"+" "+ime+" "+prezime+ "." );
        }
        else if (godina==2010) {
            System.out.println("Dobrodosao u peti razred"+" "+ime+" "+prezime+ "." );
        }
        else if (godina==2009) {
            System.out.println("Dobrodosao u sesti razred"+" "+ime+" "+prezime+ "." );
        }
        else if (godina==2008) {
            System.out.println("Dobrodosao u sedmi razred"+" "+ime+" "+prezime+ "." );
        }
        else if (godina==2007) {
            System.out.println("Dobrodosao u osmi razred"+" "+ime+" "+prezime+ "." );
        }
        else if (godina==2006) {
            System.out.println("Dobrodosao u deveti razred"+" "+ime+" "+prezime+ "." );
        }
        else if (godina==2005) {
            System.out.println("Dobrodosao u deseti razred"+" "+ime+" "+prezime+ "." );
        }
        else if (godina==2004) {
            System.out.println("Dobrodosao u jedanaesti razred"+" "+ime+" "+prezime+ "." );
        }
        else if (godina==2003) {
            System.out.println("Dobrodosao u dvanaesti razred"+" "+ime+" "+prezime+ "." );
        }
        else if (godina<2003 && godina>1910) {
            System.out.println(ime+" "+ prezime+" " + "je zavrsio skolu.");
        }
        else {
            System.out.println("Greska");
        }
    }
}
