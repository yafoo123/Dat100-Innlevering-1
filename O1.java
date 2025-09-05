import java.util.Scanner;

public class O1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Skriv inn lønn: ");
        double lonn = in.nextDouble();

        if (lonn <= 217400) {
            double skatt = 0;
            System.out.println("Skatt er " + skatt);
        } else if ((lonn > 217400) && (lonn <= 306050)) {
            double skatt = 0.017;
            skatt = lonn * skatt;
            System.out.println(skatt);
        } else if ((lonn > 306050) && (lonn <= 697150)) {
            double skatt = 0.04;
            skatt = lonn * skatt;
            System.out.println(skatt);
        } else if ((lonn > 697150) && (lonn <= 942400)) {
            double skatt = 0.137;
            skatt = lonn * skatt;
            System.out.println(skatt);
        } else if ((lonn > 942400) && (lonn <= 1410750)) {
            double skatt = 0.167;
            skatt = lonn * skatt;
            System.out.println(skatt);
        } else if (lonn > 1410750) {
            double skatt = 0.177;
            skatt = lonn * skatt;
            System.out.println(skatt);
            in.close();
        }
    }
}
