import java.util.Scanner;

public class Sedm {
    public static void main(String[] args) {

        System.out.println("Zadej cislo kamo pls");

        Scanner in = new Scanner(System.in);

        int x = in.nextInt();

        if (x % 7 == 0) {
            System.out.println("Je delitelne sedmi");
        } else {
            System.out.println("Neni delitelny sory");
        }

        int i = 0;
        int cislo = 0;
        
        String Prvocisla = "";

        for (i = 1; i <= 100; i++) {
            int myskavec = 0;
            for (cislo = i; cislo >= 1; cislo--) {
                if (i % cislo == 0) {
                    myskavec = myskavec + 1;
                }
            }
            if (myskavec == 2) {
                Prvocisla = Prvocisla + i + " ";
            }
        }
        System.out.println("Prvocisla od 1 do 100 jsou: ");
        System.out.println(Prvocisla);
    }
}