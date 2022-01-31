
import java.util.Scanner;
public class Voznja {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        System.out.println("Unesi marku automobila: ");
        String marka=sc.next();

        System.out.println("Unesi model automobila: ");
        String model=sc.next();

        System.out.println("Unesi serijski broj automobila: ");
        int serijskiBroj=sc.nextInt();

        System.out.println("Ko je vlasnik automobila: ");
        String vlasnik=sc.next()+" "+sc.next();

        Automobil aut=new Automobil(marka,model,serijskiBroj,vlasnik);

        System.out.println("Marka automobila je: "+aut.getMarka());
        System.out.println("Model automobila je: "+aut.getModel());
        System.out.println("Serijski broj automobila je: "+aut.getSerijskiBroj());
        System.out.println("Vlasnik automobila je: "+aut.getvlasnik());
        System.out.println("Unesi novog vlasnika automobila: ");

        aut.setVlasnik(sc.next()+" "+sc.next()) ;

        System.out.println("Novi vlasnik automobila je: "+aut.getvlasnik());
        //Novi automobil

        System.out.println("Unesi marku automobila: ");
        marka=sc.next();

        System.out.println("Unesi model automobila: ");
        model=sc.next();

        System.out.println("Unesi serijski broj automobila: ");
        serijskiBroj=sc.nextInt();

        System.out.println("Ko je vlasnik automobila: ");
        vlasnik=sc.next()+" "+sc.next();




        Automobil novi=new Automobil(marka,model,serijskiBroj,vlasnik);


        System.out.println("Marka automobila je: "+novi.getMarka());
        System.out.println("Model automobila je: "+novi.getModel());
        System.out.println("Serijski broj automobila je: "+novi.getSerijskiBroj());
        System.out.println("Vlasnik automobila je: "+novi.getvlasnik());
        System.out.println("Unesi novog vlasnika automobila: ");

        novi.setVlasnik(sc.next()+" "+sc.next());
        System.out.println("Novi vlasnik automobila je: "+novi.getvlasnik());
        //sc.next()






    }
}
