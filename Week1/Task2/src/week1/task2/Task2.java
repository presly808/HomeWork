package week1.task2;

import java.util.Scanner;

public class Task2
{

    public static void main(String[] args)
    {
        final int SizeOfArray = 3;
        Scanner scanner = new Scanner(System.in);
        int[] ArrayForNumbers = new int[SizeOfArray];
        for (int i = 0; i < ArrayForNumbers.length; i++) {
            System.out.println("Enter number :");
            ArrayForNumbers[i] = scanner.nextInt();
        }

        System.out.println("Max=" + Maximum(ArrayForNumbers) + " Min=" + Minimum(ArrayForNumbers));
    }

    public static int Minimum(int Array[])
    {
        int min = Array[0];
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] < min) {
                min = Array[i];
            }

        }
        return min;
    }

    public static int Maximum(int Array[])
    {
        int max = Array[0];
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] > max) {
                max = Array[i];
            }
        }
        return max;

    }
}
