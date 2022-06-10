package com.sparta.ay.SortManager;


import com.sparta.ay.SortManager.BubbleSorter.bubbleSort;
import com.sparta.ay.SortManager.Exceptions.GenerateNewArrayException;
import com.sparta.ay.SortManager.Exceptions.SortManagerException;
import com.sparta.ay.SortManager.InsertionSort.InsertionSorter;
import com.sparta.ay.SortManager.binaryTree.BinarySorter;
import com.sparta.ay.logging.LogConfiguration;

import java.util.logging.Logger;

public class SortManager {

    static Logger logsSort = LogConfiguration.aLog;
    public static Sort sorterManager(int choice) throws SortManagerException {

        switch (choice) {
            //logsSort.log(Level.INFO, "this is an information message");
            case 1:
                return new BinarySorter();
            case 2:
                return new bubbleSort();

            case 3:
                return new InsertionSorter();

            default:
                throw new SortManagerException("Choice not recognized please pick numbers 1 to 3");

        }
    }

    public static int[] generateRandomArray(int choice2) throws GenerateNewArrayException {

        int [] arr = new int[choice2];

        for(int i = 0; i < arr.length; i++) {
            if (choice2 <= 5000) {
                arr[i] = 1 + (int) (Math.random() * ((1000 - 1) + 1));
            } else {
                throw new GenerateNewArrayException("Please enter a number below 5000 when choosing array size");
            }
        }
        return arr;
    }

}
