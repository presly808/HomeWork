package week1.task1;

import java.util.Scanner;

public class Task1
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter time of call :");
        try {
            byte TimeOfCall = scanner.nextByte();
            if (TimeOfCall < 0 | TimeOfCall > 24) {
                System.out.println("Error not correct time,use only range 0-24");
            }
            else {
                if (TimeOfCall < 8 | TimeOfCall > 21) {
                    System.out.println("Абонент отдыхает!");
                }
                else {
                    System.out.println("Привет!");
                }
            }
        }
        catch (Exception e ) 
        {
            System.out.println("Error not correct time,use only integer range 0-24 ");
        }
        }
    }
