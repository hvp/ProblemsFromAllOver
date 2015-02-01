package HackerRank;

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Created by User on 01/02/2015.
 * <p/>
 * <p/>
 * 3
 * ---
 * -m-
 * p--
 * <p/>
 * m = bot
 * p = princess
 */
public class PrincessBot {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int gridSize = in.nextInt();


        ArrayList<String> grid = new ArrayList<String>();


        int rowIndex = 0;

        while (grid.size() <= gridSize) {
            grid.add(in.nextLine());
        }

        grid.remove(0); // reads a blank line at start TODO: fix

        int playerPos[] = findTarget(grid,'m');
        int princessPos [] = findTarget(grid,'p');


        int deltaRow = 0;
        int deltaCol = 0;

          deltaRow = playerPos[0] - princessPos[0];
          deltaCol = playerPos[1] - princessPos[1];



        if(deltaCol > 0)
        {
            while(deltaCol > 0)
            {
                System.out.println("LEFT");
                deltaCol --;
            }

        }
        else
        {
            while(deltaCol < 0)
            {
                System.out.println("RIGHT");
                deltaCol ++;
            }
        }

        if(deltaRow > 0)
        {
            while (deltaRow > 0)
            {
                System.out.println("UP");
                deltaRow --;
            }


        }
        else
        {
            while (deltaRow < 0)
            {
                System.out.println("DOWN");
                deltaRow ++;
            }
        }

    }

    static int[] findTarget(ArrayList<String> grid, char target) {
        int targetXY[] = new int[2];
        int rowIndex = 0;
        for (String row : grid) {
            for (int k = 0; k < grid.size(); k++) {
                if (row.charAt(k) == target) {
                    targetXY[0] = rowIndex;
                    targetXY[1] = k;
                    return targetXY;
                }
            }

            rowIndex++;
        }


        return targetXY;


    }


}
