import java.util.Scanner;

public class O3{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n;
        while (true){
            System.out.print("Skriv inn et heltall: ");
            n = in.nextInt();
            if(n > 0){
                break;
            } else{
                System.out.println("Ugyldig heltall");
            }
        }
        long fakultet = 1;
        for(int i = 1; i <= n; i++){
            fakultet *= i;
        }
        System.out.println(n + "!= " + fakultet);

        in.close();
    }
}