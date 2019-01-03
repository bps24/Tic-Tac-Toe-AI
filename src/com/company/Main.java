package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int version;
        while(true)
        {
            output.version();
            version = kb.nextInt();

            char[] b = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
            char a1 = 'X';
            char a2 = 'O';

            if (version == 1) game.g1(b, a1, a2);
            else if (version == 2) game.g2(b, a1, a2);
            else if (version == 3) game.g3(b, a1, a2);
            else if (version == 4) game.g4(b, a1, a2);
            else if (version ==5) game.g5(a1,a2);
            else if (version == 6) break;

        }
    }
}