package week1.task1;

import java.util.Scanner;

public class Task1
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter time of call :");
        byte TimeOfCall = scanner.nextByte();
        if (TimeOfCall < 8 | TimeOfCall > 21) {
            System.out.println("Абонент отдыхает!");
        }
        else {
            System.out.println("Привет!");
        }
    }

}
