import java.util.Scanner;
import java.util.*;

public class Assignment4C {
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);
        String sentence;
        int count = 0;

        System.out.println("[Backspace Animation]");
        System.out.println("Please enter your sentence:");
        sentence = myObj.nextLine();
        System.out.println("How many letters do you want to backspace?");
        count = myObj.nextInt();
        count = sentence.length() - count;

        for(int i = sentence.length() - 1; i >= 0; i--)
        {
            sentence = sentence.substring(0, sentence.length() - 1);
            if (count == i)
                break;
        }

        System.out.println(sentence);
    }
}
