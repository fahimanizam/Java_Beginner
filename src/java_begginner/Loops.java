
package java_begginner;

import java.util.Scanner;

public class Loops {
    public void forloop(){
        for (int i = 0; i < 5; i++){
            System.out.println(i + "Hello World");
        }
    }
    
    public void whileloop(){
//        int i = 0;
//        while(i>0){
//            System.out.println("Hello world" + i);//better to use for loop
//            i--;
//        }


Scanner scanner = new Scanner(System.in);
String input = "";
while (!input.equals("quit")){
    System.out.println("Input: ");
    input = scanner.next().toLowerCase();
    System.out.println(input);
}
}
    
    public void dowhile(){
        Scanner scanner = new Scanner(System.in);
        String input = "";
        do{
            System.out.println("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }while(!input.equals("exit"));
    }
    public void breakContintue(){
        Scanner scanner = new Scanner(System.in);
String input = "";
while (true){
    System.out.println("Input: ");
    input = scanner.next().toLowerCase();
    if(input.equals("pass"))
        continue;
    if(input.equals("quit"))
        break;
    System.out.println(input);
}
    }
    
    public void forEachloop(){
        String[] fruits = {"Apple","Mango","Goava"};
        for(int i = 0; i < fruits.length; i++)
            System.out.println(fruits[i]);
        //for loop goes forward. it doesn;t iterate
        for(String fruit: fruits)
            System.out.println(fruit);
    }
}


