package Practice_17Nov;
import java.util.Scanner;
public class AvgOfNum {
    public static void main(String[] args) {
        System.out.println("Enter the end Number for Avg: 0 - Num ");
        Scanner sc = new Scanner(System.in);
        int end=sc.nextInt();
        int sum=0;
        for(int i=0; i<=end ; i++)
        {
            sum = sum + i;
        }
        float avg = ((float) sum /end);
        System.out.println("Average of Number Between 0 - "+end+" is: "+avg);
    }
}
