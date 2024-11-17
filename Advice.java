package Practice_17Nov;

import java.util.Scanner;

//Create an “advice” program. The user asks it a question, then the program will select 1 of 4 random output answers to display.
public class Advice {
    public static void main(String[] args) {
        int flag =0;
        System.out.println("---------Consultancy service...\n");
        String[] advice = { "Definitely, yes!", "Very likely!", "Sorry, it's unlikely.", "Not this time." };
        do {
            System.out.println("Pls ask any Question?");
            Scanner sc = new Scanner(System.in);
            sc.next();
            int Sys_NUM=(int) Math.ceil((Math.random() * (advice.length-1)));
            System.out.println(advice[Sys_NUM]);
            System.out.println("Do you want to ask anything else? (Y/N)");
            String response= sc.next();
            if(response.equals("N"))
            {
                flag=1;
                System.out.println("Come again...Happy to assist you.");
            }
        }
        while(flag!=1);
    }
}
