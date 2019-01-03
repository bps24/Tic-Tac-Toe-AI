package com.company;

public class output
{

    public static void version()
    {
        System.out.println("What version would you like to play\n" +
                "Enter 1: Player vs Player\n" +
                "Enter 2: Player vs Computer\n" +
                "Enter 3: Computer vs Player\n" +
                "Enter 4: Computer vs Computer\n" +
                "Enter 5: Change Letters\n" +
                "Enter 6: Exit");
    }

    public static void p1wins()
    {
        System.out.println("\nPlayer 1 wins\n\n");
    }

    public static void p2wins()
    {
        System.out.println("\nPlayer 2 wins\n\n");
    }
    public static void draw()
    {
        System.out.println("\nDraw\n\n");
    }
    public static void letters(char z1, char z2)
    {
        System.out.println("Player 1 Letter: "+z1+"\nPlayer 2 letter: "+z2);
    }
    public static void change()
    {
        System.out.println("Enter 1: Change Player 1 Letter");
        System.out.println("Enter 2: Change Player 2 Letter");
        System.out.println("Enter 3: Return");
    }

    public static void letter2()
    {
        System.out.println("Enter the new letter");
    }


}

