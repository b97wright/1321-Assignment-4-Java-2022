import java.util.Scanner;
import java.util.*;

public class Assignment4B {
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);
        int choice = 0;
        double num;
        boolean isPlaying = true;

        System.out.println("Welcome!");
        System.out.print("Please input a number: ");
        num = myObj.nextDouble();

        while(isPlaying)
        {
            System.out.println("What would you like to do to this number: ");
            System.out.println("-1- Re-enter the number");
            System.out.println("0- Get the additive inverse of the number");
            System.out.println("1- Get the reciprocal of the number");
            System.out.println("2- Square the number");
            System.out.println("3- Cube the number");
            System.out.println("4- Exit the program");
            choice = myObj.nextInt();

            while(choice < -1 || choice > 4)
            {
                System.out.print("Please enter a valid number between -1 and 4: ");
                choice = myObj.nextInt();
                if (!(choice < -1 || choice > 4))
                {
                    System.out.println(" ");
                }
            }

            switch (choice) {
                case -1:
                {    
                    System.out.print("Please input a number: ");
                    num = myObj.nextInt();
                    break;
                }
                case 0:
                {
                    System.out.println("The additive inverse of " + num + " is " + (num * -1));    
                    break;
                }
                case 1:
                { 
                    System.out.println("The reciprocal of " + num + " is " + (1 / num));       
                    break;
                }
                case 2:
                {    
                    System.out.println("The square of " + num + " is " + (num * num));
                    break;
                }
                case 3:
                {    
                    System.out.println("The cube of " + num + " is " + (num * num * num));
                    break;
                }
                case 4:
                {    
                    isPlaying = false;
                    break;
                }
                default:
                    break;
            }
            System.out.println(" ");

        }
    }
}
