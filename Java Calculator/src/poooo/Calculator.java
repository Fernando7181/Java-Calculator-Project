package poooo;

import java.util.Scanner;
import java.util.HashMap;

public class Calculator {
    public static void main(String[] args) {

        Numbers n = new Numbers();
        boolean continuee = true;


        Scanner read = new Scanner (System.in);
        while(continuee){
            double x = 0;
            double y = 0;
            int calc = 0;

            System.out.println( "Insert the calculation you want to do: "
         +                       " \n1 for add  "
         +                       " \n2 for sub  "
         +                       " \n3 for multiplication  "
         +                       " \n4 for division  "
         +                       " \n0 To exit the programm  "
         );
            calc = read.nextInt();
        
         
            if (calc == 0){
                continuee = false;
                return;
            }



            System.out.println("What is the first Number: ");
            x = read.nextDouble();

            System.out.println("Tell me What's the Second number: ");
            y = read.nextDouble();

            switch (calc) {
                case 1:
                    printcalculator(calc, n.add(x, y), x , y);
                    break;
                case 2:
                    printcalculator(calc, n.sub(x, y), x , y);
                    break;
                case 3:
                    printcalculator(calc, n.multiplication(x, y), x , y);
                    break;
                case 4:
                    printcalculator(calc, n.div(x, y), x , y);
                    break;
            
 
            }
          
            
        }
    
        
     
        read.close();
    } 
    
    static void printcalculator(int calc, double result, double x, double y){
        HashMap<Integer, String> mapOperation = new HashMap<>();

        mapOperation.put(1, " adding");
        mapOperation.put(2, " Subtraction");
        mapOperation.put(3, " Multiplying");
        mapOperation.put(4, " Dividing");

        System.out.println("\n The result is " + x + mapOperation.get(calc) + " for " + y + " It's equal to " + result + "\n " );
    }
    

}
