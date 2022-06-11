package SortManagerTests;

import com.sparta.ay.SortManagerMain.InsertionSort.InsertionSorter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class InsertionSortTest {

    @Test
    @DisplayName("check that it returns an array")
    void checkArray() {
        int[] actual = {50, 85, 75, 12, 13, 21, 1};
        int[] expected = {1, 12, 13, 21, 50, 75, 85};

        InsertionSorter.sortInsert(actual);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("check that it returns a sorted array")
    void checkArraySorted() {
        int[] actual = {50, 85, 75, 12, 13, 21, 1};
        int[] expected = {1, 12, 13, 21, 50, 75, 85};

        InsertionSorter.sortInsert(actual);
        Assertions.assertArrayEquals(expected, actual);
    }
}
