import java.util.Scanner;

public class O1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double trinn1 = 0.017;
        double trinn2 = 0.04;
        double trinn3 = 0.137;
        double trinn4 = 0.167;
        double trinn5 = 0.177;

        System.out.print("Skriv inn lønn: ");
        double lonn = in.nextDouble();

        if (lonn <= 217400) {
            System.out.println("Skatt er 0.00");
        } else if ((lonn > 217400) && (lonn <= 306050)) {
            double skatt = (lonn - 217400) * trinn1;
            System.out.println(skatt);
        } else if ((lonn > 306050) && (lonn <= 697150)) {
            double skatt = (306050 - 217400) * trinn1 +
                    (lonn - 306050) * trinn2;
            System.out.println(skatt);
        } else if ((lonn > 697150) && (lonn <= 942400)) {
            double skatt = (306050 - 217400) * trinn1 +
                    (697150 - 306050) * trinn2 +
                    (lonn - 697150) * trinn3;
            System.out.println(skatt);
        } else if ((lonn > 942400) && (lonn <= 1410750)) {
            double skatt = (306050 - 217400) * trinn1 +
                    (697150 - 306050) * trinn2 +
                    (942400 - 697150) * trinn3 +
                    (lonn - 942400) * trinn4;
            System.out.println(skatt);
        } else if (lonn > 1410750) {
            double skatt = (306050 - 217400) * trinn1 +
                    (697150 - 306050) * trinn2 +
                    (942400 - 697150) * trinn3 +
                    (1410750 - 942400) * trinn4 +
                    (lonn - 1410750) * trinn5;
            System.out.println(skatt);
            in.close();
        }
    }
}

