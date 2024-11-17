package Practice_17Nov;
//Write a for loop to display every 3rd number, starting at 10 and ending at 30.
public class Every_Third {
    public static void main(String[] args) {
        int count=0;
        for(int i=10; i<=30; i++)
        {
            count++;
            if(count==3)
            {
                System.out.print(i+" ");
                count=0;
            }
        }
    }
}
