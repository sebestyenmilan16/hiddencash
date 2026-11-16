import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Üdvözöl a Kincskereső játék: ");
        System.out.print("Válassz játékmódot, (Könnyű, Közepes, Nehéz) : ");
        String szint = "";
        //System.out.println(szint);

        do {
            szint = scan.nextLine();
            if (!szint.equals("Könnyű") && !szint.equals("Nehéz") && !szint.equals("Közepes")) {
                System.out.print("Rossz szint választás. Válassz újra: ");
            }
        }
        while ( !szint.equals("Könnyű") && !szint.equals("Nehéz") && !szint.equals("Közepes"));

        switch (szint) {
            case "Könnyű" :

        }


    }
}