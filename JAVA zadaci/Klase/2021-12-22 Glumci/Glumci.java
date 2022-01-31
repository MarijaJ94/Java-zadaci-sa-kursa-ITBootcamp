public class Glumci {
    /*1) Ispisite podatke o nekom glumcu i glumici tako sto cete ime i prezime prikazati kao dve promenljive,
    pol kao karakter, godine kao integer, vasa ocena njih od 1 do 10 (sa decimalom)
    i da li je iz Srbije odgovorite preko booleana.
    Sve potrebno za glumca i glumicu da budu dva ispisa */

    private String ime;
    private String prezime;
    private char pol;
    private int godine;
    private double ocena;
    private String poreklo;

    public Glumci(String ime, String prezime, char pol, int godine, double ocena, String poreklo) {
        this.ime = ime;
        this.prezime = prezime;
        this.pol = pol;
        this.godine = godine;
        this.ocena = ocena;
        if (ocena<1 || ocena>10){
            System.out.println("Ocena moze biti od 1 do 10");

        }
        this.poreklo=poreklo;



        }


    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(ime);
        sb.append("\n");
        sb.append(prezime);
        sb.append("\n");
        sb.append(pol);
        sb.append("\n");
        sb.append(godine);
        sb.append("\n");
        sb.append(ocena);
        sb.append("\n");
        switch (poreklo){
            case "Srbija":
                sb.append(true);
                break;

            default:
            sb.append(false);
            break;

        }

        sb.append("\n");
        return sb.toString();



    }


}
