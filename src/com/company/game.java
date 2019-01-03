package com.company;
import java.util.*;

public class game
{

    public static void g1(char [] c, char z1, char z2)
    {
        board.firstboard();
        for(int i=0; i<4;i++)
        {
            board.playerMove(c, z1);
            if(board.check(c, z1))
            {
                output.p1wins();
                return;
            }

            board.playerMove2(c, z2);
            if(board.check(c, z2))
            {
                output.p2wins();
                return;
            }
        }
        board.playerMove(c, z1);
        if(board.check(c, z1)) output.p1wins();
        else output.draw();
    }

    public static void g2(char [] c, char z1, char z2)
    {
        board.firstboard();
        for(int i=0; i<4;i++)
        {
            board.playerMove(c, z1);
            if (board.check(c, z1))
            {
                output.p1wins();
                return;
            }
            board.compmove(c,z1,z2);
            if(board.check(c,z2))
            {
                System.out.println("\nComputer wins\n\n");
                return;
            }
        }

        board.playerMove(c, z1);
        if (board.check(c, z1)) output.p1wins();
        else output.draw();
    }

    public static void g3(char [] c, char z1, char z2)
    {
        board.firstboard();
        for(int i=0; i<4;i++)
        {
            board.compmove(c,z1,z2);
            if(board.check(c,z2))
            {
                System.out.println("\nComputer wins\n\n");
                return;
            }
            board.playerMove(c, z1);
            if (board.check(c, z1))
            {
                output.p1wins();
                return;
            }
        }
        board.compmove(c,z1,z2);
        if(board.check(c,z2)) System.out.println("\nComputer wins\n\n");
        else System.out.println("\nDraw\n");
    }

    public static void g4(char [] c, char z1, char z2)
    {
        board.firstboard();
        for(int i=0; i<4;i++)
        {
            board.compmove(c,z1,z2);
            if(board.check(c,z2))
            {
                System.out.println("\nComputer 1 wins\n\n");
                return;
            }
            board.compmove(c, z2, z1);
            if (board.check(c, z1))
            {
                System.out.print("\nComputer 2 wins\n\n");
                return;
            }
        }
        board.compmove(c,z1,z2);
        if(board.check(c,z2)) System.out.println("\nComputer 1 wins\n\n");
        else output.draw();
    }

    public static void g5(char z1, char z2) {
        Scanner kb = new Scanner(System.in);
        output.letters(z1, z2);
        output.change();
        int a = kb.nextInt();
        output.letter2();
        char b = kb.next().charAt(0);
        if (a == 1) z1 = b;
        else if (a == 2) z2 = b;
        output.letters(z1, z2);


    }
}