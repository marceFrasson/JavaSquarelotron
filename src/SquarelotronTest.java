import static org.junit.Assert.*;
import org.junit.Test;

import java.util.Arrays;

public class SquarelotronTest {

    @Test
    public void testSquarelotron() {
        int[][] testArray3 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Squarelotron square3 = new Squarelotron(3);
        assertTrue(Arrays.deepEquals(square3.squarelotron, testArray3));

        int[][] testArray5 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};
        Squarelotron square5 = new Squarelotron(5);
        assertTrue(Arrays.deepEquals(square5.squarelotron, testArray5));

        int[][] testArray8 = {{1, 2, 3, 4, 5, 6, 7, 8}, {9, 10, 11, 12, 13, 14, 15, 16},
                {17, 18, 19, 20, 21, 22, 23, 24}, {25, 26, 27, 28, 29, 30, 31, 32},
                {33, 34, 35, 36, 37, 38, 39, 40}, {41, 42, 43, 44, 45, 46, 47, 48},
                {49, 50, 51, 52, 53, 54, 55, 56}, {57, 58, 59, 60, 61, 62, 63, 64}};

        Squarelotron square8 = new Squarelotron(8);
        assertTrue(Arrays.deepEquals(square8.squarelotron, testArray8));
        assertFalse(Arrays.deepEquals(square5.squarelotron, testArray8));
    }

    @Test
    public void testUpsideDownFlip() {
        int[][] testArray3 = {{7, 8, 9}, {4, 5, 6}, {1, 2, 3}};
        Squarelotron square3 = new Squarelotron(3);
        Squarelotron upsideDown3 = square3.upsideDownDownFlip(1);
        assertTrue(Arrays.deepEquals(upsideDown3.squarelotron, testArray3));

        int[][] testArray4 = {{13, 14, 15, 16}, {9, 6, 7, 12},
                {5, 10, 11, 8}, {1, 2, 3, 4}};
        Squarelotron square4 = new Squarelotron(4);
        Squarelotron upsideDown4 = square4.upsideDownDownFlip(1);
        assertTrue(Arrays.deepEquals(upsideDown4.squarelotron, testArray4));

        int[][] testArray8 = {{1, 2, 3, 4, 5, 6, 7, 8}, {9, 10, 11, 12, 13, 14, 15, 16},
                {17, 18, 43, 44, 45, 46, 23, 24}, {25, 26, 35, 28, 29, 38, 31, 32},
                {33, 34, 27, 36, 37, 30, 39, 40}, {41, 42, 19, 20, 21, 22, 47, 48},
                {49, 50, 51, 52, 53, 54, 55, 56}, {57, 58, 59, 60, 61, 62, 63, 64}};
        Squarelotron square8 = new Squarelotron(8);
        Squarelotron upsideDown8 = square8.upsideDownDownFlip(3);
        assertTrue(Arrays.deepEquals(upsideDown8.squarelotron, testArray8));
    }

    @Test
    public void testMainDiagonalFlip() {
        int[][] testArray3 = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
        Squarelotron square3 = new Squarelotron(3);
        Squarelotron diagonalFlip3 = square3.mainDiagonalFlip(1);
        assertTrue(Arrays.deepEquals(diagonalFlip3.squarelotron, testArray3));

        int[][] testArray4 = {{1, 5, 9, 13}, {2, 6, 7, 14},
                {3, 10, 11, 15}, {4, 8, 12, 16}};
        Squarelotron square4 = new Squarelotron(4);
        Squarelotron diagonalFlip4 = square4.mainDiagonalFlip(1);
        assertTrue(Arrays.deepEquals(diagonalFlip4.squarelotron, testArray4));

        int[][] testArray8 = {{1, 2, 3, 4, 5, 6, 7, 8}, {9, 10, 11, 12, 13, 14, 15, 16},
                {17, 18, 19, 27, 35, 43, 23, 24}, {25, 26, 20, 28, 29, 44, 31, 32},
                {33, 34, 21, 36, 37, 45, 39, 40}, {41, 42, 22, 30, 38, 46, 47, 48},
                {49, 50, 51, 52, 53, 54, 55, 56}, {57, 58, 59, 60, 61, 62, 63, 64}};
        Squarelotron square8 = new Squarelotron(8);
        Squarelotron diagonalFlip8 = square8.mainDiagonalFlip(3);
        assertTrue(Arrays.deepEquals(diagonalFlip8.squarelotron, testArray8));
    }

    @Test
    public void testRotateRight() {
        int[][] testArray3 = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
        Squarelotron square3 = new Squarelotron(3);
        square3.rotateRight(1);
        assertTrue(Arrays.deepEquals(square3.squarelotron, testArray3));

        int[][] testArray3_2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        Squarelotron square3_2 = new Squarelotron(3);
        square3_2.rotateRight(2);
        assertTrue(Arrays.deepEquals(square3_2.squarelotron, testArray3_2));

        int[][] testArray3_3 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        Squarelotron square3_3 = new Squarelotron(3);
        square3_3.rotateRight(-2);
        assertTrue(Arrays.deepEquals(square3_3.squarelotron, testArray3_3));

        int[][] testArray3_4 = {{3, 6, 9}, {2, 5, 8}, {1, 4, 7}};
        Squarelotron square3_4 = new Squarelotron(3);
        square3_4.rotateRight(-1);
        assertTrue(Arrays.deepEquals(square3_4.squarelotron, testArray3_4));
    }
}