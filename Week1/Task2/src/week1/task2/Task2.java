package week1.task2;

import java.util.Scanner;

public class Task2
{

    public static void main(String[] args)
    {
        final int SizeOfArray = 3;
        int max = 0;
        Scanner scanner = new Scanner(System.in);
        int[] ArrayForNumbers = new int[SizeOfArray];
        for (int i = 0; i < ArrayForNumbers.length; i++) {
            System.out.println("Enter number :");
            ArrayForNumbers[i] = scanner.nextInt();
        }
        int min = ArrayForNumbers[0];
        for (int i = 0; i < ArrayForNumbers.length; i++) {
            if (ArrayForNumbers[i] > max) {
                max = ArrayForNumbers[i];
            }
            if (ArrayForNumbers[i] < min) {
                min = ArrayForNumbers[i];
            }
        }
        System.out.println("Max="+max+" Min="+min);
    }

}
