package Practice_17Nov;
import java.util.Scanner;
//Create a guessing game where the user has to guess a value that was randomly generated by the program. If the user guessing incorrectly show them a hint to state if they guessed too high or too low.
public class Guessing_game {
    public static void main(String[] args) {
        int Sys_NUM=(int) Math.ceil((Math.random() * 10));
        int num;
        do {
            System.out.println("Guess any Number between 1 to 10 ");
            Scanner sc = new Scanner(System.in);
            num = sc.nextInt();
            if (num < Sys_NUM) {
                if(num==Sys_NUM) {
                    break;
                }
                else
                {
                    System.out.println("Too Low!");
                }
            }
            else {
                if(num==Sys_NUM) {
                    break;
                }
                else
                {
                    System.out.println("Too High!");
                }
            }
        }
        while(num!=Sys_NUM);
        System.out.println("You got it Bro!");
    }
}
