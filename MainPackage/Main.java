package MainPackage;

import java.text.NumberFormat;
import java.util.Date;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        final byte MONTHS = 12;
        final byte PERCENT =100;
        Scanner scan= new Scanner(System.in);

        System.out.print("Principal: ");
        int P = scan.nextInt();

        System.out.print("Annual Interest Rate : ");
        float AIR=  scan.nextFloat();
        float MIR = AIR/PERCENT/MONTHS;

        System.out.print("Period (Year) : ");
        byte year =  scan.nextByte();
        int numberOfPayments = year*MONTHS;

        double result = P * (MIR * Math.pow(1+MIR,numberOfPayments)/ (Math.pow(1+MIR,numberOfPayments)-1));

        System.out.print("Mortage: " + NumberFormat.getCurrencyInstance().format(result));
    }
}