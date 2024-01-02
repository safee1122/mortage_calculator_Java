package MainPackage;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final byte MONTHS = 12;
        final byte PERCENT = 100;
        int Principal = 0;
        float AIR = 0;
        byte year = 0;
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Principal $1k - $1M: ");
            Principal = scan.nextInt();
            if ((Principal < 1000 || Principal > 1000000)) {
                System.out.println("Enter a value between $1k - $1M");
                continue;
            }
            break;
        }
        while (true) {
            System.out.print("Annual Interest Rate : ");
            AIR = scan.nextInt();
            if (AIR > 30.0 || AIR <= 1.0) {
                System.out.println("Enter a value between 1 - 30");
                continue;
            }
            break;
        }
        while (true) {
            System.out.print("Period (Year) : ");
            year = scan.nextByte();
            if (year > 30 || year < 1) {
                System.out.println("Enter a value between 1 - 30");
                continue;
            }
            break;
        }
        float MIR = AIR/PERCENT/MONTHS;
        int numberOfPayments = year*MONTHS;
        double result = Principal * (MIR * Math.pow(1+MIR,numberOfPayments)/ (Math.pow(1+MIR,numberOfPayments)-1));
        System.out.print("Mortage: " + NumberFormat.getCurrencyInstance().format(result));
    }
}