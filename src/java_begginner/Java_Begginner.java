package java_begginner;
//import java.awt.*;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Arrays;
import java.util.Scanner;
/**
 * @author: Fahima Nizam Nova
 */
public class Java_Begginner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Primitive - for storing simple value. Total 8 types
        byte age = 30;//Byte - 1. range - [-128 - 127] 
        short news = 34;//Byte - 2, tange [-32k - 32k]
        int myAge = 40;//byte - 4, range [-28 - 28]
        long viewsCount = 3_123_456_789L;// Byte - 8, "l" or "L" for defining Long
        float price = 10.99F;//byte - 4, upper case or lower case "f" character for definig float
        double doubleValue = 57896.332211;//byte - 8
        char letter = 'A';//byte - 2 single quote '' for defining single character
        //Stirng name = "Nova";' not any of the primitive type
        boolean isTrue = false;// byte - 1
        

        //Reference - for storing complex value
        Date now = new Date();
        now.getTime();
        System.out.println(now);
        
//        Point point1 = new Point(X:1, Y:2);
//        Point point2 = point1;
//        point1.X = 2;
//        System.out.println(point2);


    String message = new String("Hello world");
    String msg = "    Hifi   " + "!!";
        
        System.out.println(message.endsWith("!!"));
        System.out.println(msg.endsWith("!!"));
        System.out.println(msg.length());
        System.out.println(message.length());
        System.out.println(msg.indexOf("f"));
        System.out.println(msg.replace( "!","*" ));
        System.out.println(msg);//java is immutable
        System.out.println(msg.toLowerCase());
        System.out.println(msg.toUpperCase());
        System.out.println(msg.trim());
        
    String withName = "Hello \"Nova\"";
        System.out.println(withName);
        System.out.println("c:\\Windowa\\....\t........\n........");
        
        
        
        //Arrays in java
        int[] numbersAr = {2,3,5,6,7,1,2,4,2};
        System.out.println(numbersAr.length);
        Arrays.sort(numbersAr);
//        int[] numbersAr = new int[5];
//        numbersAr[0] = 1;
//        numbersAr[1] = 2;
//        numbersAr[10] =34;//It will give a warning as there are not 10 index in this array
        System.out.println(Arrays.toString(numbersAr));
        
        //Two dimentional arrays
//        int[][] numbers = new int[2][3];
//        numbers[0][0] = 1;
        int[][] numbers = {{1,2,4},{3,5,6,3}};
        System.out.println(Arrays.deepToString(numbers));
        
        //constant variable declared in capital letter
        final float PI = 3.14F;
        //Arithmatic expresion
        int result = 10 + 3;//adition
        System.out.println(result);
        int resultSub = 10 - 1;
        System.out.println(resultSub);
        int resultMulti = 10 * 3;
        System.out.println(resultMulti);
        int resultdiv = 10 / 5;
        System.out.println(resultdiv);
        double resultdiv1 = (double)10 / (double)5;//the numbers e have here is called operands
        System.out.println(resultdiv1);
        int x = 1;
//        x++;
        System.out.println(x);
//        int y = x++;//postfix .. so at first y will assign the value of x. so  y = previous value of x. then it will increment x. so the value of x = 2
        int y = ++x;//prefix: first x will be incremented in y. so y = 2, x =  
        System.out.println(y);
        int a = 1;
        a += 2;//Augmented or compound assignment operator
        System.out.println(a);
        int b = 10 + 3 * 2;//multiplication and divition have a higher priority in term of doing math
        /*
        Order of operator: brakets have highest priority (), then * and /, then + and -
        */
        //Implicit or automatical Casting
        //byte -> short -> int -> long -> float -> double
        short w = 1;
        int z = w + 2;
        System.out.println(y);
        
        double g = 1.1;
        double t = g + 2;//2.0
        System.out.println(t);
        
        //explicit casting
        int s = (int)w + 2;
        System.out.println(s);
        int l = (int)g + 2;
        System.out.println(l);
        
        //We can not cast a string to a number
        String num = "1";
        int j = Integer.parseInt(num) + 2;
        System.out.println(j);
        //
        String na = "1.1";
        double k = Double.parseDouble(na) + 2;
        System.out.println(k);
        
        //Mathametical terms
        
        int r = Math.round(1.3F);
        System.out.println(r);
        int re = (int)Math.ceil(2.4F);
        System.out.println(re);
        int fa = (int)Math.floor(2.4F);
        System.out.println(fa);
//        int r = (int)Math.max(1,2);//returning maximum number
//        int r = (int)Math.min(5, 100);//Return minumum num
//        double r = (int)Math.random();
        //formatting numbers
/*NumberFormat current = new NumberFormat; it can not ibe instantiated
because Number format is abstract */
        //Abstract? later.
        //We can not instanse any number in this class
  //So we can use a method that is called factory mathod for creating an object
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String current = currency.format(1245678899966.45F);
        System.out.println(current);
        String percent = NumberFormat.getPercentInstance().format(1.5);
        System.out.println(percent);
        //Taking input
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Age: ");
        int ae = scanner.nextInt();
        System.out.println("You are " + ae +" years old.");
        System.out.println("Name: ");
        String nami = scanner.next();
        System.out.println("Your name is " + nami);
        
        
        //Bank_calculator class
//        Bank_Calculator bank = new Bank_Calculator();
//        bank.calculator();
        
    
    //Control_overflow class
        
//        Control_overflow control = new Control_overflow();
//        control.logic();


//FizzBuzz Program
//FizzBuzz FB = new FizzBuzz();
//FB.fizzbuzz();


//Loops

Loops loop = new Loops();
loop.forloop();

loop.whileloop();

loop.dowhile();

FinalCalculator fc = new FinalCalculator();
fc.finalCalc();
    }
    
}
