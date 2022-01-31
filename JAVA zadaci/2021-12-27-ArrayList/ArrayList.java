public class ArrayList {
    public static void main(String[] args) {
        /*Kreirajte array listu nekog vaseg interesovanje (npr sport)
    -u listu dodajte vase omiljene iteme tog hobija (npr koji su omiljeni sportovi)
    -iz liste dohvatite 3. element liste i ispisite
    -promenite naziv prvog elementa
    -uklonite 5. element
    -ispisite velicinu vase liste
    -pomocu for petlje (i na jedan i na drugi nacin) ispisite sve elemente liste*/

        String sport;
        java.util.ArrayList<String> nizSport= new java.util.ArrayList<String>(); //pravim niz

        //dodajem elemente u niz

        nizSport.add("Kosarka"); //index 0 element niza 1
        nizSport.add("Fudbal");
        nizSport.add("Odbojka"); // ovo je 3 element mog niza koji se nalazi na indexu 2-zato dole pisem 2
        nizSport.add("Tenis");
        nizSport.add("Klizanje");


        System.out.println(nizSport.get(2)); // ispisujem 3 element niza

        nizSport.set(0,"Plivanje"); // menjam naziv prvog elementa moga niza iz "Kosarka" u "Plivanje"


        // nizSport.remove(4); // mogu da uklonim peti element niza na ovaj nacin preko indexa, "Klizanje" je na indexu 4
        nizSport.remove("Klizanje"); // ili da ga uklonim preko "object o:"


        nizSport.size();
        System.out.println(nizSport.size()); // rezultat je 4 - za indekse 0,1,2,3,4

        // for petlja prvi nacin za ispisivanje niza

        for(int i=0;i< nizSport.size();i++) {
            String  elementNaPozicijiI=nizSport.get(i);
            System.out.println(elementNaPozicijiI);
        }

        System.out.println("--------------");

        // for petlja drugi nacin za ispisivanje niza

        for (String s:nizSport){
            System.out.println(s);
        }
    }
}
