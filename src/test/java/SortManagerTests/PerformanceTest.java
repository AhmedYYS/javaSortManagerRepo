package SortManagerTests;

import com.sparta.ay.SortManagerMain.BubbleSorter.bubbleSort;
import com.sparta.ay.SortManagerMain.Exceptions.GenerateNewArrayException;
import com.sparta.ay.SortManagerMain.InsertionSort.InsertionSorter;
import com.sparta.ay.SortManagerMain.SortManager;
import com.sparta.ay.SortManagerMain.binaryTree.BinaryTree;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class PerformanceTest {

    int [] arr50; //to compare against each sorter

    {
        try {
            arr50 = SortManager.generateRandomArray(50);
        } catch (GenerateNewArrayException e) {
            throw new RuntimeException(e);
        }
    }

    int [] uArr50 = arr50; //to compare against each sorter

    int [] arr100;

    {
        try {
            arr100 = SortManager.generateRandomArray(100);
        } catch (GenerateNewArrayException e) {
            throw new RuntimeException(e);
        }
    }

    int [] uArr100 = arr100;

    int [] arr200;

    {
        try {
            arr200 = SortManager.generateRandomArray(200);
        } catch (GenerateNewArrayException e) {
            throw new RuntimeException(e);
        }
    }

    int [] uArr200 = arr200;

    int [] arr1000;

    {
        try {
            arr1000 = SortManager.generateRandomArray(1000);
        } catch (GenerateNewArrayException e) {
            throw new RuntimeException(e);
        }
    }

    int [] uArr1000 = arr1000;

    @Test
    @DisplayName("test InsertionSort with 50 size array")
    void checkInsert50() {

        long start = System.nanoTime();
        InsertionSorter.sortInsert(arr50);
        long end = System.nanoTime();
        long time = end - start;

        System.out.println("testing Insertion sort with 50 elements \n" +
                "Unsorted Array: " + " " + Arrays.toString(uArr50) + "\n" +
                "Sorted Array: " + " " + Arrays.toString(arr50) + "\n" +
                "Time Taken to sort: " + " " + time + " " + "nano seconds" +
                "\n ---------------------------- END ----------------------------"
                );

    }

    @Test
    @DisplayName("test BubbleSort with 50 size array")
    void checkBubble50() {

        long start = System.nanoTime();
        bubbleSort.bubbly(arr50);
        long end = System.nanoTime();
        long time = end - start;

        System.out.println("testing Bubble sort with 50 elements \n" +
                "Unsorted Array: " + " " + Arrays.toString(uArr50) + "\n" +
                "Sorted Array: " + " " + Arrays.toString(arr50) + "\n" +
                "Time Taken to sort: " + " " + time + " " + "nano seconds" +
                "\n ---------------------------- END ----------------------------"
        );

    }

    @Test
    @DisplayName("test BinarySort with 50 size array")
    void checkBinary50() {
        BinaryTree tree = new BinaryTree(50);
        tree.addElements(arr50);

        long start = System.nanoTime();
        int [] binary50 = tree.getSortedTreeAsc();
        long end = System.nanoTime();
        long time = end - start;

        System.out.println("testing Binary sort with 50 elements \n" +
                "Unsorted Array: " + " " + Arrays.toString(uArr50) + "\n" +
                "Sorted Array: " + " " + Arrays.toString(binary50) + "\n" +
                "Time Taken to sort: " + " " + time + " " + "nano seconds" +
                "\n ---------------------------- END ----------------------------"
        );

    }

    @Test
    @DisplayName("test InsertionSort with 100 size array")
    void checkInsert100() {

        long start = System.nanoTime();
        InsertionSorter.sortInsert(arr100);
        long end = System.nanoTime();
        long time = end - start;

        System.out.println("testing Insertion sort with 100 elements \n" +
                "Unsorted Array: " + " " + Arrays.toString(uArr100) + "\n" +
                "Sorted Array: " + " " + Arrays.toString(arr100) + "\n" +
                "Time Taken to sort: " + " " + time + " " + "nano seconds" +
                "\n ---------------------------- END ----------------------------"
        );

    }

    @Test
    @DisplayName("test BubbleSort with 100 size array")
    void checkBubble100() {

        long start = System.nanoTime();
        bubbleSort.bubbly(arr100);
        long end = System.nanoTime();
        long time = end - start;

        System.out.println("testing Bubble sort with 100 elements \n" +
                "Unsorted Array: " + " " + Arrays.toString(uArr100) + "\n" +
                "Sorted Array: " + " " + Arrays.toString(arr100) + "\n" +
                "Time Taken to sort: " + " " + time + " " + "nano seconds" +
                "\n ---------------------------- END ----------------------------"
        );

    }

    @Test
    @DisplayName("test BinarySort with 100 size array")
    void checkBinary100() {
        BinaryTree tree = new BinaryTree(50);
        tree.addElements(arr100);

        long start = System.nanoTime();
        int [] binary100 = tree.getSortedTreeAsc();
        long end = System.nanoTime();
        long time = end - start;

        System.out.println("testing Binary sort with 100 elements \n" +
                "Unsorted Array: " + " " + Arrays.toString(uArr100) + "\n" +
                "Sorted Array: " + " " + Arrays.toString(binary100) + "\n" +
                "Time Taken to sort: " + " " + time + " " + "nano seconds" +
                "\n ---------------------------- END ----------------------------"
        );

    }

    @Test
    @DisplayName("test InsertionSort with 200 size array")
    void checkInsert200() {

        long start = System.nanoTime();
        InsertionSorter.sortInsert(arr200);
        long end = System.nanoTime();
        long time = end - start;

        System.out.println("testing Insertion sort with 200 elements \n" +
                "Unsorted Array: " + " " + Arrays.toString(uArr200) + "\n" +
                "Sorted Array: " + " " + Arrays.toString(arr200) + "\n" +
                "Time Taken to sort: " + " " + time + " " + "nano seconds" +
                "\n ---------------------------- END ----------------------------"
        );

    }

    @Test
    @DisplayName("test BubbleSort with 200 size array")
    void checkBubble200() {

        long start = System.nanoTime();
        bubbleSort.bubbly(arr200);
        long end = System.nanoTime();
        long time = end - start;

        System.out.println("testing Bubble sort with 200 elements \n" +
                "Unsorted Array: " + " " + Arrays.toString(uArr200) + "\n" +
                "Sorted Array: " + " " + Arrays.toString(arr200) + "\n" +
                "Time Taken to sort: " + " " + time + " " + "nano seconds" +
                "\n ---------------------------- END ----------------------------"
        );

    }

    @Test
    @DisplayName("test BinarySort with 200 size array")
    void checkBinary200() {
        BinaryTree tree = new BinaryTree(50);
        tree.addElements(arr100);

        long start = System.nanoTime();
        int [] binary200 = tree.getSortedTreeAsc();
        long end = System.nanoTime();
        long time = end - start;

        System.out.println("testing Binary sort with 200 elements \n" +
                "Unsorted Array: " + " " + Arrays.toString(uArr200) + "\n" +
                "Sorted Array: " + " " + Arrays.toString(binary200) + "\n" +
                "Time Taken to sort: " + " " + time + " " + "nano seconds" +
                "\n ---------------------------- END ----------------------------"
        );

    }

    @Test
    @DisplayName("test InsertionSort with 1000 size array")
    void checkInsert1000() {

        long start = System.nanoTime();
        InsertionSorter.sortInsert(arr1000);
        long end = System.nanoTime();
        long time = end - start;

        System.out.println("testing Insertion sort with 1000 elements \n" +
                "Unsorted Array: " + " " + Arrays.toString(uArr1000) + "\n" +
                "Sorted Array: " + " " + Arrays.toString(arr1000) + "\n" +
                "Time Taken to sort: " + " " + time + " " + "nano seconds" +
                "\n ---------------------------- END ----------------------------"
        );

    }

    @Test
    @DisplayName("test BubbleSort with 1000 size array")
    void checkBubble1000() {

        long start = System.nanoTime();
        bubbleSort.bubbly(arr1000);
        long end = System.nanoTime();
        long time = end - start;

        System.out.println("testing Bubble sort with 1000 elements \n" +
                "Unsorted Array: " + " " + Arrays.toString(uArr1000) + "\n" +
                "Sorted Array: " + " " + Arrays.toString(arr1000) + "\n" +
                "Time Taken to sort: " + " " + time + " " + "nano seconds" +
                "\n ---------------------------- END ----------------------------"
        );

    }

    @Test
    @DisplayName("test BinarySort with 1000 size array")
    void checkBinary1000() {
        BinaryTree tree = new BinaryTree(50);
        tree.addElements(arr1000);

        long start = System.nanoTime();
        int [] binary1000 = tree.getSortedTreeAsc();
        long end = System.nanoTime();
        long time = end - start;

        System.out.println("testing Binary sort with 1000 elements \n" +
                "Unsorted Array: " + " " + Arrays.toString(uArr200) + "\n" +
                "Sorted Array: " + " " + Arrays.toString(binary1000) + "\n" +
                "Time Taken to sort: " + " " + time + " " + "nano seconds" +
                "\n ---------------------------- END ----------------------------"
        );

    }
}
