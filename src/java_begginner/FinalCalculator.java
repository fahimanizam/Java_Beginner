
package java_begginner;
import java.text.NumberFormat;
import java.util.Scanner;

public class FinalCalculator {
    public void finalCalc(){
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
      Scanner scanner = new Scanner(System.in);
      int principal = 0;
      float monthlyInterest = 0;
      int numberOfPayments = 0;
      while(true){
      System.out.println("Principal: ");
      principal = scanner.nextInt();
      if (principal >= 1000 && principal <= 1_000_000)
          break;
      System.out.println("Enter a value between 1k and 1000k");
      }
      
      while(true){
      System.out.println("Anual Interest rate: ");
      float annualInterest = scanner.nextFloat();
      if(annualInterest >= 1 && annualInterest <=30){
         monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
         break;
      }
          System.out.println("Enter a value between 1 to 30");
      }  
      
      while(true){
        System.out.println("Period (Year): ");
        byte years = scanner.nextByte();
        if(years >= 1 && years <= 30){
            numberOfPayments = years * MONTHS_IN_YEAR;
            break;
        }
        System.out.println("Enter a value between 1 to 30");
     
      }
        double mortgage = principal 
                * (monthlyInterest*Math.pow(1+monthlyInterest,numberOfPayments))
                / (Math.pow((1+monthlyInterest),numberOfPayments) - 1);
    
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}
