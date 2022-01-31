public class Automobil {
    /*vozilo  - Napisati klasu Automobil. Automobil ima
1) marku (polje tipa String) koje moze da se dohvati, ali ne i postavi;
2) model (polje tipa String) koje moze da se dohvati ali ne i postavi;
3) serijski broj (neka u ovom zadatku bude polje tipa int) koje moze da se dohvati ali ne i postavi;
Automobil moze da ima
4) vlasnika, i vlasnik moze da se dohvati i postavi u svakom trenutku
 Napisati klasu Voznja iz koje ce program moci da se pokrene. U njoj ce se kreirati najmanje dva automobila.
Iskoristiti (proizvoljan broj puta) sve tipove metoda napisanih u klasi Automobil.*/
    private String marka;
    private String model;
    private int serijskiBroj;
    private String vlasnik;


    Automobil(String marka1,String model1,int serijskiBroj1,String vlasnik1){
        marka=marka1;
        model=model1;
        serijskiBroj=serijskiBroj1;
        vlasnik=vlasnik1;

    }
    public String getMarka(){
        return marka;
    }
    public String getModel(){
        return model;
    }
    public int getSerijskiBroj(){
        return serijskiBroj;
    }

    public String getvlasnik(){
        return vlasnik;
    }
    public void setVlasnik(String vlasnik1){
        vlasnik=vlasnik1;
    }










}
