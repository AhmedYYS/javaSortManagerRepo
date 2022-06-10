package com.sparta.ay.SortManager;

import com.sparta.ay.logging.LogConfiguration;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DisplayManager {

    //printing place, call it a printer
    static Logger logsDisplay = LogConfiguration.aLog;

    public static void showSortChoice() {
        System.out.println("Choose a algorithm to sort, by picking corresponding numbers: \n" +
                "1: Binary Sort \n" +
                "2: Bubble Sort \n" +
                "3: Insertion Sort");
    }

    public static void showArrayChoice() {
        System.out.println("Choose a number for the size of the random array \n");
        logsDisplay.log(Level.INFO, "this should show up after array size chosen");
    }


    public static void showPrint(Sort sort, int [] array) {
//        System.out.println("Array Unsorted:" + Arrays.toString(array));
//        System.out.println("");

        System.out.println("--------- Your Returns ---------\n" +
                "\n Array Unsorted: \n" + Arrays.toString(array) + "\n" +
                "\n Array Sorted: \n" + Arrays.toString(sort.myMethod(array)) + "\n" +
                "\n Time it took to sort: " + sort.timeToSort() + " " + "nano seconds"

        );
    }

}
