package com.company;

import java.util.Scanner;

/**
 * Created by bs482 on 12/17/18.
 */
public class board {

    public static int a;

    public static void makeBoard(char b[])
    {
        String a = "";
        for (int j = 0; j < 3; j++)
        {
            for(int k=0; k<3; k++)
            {
                a+=" ";
                a+=b[3*j+k];
                a+=" ";
                if(k==2) break;
                a+="|";
            }
            if(j!=2) a+="\n-----------\n";
        }
        System.out.print(a+"\n\n");
    }

    public static void firstboard()
    {
        System.out.print(" 0 | 1 | 2 \n-----------\n 3 | 4 | 5 \n-----------\n 6 | 7 | 8 \n\n");
    }

    public static void playerMove(char [] c, char z)
    {
        Scanner kb = new Scanner(System.in);

        while(true)
        {
            System.out.println("\nPlayer 1 enter a number");
            a=kb.nextInt();

            if(c[a]==' ')
            {
                c[a]=z;
                board.makeBoard(c);
                break;
            }
            else System.out.println("Enter an open region.");
        }
    }

    public static void playerMove2(char [] c, char z)
    {
        Scanner kb = new Scanner(System.in);

        while(true)
        {
            System.out.println("\nPlayer 2 enter a number");
            a=kb.nextInt();

            if(c[a]==' ')
            {
                c[a]=z;
                board.makeBoard(c);
                break;
            }
            else System.out.println("Enter an open region.");
        }
    }

    public static boolean check (char [] c, char z)
    {
        if (c[0] == z && c[3] == z && c[6] == z
                ||c[1] == z && c[4] == z && c[7] == z
                ||c[2] == z && c[5] == z && c[8] == z
                ||c[0] == z && c[1] == z && c[2] == z
                ||c[3] == z && c[4] == z && c[5] == z
                ||c[6] == z && c[7] == z && c[8] == z
                ||c[0] == z && c[4] == z && c[8] == z
                ||c[2] == z && c[4] == z && c[6] == z)
            return true;
        else return false;
    }



    public static void compmove(char[]c, char z1, char z2)
    {
        int e=board.win(c,z2);
        int d=board.block(c,z1);
        int f=board.trap(c,z1,z2);


        if(e==9)
        {
            if(d==9)
            {
                if(f==9)
                {
                    if(c[4]==' ') c[4]=z2;
                    else if(c[0]==' ') c[0]=z2;
                    else if(c[2]==' ') c[2]=z2;
                    else if(c[6]==' ') c[6]=z2;
                    else if(c[8]==' ') c[8]=z2;
                    else if(c[5]==' ') c[5]=z2;
                    else if(c[1]==' ') c[1]=z2;
                    else if(c[3]==' ') c[3]=z2;
                    else if(c[7]==' ') c[7]=z2;
                    board.makeBoard(c);
                }
                else
                {
                    c[f]=z2;
                    board.makeBoard(c);
                }
            }
            else
            {
                c[d]= z2;
                board.makeBoard(c);
            }
        }
        else
        {
            c[e]=z2;
            board.makeBoard(c);
        }

    }

    public static int block(char[]c, char z1)
    {
        if (((c[1]== z1 && c[2]==z1) || (c[3]==z1 && c[6]==z1) || (c[4]==z1 && c[8]==z1))&& c[0]==' ')      return 0;
        else if (((c[0]== z1 && c[2]==z1) || (c[4]==z1 && c[7]==z1))&& c[1]==' ')                           return 1;
        else if (((c[1]== z1 && c[0]==z1) || (c[5]==z1 && c[8]==z1) || (c[4]==z1 && c[6]==z1))&& c[2]==' ') return 2;
        else if (((c[4]== z1 && c[5]==z1) || (c[0]==z1 && c[6]==z1))&& c[3]==' ')                           return 3;
        else if (((c[0]== z1 && c[8]==z1) || (c[1]==z1 && c[7]==z1) ||
                (c[2]==z1 && c[6]==z1)|| (c[3]==z1 && c[5]==z1))&& c[4]==' ')                               return 4;
        else if (((c[3]== z1 && c[4]==z1) || (c[2]==z1 && c[8]==z1))&& c[5]==' ')                           return 5;
        else if (((c[0]== z1 && c[3]==z1) || (c[2]==z1 && c[4]==z1) || (c[7]==z1 && c[8]==z1))&& c[6]==' ') return 6;
        else if (((c[1]== z1 && c[4]==z1) || (c[6]==z1 && c[8]==z1))&& c[7]==' ')                           return 7;
        else if (((c[2]== z1 && c[5]==z1) || (c[0]==z1 && c[4]==z1) || (c[6]==z1 && c[7]==z1))&& c[8]==' ') return 8;
        else                                                                                                return 9;
    }

