import java.util.Scanner;

public class O2c {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            int poeng;

            while (true){
                System.out.print("Skriv inn poengsum " + i + ": ");
                poeng = in.nextInt();

                if ((poeng >= 0) && (poeng <= 100)){
                    break;
                }else {
                    System.out.println("Ugyldig poengsum, Skriv inn igjen: ");
                }
            }
            if (poeng <= 39) {
                System.out.println("Karakter F");
            } else if (poeng <= 49) {
                System.out.println("Karakter E");
            } else if (poeng <= 59) {
                System.out.println("Karakter D");
            } else if (poeng <= 79) {
                System.out.println("Karakter C");
            } else if (poeng <= 89) {
                System.out.println("Karakter B");
            } else {
                System.out.println("Karakter A");
            }
        }
    }
}
