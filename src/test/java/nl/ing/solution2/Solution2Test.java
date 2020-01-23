package nl.ing.solution2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution2Test {

    @Test
    public void solution2() {
        Solution solution = new Solution();

        assertEquals(5, solution.solution(new int[]{3, 4, 3, 0, 2, 2, 3, 0, 0}));
        assertEquals(3, solution.solution(new int[]{4, 4, 3, 3, 1, 0}));
        assertEquals(0, solution.solution(new int[]{4, 2, 0}));

    }

}
