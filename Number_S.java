package Practice_17Nov;
import java.util.Scanner;
public class Number_S {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Start and End");
        int start=sc.nextInt();
        int end= sc.nextInt();
        for(int i=start; i<=end; i++)
        {
            System.out.print(i+" ");
        }
    }
}
