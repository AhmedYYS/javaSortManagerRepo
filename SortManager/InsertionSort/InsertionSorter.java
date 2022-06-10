package com.sparta.ay.SortManager.InsertionSort;

import com.sparta.ay.SortManager.Sort;
import com.sparta.ay.logging.LogConfiguration;

import java.util.logging.Level;
import java.util.logging.Logger;

public class InsertionSorter implements Sort {

    static Logger logsInsertion = LogConfiguration.aLog;
    long startTime = 0;
    long endTime = 0;

    public int[] myMethod(int[] array){
        startTime = System.nanoTime();
        sortInsert(array);
        endTime = System.nanoTime();

        return array;
    }

    public static void sortInsert(int [] array) {

        for (int i = 0; i < array.length; i++) {
            int j = i;

            while (j > 0 && array[j-1] > array[j]) {

                int x = array[j];
                array[j] = array[j-1];
                array[j-1] = x;
                j=j-1;
            }
        }
        logsInsertion.log(Level.INFO, "this should show up after Insertion has been sorted");
    }

    @Override
    public long timeToSort() { return endTime - startTime;}

//    public static void main(String[] args) {
//        int [] arr = {5, 55, 14, 78, 62, 2};
//        sortInsert(arr);
//
//        System.out.println(Arrays.toString(arr));
//    }

}
