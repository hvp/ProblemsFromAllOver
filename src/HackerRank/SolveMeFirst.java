package HackerRank;

import java.io.*;
import java.util.*;

/**
 * Created by User on 01/02/2015.
 */
public class SolveMeFirst {


    public static void main(String[] args) {
        int x;
        int y;
        PrintWriter out;


        x = Integer.parseInt(args[0]);
        y = Integer.parseInt(args[1]);


        out = new PrintWriter(new OutputStreamWriter(System.out));

    }


    static int solveMeFirst(int x, int y) {
        return x * y;
    }

}

