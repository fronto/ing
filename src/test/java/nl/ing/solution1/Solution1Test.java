package nl.ing.solution1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution1Test {

    @Test
    public void solution1() {

        Solution solution = new Solution();

        assertEquals(2,solution.solution(new int[] {1,2,3}));
        assertEquals(2,solution.solution(new int[] {1,1,6}));
        assertEquals(3,solution.solution(new int[] {1,6,2,3}));

    }

}