    public static int win(char[]c, char z1)
    {
        if (((c[1]== z1 && c[2]==z1) || (c[3]==z1 && c[6]==z1) || (c[4]==z1 && c[8]==z1))&& c[0]==' ')      return 0;
        else if (((c[0]== z1 && c[2]==z1) || (c[4]==z1 && c[7]==z1))&& c[1]==' ')                           return 1;
        else if (((c[1]== z1 && c[0]==z1) || (c[5]==z1 && c[8]==z1) || (c[4]==z1 && c[6]==z1))&& c[2]==' ') return 2;
        else if (((c[4]== z1 && c[5]==z1) || (c[0]==z1 && c[6]==z1))&& c[3]==' ')                           return 3;
        else if (((c[0]== z1 && c[8]==z1) || (c[1]==z1 && c[7]==z1) ||
                (c[2]==z1 && c[6]==z1)|| (c[3]==z1 && c[5]==z1))&& c[4]==' ')                               return 4;
        else if (((c[3]== z1 && c[4]==z1) || (c[2]==z1 && c[8]==z1))&& c[5]==' ')                           return 5;
        else if (((c[0]== z1 && c[3]==z1) || (c[2]==z1 && c[4]==z1) || (c[7]==z1 && c[8]==z1))&& c[6]==' ') return 6;
        else if (((c[1]== z1 && c[4]==z1) || (c[6]==z1 && c[8]==z1))&& c[7]==' ')                           return 7;
        else if (((c[2]== z1 && c[5]==z1) || (c[0]==z1 && c[4]==z1) || (c[6]==z1 && c[7]==z1))&& c[8]==' ') return 8;
        else                                                                                                return 9;
    }

    public static int trap(char[]c, char z1, char z2)
    {
        if (c[0]== z1 && c[8]==z1 && c[4]==z2)
        {
            if(c[1]==' ')return 1;
            if(c[3]==' ')return 3;
            if(c[5]==' ')return 5;
            if(c[7]==' ')return 7;
        }
        if (c[2]== z1 && c[6]==z1 && c[4]==z2)
        {
            if(c[1]==' ')return 1;
            if(c[3]==' ')return 3;
            if(c[5]==' ')return 5;
            if(c[7]==' ')return 7;
        }
        if(c[4]== z2 && c[6]==z1 && c[2]==' ')return 2;
        if(c[4]== z2 && c[2]==z1 && c[6]==' ')return 6;
        if(c[4]== z2 && c[0]==z1 && c[8]==' ')return 8;
        if(c[0]== z2 && c[1]==z1 && c[6]==' ' && c[3]==' ')return 6;
        return 9;
    }

    //public void straight (char[]c,char z1)
    {
        //  if (((c[1]== z1 && c[2]==z1) || (c[3]==z1 && c[6]==z1) || (c[4]==z1 && c[8]==z1))&& c[0]==' ')      return 0;
        //else if (((c[0]== z1 && c[2]==z1) || (c[4]==z1 && c[7]==z1))&& c[1]==' ')                           return 1;
        //else if (((c[1]== z1 && c[0]==z1) || (c[5]==z1 && c[8]==z1) || (c[4]==z1 && c[6]==z1))&& c[2]==' ') return 2;
        //  else if (((c[4]== z1 && c[5]==z1) || (c[0]==z1 && c[6]==z1))&& c[3]==' ')                           return 3;
        // else if (((c[0]== z1 && c[8]==z1) || (c[1]==z1 && c[7]==z1) ||
        //        (c[2]==z1 && c[6]==z1)|| (c[3]==z1 && c[5]==z1))&& c[4]==' ')                               return 4;
        // else if (((c[3]== z1 && c[4]==z1) || (c[2]==z1 && c[8]==z1))&& c[5]==' ')                           return 5;
        // else if (((c[0]== z1 && c[3]==z1) || (c[2]==z1 && c[4]==z1) || (c[7]==z1 && c[8]==z1))&& c[6]==' ') return 6;
        // else if (((c[1]== z1 && c[4]==z1) || (c[6]==z1 && c[8]==z1))&& c[7]==' ')                           return 7;
        // else if (((c[2]== z1 && c[5]==z1) || (c[0]==z1 && c[4]==z1) || (c[6]==z1 && c[7]==z1))&& c[8]==' ') return 8;
        // else                                                                                                return 9;
    }

}
