package PatternInJava;

import java.util.Scanner;

public class patternLastOne {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        //Taking rows value from the user

        System.out.println("How many rows you want in this pattern?");

        int rows = sc.nextInt();

        System.out.println("Here is your pattern....!!!");

        for (int i = 1; i <= rows; i++) {
            //Printing first half of the row

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            //Printing second half of the row
            for (int j = i-1; j >= 1; j--)
            {
                System.out.print(j+" ");
            }

            System.out.println();
        }


    }
    }


       /* 1
        1 2 1
        1 2 3 2 1
        1 2 3 4 3 2 1
        1 2 3 4 5 4 3 2 1
        1 2 3 4 5 6 5 4 3 2 1
        1 2 3 4 5 6 7 6 5 4 3 2 1*/