package nl.ing.solution2;
// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

/*
agreed to submit solution on github
*/

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] ranks) {
        // write your code in Java SE 8

        Map<Integer, Integer> rankCount = new HashMap<>();

        for(int i : ranks) {
            int currentCount = rankCount.getOrDefault(i, 0);
            rankCount.put(i, currentCount + 1);
        }

        int[] sortedRanks = rankCount.keySet().stream().sorted().mapToInt(Integer::intValue).toArray();

        if(sortedRanks.length < 2) {
            return 0;
        }

        int numberOfReports = 0;

        for(int i = 1; i < sortedRanks.length; i++)  {
            if(sortedRanks[i] - sortedRanks[i-1] == 1) {
                numberOfReports += rankCount.get(sortedRanks[i-1]);
            }
        }


        return numberOfReports;
    }
}
