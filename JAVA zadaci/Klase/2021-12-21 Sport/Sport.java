public class Sport {
    /*sport - Napisati klasu Sportista. Sportista ima
1) ime i prezime (polje tipa String) koje moze da se dohvati, ali ne i postavi
2) sport kojim se bavi (polje tipa String) koje moze da se dohvati ali ne i postavi
3) klub za koji igra (polje tipa String) koje moze da se dohvati. Sportista moze da promeni klub za koji igra.
4) broj koji nosi na dresu ( tipa int) koje moze i da se dohvati i da se postavi.
Napisati glavni program koji kreira tri igraca. U glavnom programu iskoristiti
(proizvoljan broj puta) sve tipove metoda napisanih u klasi Sportista.*/

        private String imeIPrezime;
        private String sport;
        private String klub;
        private int broj;
        //konstruktor

       public Sport (String imeIPrezime1,String sport1,String klub1,int broj1){
           imeIPrezime=imeIPrezime1;
           sport=sport1;
           klub=klub1;
           broj=broj1;
           if (broj<0){
               System.out.println("Broj ne moze biti negativan.");
           }

       }
       public String getImeIPrezime(){
           return imeIPrezime;
       }
       public String getSport(){
           return sport;
       }

       public String getKlub(){
           return klub;
       }

       public void setKlub(String klub1){
           klub=klub1;
       }
       public int getBroj(){
           return broj;
       }

       public void setBroj(int broj1){

           broj=broj1;
       }


        public String toString(){

           StringBuilder sb = new StringBuilder();
           sb.append("Sportista:");
            sb.append("\n");
            sb.append(imeIPrezime);
            sb.append("\n");
            sb.append("Vrsta sporta:");
            sb.append("\n");
            sb.append(sport);
            sb.append("\n");
            sb.append("Igra u klubu:");
            sb.append("\n");
            sb.append(klub);
            sb.append("\n");
            sb.append("Nosi broj:");
            sb.append("\n");
            sb.append(broj);
            sb.append("\n");


            return sb.toString();


    }









}
