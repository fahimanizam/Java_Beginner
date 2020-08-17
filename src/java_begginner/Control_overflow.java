
package java_begginner;

public class Control_overflow {
    public void logic(){
        //Comparison and boolean
        int x = 1;
        int y = 1;
        System.out.println(x != y);// we cam use x == y, x <= y, x >= y
        //Logical operators
        int temperature = 22;
        boolean isWarm = temperature > 20 && temperature < 30;
        System.out.println(isWarm);
//        
//        boolean hasHighIncome = true;
//        boolean hasGoodCredit = true;
//        boolean hasCriminalRecord = false;
//        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
          int temp = 32;
          if(temp > 30){
              System.out.println("It's a hot day.");
              System.out.println("Drink water!");
          }else if (temp > 20 && temp <= 30){
              System.out.println("It's a beautiful day!");
          }else {
              System.out.println("Cold day!");
          }
          
          //simplifing if statement
          int income = 120_000;
          boolean hasHignEarn = (income > 100_000);
          
          //The Ternary operator
          String className = income > 100_000? "First class":"Economy";
          
          //Switch statement
          int role = 1;
          switch (role) {
              case 1:
                  System.out.println("You are an Admin");
                  break;
              case 2:
                  System.out.println("You are a moderator");
                  break;
              default:
                  System.out.println("You are a guest");
          }
         
          
              
    }
}
