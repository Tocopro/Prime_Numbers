package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        int number;
        Scanner num = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        number = num.nextInt();
        boolean check = true;
        for(int i = 2; i <= (number / 2); ++i)
        {
            if (number % i == 0)
            {
                check = false;
                break;
            }
        }
        if (check)
        {
            System.out.println("It is a Prime");
        }
        else
        {
            System.out.println("It is not a Prime Number");
        }


    }
}

