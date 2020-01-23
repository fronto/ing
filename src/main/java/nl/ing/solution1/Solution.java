package nl.ing.solution1;

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
/*
Agreed to submit solution on github
*/

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8

        //for each side facing upwards, check the number of turns of other die required to get them to the same value
        int minSoFar = Integer.MAX_VALUE;
        for(int face : A) {
            int totalTurns = 0;
            for(int other : A) {
                //if the values are not the same, or the die are not the same we need to turn one
                if(face != other) {
                    if (face + other == 7) {//if the die have opposing values two turns are required
                        totalTurns += 2;
                    } else {//if the the die have adjacent values one turn is required
                        totalTurns += 1;
                    }
                }
            }
            minSoFar = Math.min(minSoFar, totalTurns);
        }
        return minSoFar;
    }
}


