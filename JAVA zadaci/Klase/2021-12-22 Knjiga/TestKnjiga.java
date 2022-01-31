import java.util.Scanner;
public class TestKnjiga {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*Napisati i test program, gde je potrebno napraviti 2-3 osobe, i 2-3 knjige.
        Ispisati osobe, ispisati knjige. Ispisati koje su velicine knjiga */

        System.out.println("Upisati ime autora knjige: ");
        String imePrveOsobe=sc.next();

        System.out.println("Upisati prezime autora knjige: ");
        String prezimePrveOsobe=sc.next();

        Osoba autor =new Osoba(imePrveOsobe,prezimePrveOsobe);

        System.out.println("Ime vlasnika knjige je: ");
        String imeVlasnik=sc.next();

        System.out.println("Prezime vlasnika knjige je: ");
        String prezimeVlasnik=sc.next();

        Osoba vlasnik=new Osoba(imeVlasnik,prezimeVlasnik);

        System.out.println("Unesite naziv knjige :");
        String nazivKnjige=sc.next();

        System.out.println("Unesite broj stranica knjige: ");
        int brojStranica=sc.nextInt();

        System.out.println("Unesite godinu izdanja knjige: ");
        int godinaIzdanja=sc.nextInt();

        Knjiga br1=new Knjiga(nazivKnjige,autor,vlasnik,brojStranica,godinaIzdanja);



        System.out.println("Upisati ime drugog autora knjige: ");
         imePrveOsobe=sc.next();

        System.out.println("Upisati prezime drugog autora knjige: ");
         prezimePrveOsobe=sc.next();

        Osoba autor2 =new Osoba(imePrveOsobe,prezimePrveOsobe);

        System.out.println("Ime drugog vlasnika knjige je: ");
        imeVlasnik=sc.next();

        System.out.println("Prezime drugog vlasnika knjige je: ");
         prezimeVlasnik=sc.next();

        Osoba vlasnik2=new Osoba(imeVlasnik,prezimeVlasnik);

        System.out.println("Unesite naziv druge knjige :");
         nazivKnjige=sc.next();

        System.out.println("Unesite broj stranica druge knjige: ");
         brojStranica=sc.nextInt();

        System.out.println("Unesite godinu izdanja druge knjige: ");
         godinaIzdanja=sc.nextInt();

        Knjiga br2= new Knjiga(nazivKnjige,autor,brojStranica,godinaIzdanja);

        String ispis;
        ispis=br1.toString();
        System.out.println(ispis);
        ispis=br2.toString();
        System.out.println(ispis);



















    }
}
