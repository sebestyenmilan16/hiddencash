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

        System.out.println("A játékban tippelni kell a koordinátákat.\n" +
                "Elösször az X aztán az Y koordinátát.");

        int palyameret = 0;
        //System.out.println(szint);

        switch (szint) {
            case "Könnyű" :
                palyameret = 8;
                break;
            case "Közepes" :
                palyameret = 20;
                break;
            case "Nehéz" :
                palyameret = 50;
                break;
        }
        //System.out.println(palyameret);

        int kincs_kor_x = (int) (Math.floor(Math.random()*palyameret)+1);
        int kincs_kor_y = (int) (Math.floor(Math.random()*palyameret)+1);

        //System.out.println("x: " + kincs_kor_x + " y: " + kincs_kor_y);

        int tipp_x = 0;
        int tipp_y = 0;
        int tavolsag = 10;

        switch (szint) {
            case "Könnyű" :

                do {
                    System.out.println("\nAdj meg egy koordinátát:");
                    System.out.print("X: ");
                    tipp_x = scan.nextInt();
                    System.out.print("Y: ");
                    tipp_y = scan.nextInt();

                    tavolsag = (Math.abs(kincs_kor_x - tipp_x) + Math.abs(kincs_kor_y - tipp_y));
                    if (tavolsag < 2) {
                        System.out.println("Nagyon meleg");
                    }
                    if (tavolsag > 2 && tavolsag <= 4) {
                        System.out.println("Meleg");
                    }
                    if (tavolsag > 4 && tavolsag <= 6) {
                        System.out.println("Langyos");
                    }
                    if (tavolsag > 6 && tavolsag <= 7) {
                        System.out.println("Hideg");
                    }
                    if (tavolsag > 7) {
                        System.out.println("Jéghideg");
                    }

                    if ( tavolsag == 0 ) {
                        System.out.println("Szuper, Megtaláltad a kincset!");
                    }

                }
                while (tavolsag != 0);

                break;

            case "Közepes" :

                do {
                    System.out.println("\nAdj meg egy koordinátát:");
                    System.out.print("X: ");
                    tipp_x = scan.nextInt();
                    System.out.print("Y: ");
                    tipp_y = scan.nextInt();

                    tavolsag = (Math.abs(kincs_kor_x - tipp_x) + Math.abs(kincs_kor_y - tipp_y));
                    if (tavolsag < 2) {
                        System.out.println("Nagyon meleg");
                    }
                    if (tavolsag > 2 && tavolsag <= 6) {
                        System.out.println("Meleg");
                    }
                    if (tavolsag > 6 && tavolsag <= 11) {
                        System.out.println("Langyos");
                    }
                    if (tavolsag > 11 && tavolsag <= 15) {
                        System.out.println("Hideg");
                    }
                    if (tavolsag > 15) {
                        System.out.println("Jéghideg");
                    }

                    if ( tavolsag == 0 ) {
                        System.out.println("Szuper, Megtaláltad a kincset!");
                    }

                }
                while (tavolsag != 0);

                break;

            case "Nehéz" :

                do {
                    System.out.println("\nAdj meg egy koordinátát:");
                    System.out.print("X: ");
                    tipp_x = scan.nextInt();
                    System.out.print("Y: ");
                    tipp_y = scan.nextInt();

                    tavolsag = (Math.abs(kincs_kor_x - tipp_x) + Math.abs(kincs_kor_y - tipp_y));
                    if (tavolsag < 2) {
                        System.out.println("Nagyon meleg");
                    }
                    if (tavolsag > 2 && tavolsag <= 5) {
                        System.out.println("Meleg");
                    }
                    if (tavolsag > 5 && tavolsag <= 15) {
                        System.out.println("Langyos");
                    }
                    if (tavolsag > 15 && tavolsag <= 25) {
                        System.out.println("Hideg");
                    }
                    if (tavolsag > 25) {
                        System.out.println("Jéghideg");
                    }

                    if ( tavolsag == 0 ) {
                        System.out.println("Szuper, Megtaláltad a kincset!");
                    }

                }
                while (tavolsag != 0);

                break;
        }


    }
}