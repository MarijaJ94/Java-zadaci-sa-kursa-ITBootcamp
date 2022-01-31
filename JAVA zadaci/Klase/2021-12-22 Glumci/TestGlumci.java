import java.util.Scanner;
public class TestGlumci {
    public static void main(String[] args) {



        //ovo je test glumac bez skenera*/
        Glumci g = new Glumci("Maja", "Kordic", 'z', 52, 5.01, "Nemacka");

        System.out.println(g.toString());
        Glumci gl = new Glumci("Sonja", "Peric", 'z', 42, -2.36, "Srbija");
        System.out.println(gl.toString());




       /* Scanner sc=new Scanner (System.in);
        System.out.println("Unesite ime glumca: ");
        String ime=sc.next();
        System.out.println("Unesite prezime glumca: ");
        String prezime=sc.next();
        System.out.println("Unesite pol glumca m-za muski/z-zenski: ");
        String tmp=sc.next();
        char pol=tmp.charAt(0);
        System.out.println("Unesite godine glumca: ");
        int godine=sc.nextInt();
        System.out.println("Unesite vasu ocenu tog  glumca : ");
        double ocena=sc.nextDouble();

        System.out.println("Unesite zemlju porekla glumca: ");
        String poreklo=sc.next();
        boolean p=true;
        if (poreklo.equals("Srbija")){
            p=true;

        }
        else{
            p=false;
        }
        Glumci glumac=new Glumci (ime,prezime,pol,godine,ocena,p);

        String ispis;
        ispis=glumac.toString();
        System.out.println(ispis);*/





    }
}

