
package java_begginner;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 * @author: Fahima Nizam Nova
 */
public class Bank_Calculator {
       public void calculator() {
     final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
      Scanner scanner = new Scanner(System.in);
      System.out.println("Principal: ");
      int principal = scanner.nextInt();
      
        System.out.println("Anual Interest rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        
        System.out.println("Period (Year): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;
        
        double mortgage = principal 
                * (monthlyInterest*Math.pow(1+monthlyInterest,numberOfPayments))
                / (Math.pow((1+monthlyInterest),numberOfPayments) - 1);
    
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
}
}
