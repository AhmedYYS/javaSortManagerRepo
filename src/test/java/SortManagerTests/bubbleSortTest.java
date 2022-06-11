package SortManagerTests;

import com.sparta.ay.SortManagerMain.BubbleSorter.bubbleSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class bubbleSortTest {

    @Test
    @DisplayName("check that it returns an array")
    void checkArray() {
        int[] actual = {52, 69, 87, 14, 22, 2, 1};
        int[] expected = {1, 2, 14, 22, 52, 69, 87};

        bubbleSort.bubbly(actual);
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    @DisplayName("check that it returns an sorted array")
    void checkArraySort() {
        int[] actual = {100, 82, 1, 6, 77, 25, 22, 14};
        int[] expected = {1, 6, 14, 22, 25, 77, 82, 100};

        bubbleSort.bubbly(actual);
        Assertions.assertArrayEquals(expected, actual);
    }

}
