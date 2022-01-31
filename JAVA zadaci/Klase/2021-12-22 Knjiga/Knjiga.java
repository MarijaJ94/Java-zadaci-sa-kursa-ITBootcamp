public class Knjiga {
    /*Napisati klasu Knjiga koja ima sledeca polja/atribute:
    nazivKnjige (string),
    autor (Osoba),
    vlasnik (Osoba)
    brojStrana (int),
    godinaIzdanja (int).
    Broj strana i godina izadanje ne mogu biti negativni. Ispisati poruku o gresci ako korisnik pokusa
    da napravi knjigu sa negativnim brojem strana ili godinom izdanja (u konstruktoru, jer se tamo 'pravi' knjiga).

    Takodje ispisati poruku o gresci ako korisnik pokusa da set-uje neku od ove dve vrednosti na negativno.*/
    private String nazivKnjige;
    private Osoba autor;
    private Osoba vlasnik;
    private int brojStrana;
    private int godinaIzdanja;

    public Knjiga(String nazivKnjige1, Osoba autor1, Osoba vlasnik1, int brojStrana1, int godinaIzdanja1) {
        nazivKnjige = nazivKnjige1;
        autor = autor1;
        vlasnik = vlasnik1;
        brojStrana = brojStrana1;
        godinaIzdanja = godinaIzdanja1;
        if (brojStrana1 <= 0) {
            System.out.println("Uneli ste pogresan broj strana!");
        }
        if (godinaIzdanja1 <= 0) {
            System.out.println("Pogresili ste godinu izdanja knjige!");

        }

    }

    public Knjiga(String nazivKnjige1, Osoba autor1, int brojStrana1, int godinaIzdanja1) {
        nazivKnjige = nazivKnjige1;
        autor = autor1;
        brojStrana = brojStrana1;
        godinaIzdanja = godinaIzdanja1;

        if (brojStrana1 <= 0) {
            System.out.println("Uneli ste pogresan broj strana!");
        }
        if (godinaIzdanja1 <= 0) {
            System.out.println("Pogresili ste godinu izdanja knjige!");

        }
    }


    public String getNazivKnjige() {
        return nazivKnjige;
    }

    public void setNazivKnjige(String nazivKnjige) {
        this.nazivKnjige = nazivKnjige;
    }

    public int getBrojStrana() {
        return brojStrana;

    }

    public void setBrojStrana(int brojStrana) {
        this.brojStrana = brojStrana;
        if (brojStrana <= 0) {
            System.out.println("Greska!Broj strana mora biti veci od nule.");
        }
    }

    public int getGodinaIzdanja() {
        return godinaIzdanja;

    }

    public void setGodinaIzdanja(int godinaIzdanja) {
        this.godinaIzdanja = godinaIzdanja;
        if (godinaIzdanja <= 0) {
            System.out.println("Greska! Pogresili ste godinu izdanja.");
        }
    }

    public String getVlasnik() {
        return (vlasnik.getIme() +" "+ vlasnik.getPrezime());
    }

    public void setVlasnik(Osoba vlasnik) {
        this.vlasnik = vlasnik;
    }

    public String getAutor() {
        return (autor.getIme()+" "+autor.getPrezime());
    }

    public void setAutor(Osoba autor) {
        this.autor = autor;
    }

    /*toString koristeci stringBuilder
	format
		Naziv knjige je: <naziv knjige>
		Autor knjige je: <ime i prezime autora ako postoji, 'nepoznato' ako autor nije postavljen (null)>
		Vlasnik knjige je: <ime i prezime vlasnika ako postoji, 'knjiga nema vlasnika' ako vlasnik nije postavljen (null)>
		Broj strana: <broj strana>
		Godina izdanja: <godina izdanja>
	napisati i metodu "velicinaKnjige" koja vraca string
		- "mala knjiga" - ako je broj strana od 0 do 100
		- "srednje velika knjiga" - ako je broj strana od 101 do 300
		- "velika knjiga" - ako je broj strana od 301-600
		- "bas velika knjiga" - ako je broj strana 601 i vise*/

    public String velicinaKnjige() {
        String velicinaKnjige="";

        if (brojStrana > 0 && brojStrana <= 100) {
            velicinaKnjige = "mala knjiga";

        }
        else if (brojStrana >= 101 && brojStrana <= 300) {
            velicinaKnjige = "srednje velika knjiga";
        }
        else if (brojStrana >= 301 && brojStrana <= 600) {
            velicinaKnjige = "velika knjiga";
        }
        else if (brojStrana > 601) {
            velicinaKnjige = "bas velika knjiga";

        }
        return velicinaKnjige;

    }


    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (autor != null) {
            sb.append("Naziv knjige je: ");

            sb.append(getNazivKnjige());
            sb.append("\n");
            sb.append("Autor knjige je: ");
            sb.append(getAutor());
            sb.append("\n");
        }
        else {
            sb.append("Naziv knjige je: ");

            sb.append(getNazivKnjige());
            sb.append("\n");
            sb.append("Autor knjige je: ");
            sb.append("Nepoznato");
            sb.append("\n");
        }


        if (vlasnik != null) {
            sb.append ("Vlasnik knjige je: ");
            sb.append(getVlasnik());

        } else {

            sb.append("Knjiga nema vlasnika.");

        }
        sb.append("\n");
        sb.append("Broj strana je: ");
        sb.append(getBrojStrana());
        sb.append("\n");
        sb.append("Godina izdanja je:");
        sb.append(getGodinaIzdanja());
        sb.append("\n");
        sb.append("Velicina knjige: ");
        sb.append(velicinaKnjige());

        return sb.toString();

    }
}





