import java.util.Scanner;

public class Pastebin42Provera {
    public static Scanner sc = new Scanner(System.in);

    /*42. Napisati funkciju koja proverava da li u nizu niski imena postoji "Marija" ili "Petar".
     */
    public static void main(String[] args) {
        System.out.println("Unesi duzinu niza: ");
        int  n = sc.nextInt();
        System.out.println("Unesi imena: ");
        String[] ime = new String[n];



        for (int i = 0; i < ime.length; i++) {
            String x = sc.next();
            ime[i] = x;



        }
        provera (ime);




    }



    public static void provera (String []ime) {

        for (int i=0;i<ime.length;i++){
            if (ime[i].equals("Marija")){
                System.out.println("U nizu postoji Marija");

            }
            else if (ime[i].equals("Petar")){
                System.out.println("U nizu postoji Petar");


            }

        }


    }


}


