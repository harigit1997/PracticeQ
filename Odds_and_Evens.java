package Practice_17Nov;
//Write a for loop that iterates through each number between 1 and 6, and uses a modulus operator along with an if statement to state whether each value is even or odd.
public class Odds_and_Evens {
    public static void main(String[] args) {
        for(int i=1; i<=6; i++)
        {
            if(i%2==0)
            {
                System.out.println(i+ " is : Even");
            }
            else
            {
                System.out.println(i+ " is : Odd");
            }
        }
    }
}
