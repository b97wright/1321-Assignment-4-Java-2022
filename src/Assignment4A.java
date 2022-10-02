import java.util.Scanner;
import java.util.*;

public class Assignment4A {
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);
        String in;
        int italy = 0, costa = 0, pax = 0, ghana = 0, count = 0;
        boolean isPlaying = true;

        System.out.println("[CCSE Study Abroad Survey]");
        while(isPlaying)
        {   
            count++;
            System.out.println("Student # " + count + " : Which country should we go to for our next study abroad program?");
            System.out.println("Italy");
            System.out.println("Costa Rica");
            System.out.println("Pax Bisonica");
            System.out.println("Ghana");
            System.out.println("(Type Quit to end the survey)");
            in = myObj.nextLine();
            in = in.toLowerCase();

            switch(in)
            {
                case "italy":
                {
                    System.out.println("Thank you!\n");
                    italy++;
                    break;
                }
                case "costa rica":
                {
                    System.out.println("Thank you!\n");
                    costa++;
                    break;
                }
                case "pax bisonica":
                {
                    System.out.println("Thank you!\n");
                    pax++;
                    break;
                }
                case "ghana":
                {
                    System.out.println("Thank you!\n");
                    ghana++;
                    break;
                }
                case "quit":
                {
                    isPlaying = false;
                    break;
                }
            }

        }  
        
        System.out.println("[Results]");
        System.out.println("Italy: " + italy);
        System.out.println("Costa Rica: " + costa);
        System.out.println("Pax Bisonica: " + pax);
        System.out.println("Ghana: " + ghana + "\n");

        if (italy > costa && italy > pax && italy > ghana)
        {
            System.out.println("Next year's study abroad program will take place in Italy");
        }
        else if (costa > pax && costa > ghana)
        {
            System.out.println("Next year's study abroad program will take place in Costa Rica");
        }
        else if (pax > ghana)
        {
            System.out.println("Next year's study abroad program will take place in Pax Bisonica");
        }
        else
        {
            System.out.println("Next year's study abroad program will take place in Ghana");
        }


    }
}
