
package week1.task3;

import java.util.Scanner;

public class Task3
{


    public static void main(String[] args)
    {
    int Number;
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter number:");
    Number=scanner.nextInt();
    if(Number % 7==0)
    {
        System.out.println(Number*2);
    }
    else
        System.out.println("Remainder of the division is greater than zero");
    }
    
}
