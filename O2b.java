import java.util.Scanner;

public class O2b {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        for(int i = 1; i <= 10; i++) {
            System.out.print("Skriv inn poengsum " + i + ": ");
            int poeng = in.nextInt();

            if ((poeng >= 0) && (poeng <= 39)) {
                System.out.println("Karakter F");
            } else if ((poeng > 39) && (poeng <= 49)) {
                System.out.println("Karakter E");
            } else if ((poeng > 49) && (poeng <= 59)) {
                System.out.println("Karakter D");
            } else if ((poeng > 59) && (poeng <= 79)) {
                System.out.println("Karakter C");
            } else if ((poeng > 79) && (poeng <= 89)) {
                System.out.println("Karakter B");
            } else if ((poeng > 89) && (poeng <= 100)) {
                System.out.println("Karakter A");
            } else {
                System.out.println("Ugylig poengsum");
            }
        }
        in.close();
    }
}
