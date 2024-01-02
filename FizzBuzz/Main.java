package FizzBuzz;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        final Scanner scan = new Scanner(System.in);
        System.out.print("number: ");
        int num = scan.nextInt();
       if((num%5==0) && (num%3==0))
           System.out.println("FizzBuzz");
       else if(num%5==0)
           System.out.println("Fizz");
       else if(num%3==0)
           System.out.println("Buzz");
       else
           System.out.println(num);
    }
}
