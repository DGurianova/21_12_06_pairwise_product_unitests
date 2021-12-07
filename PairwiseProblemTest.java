import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.omg.CORBA.portable.ApplicationException;

import java.awt.*;
import java.util.Random;

class PairwiseProblemTest {
    PairwiseProblem pp = new PairwiseProblem();

    @Test

    public void testSolve_twoElements1and2_2() {
        int[] array = {1, 2};

        assertEquals(2, pp.solve(array));
    }

    @Test

    public void testSolve_threeElements() {
        int[] array = {1, 10, 2};

        assertEquals(20, pp.solve(array));
    }

    @Test

    public void testSolve_twoLargeElements() {
        int[] array = {100000, 100000};

        assertEquals(10000000000L, pp.solve(array));
    }

    @Test

    public void testSolve_twoNumbersWithZero() {
        int[] array = {0, 100000};

        assertEquals(0, pp.solve(array));
    }

    @Test
    public void testSolve_performanceTest() {
        int[] array = new int[100000];
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(Integer.MAX_VALUE);
        }
        long currentTime = System.currentTimeMillis();
        pp.solve(array);
        System.out.println(System.currentTimeMillis() - currentTime);

    }

    @Test
    public void testSolveTwo_nullArray() {
        int[] array = new int[]{0, 0, 0, 0};
        assertEquals(0, pp.solveTwo(array));
    }

    @Test
    public void testSolveTwo_oneNumberArray() {
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            int[] array = new int[]{1}; //int[] array = new int[]{};
            pp.solveTwo(array);
        });
        assertEquals("The argument is wrong, must be length 2 and more", thrown.getMessage());
    }

    @Test
    public void testSolveTwo_TwoNumbersWithZero() {
        int[] array = new int[]{0, 100000};
        assertEquals(0, pp.solveTwo(array));
    }

    @Test
    public void testSolveTwo_HappyCase() {
        int[] array = new int[]{9, 8, 100000, 12};
        assertEquals(1200000, pp.solveTwo(array));
    }

    @Test
    public void testSolveTwo_max_Value() {
        int[] array = new int[100000];
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(Integer.MAX_VALUE);
        }
        long currentTime = System.currentTimeMillis();
        pp.solve(array);
        System.out.println(System.currentTimeMillis() - currentTime);
    }
}