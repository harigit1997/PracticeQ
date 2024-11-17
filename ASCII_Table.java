package Practice_17Nov;
//Write a program that prints the characters in the ASCII character table
//from ! to ~. Display ten characters per line. Characters are separated by exactly one space.
public class ASCII_Table {
    public static void main(String[] args) {
        System.out.println("ASCII table of");
        int count=0;
        for(char ch='!'; ch<='~'; ch++)
        {
            count++;
            System.out.print(ch+" ");
            if(count==10)
            {
                System.out.println();
                count=0;
            }
        }
    }
}
