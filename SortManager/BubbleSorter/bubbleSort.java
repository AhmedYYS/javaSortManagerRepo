package com.sparta.ay.SortManager.BubbleSorter;

import com.sparta.ay.SortManager.Sort;
import com.sparta.ay.logging.LogConfiguration;

import java.util.logging.Level;
import java.util.logging.Logger;

public class bubbleSort implements Sort {
    static Logger logsBubble = LogConfiguration.aLog;

    long startTime = 0;
    long endTime = 0;
    public int[] myMethod(int[] array) {
        startTime = System.nanoTime();
        bubbly(array);
        endTime = System.nanoTime();
        return array;
    }

    public static void bubbly(int[] sorting) {
            int al = sorting.length;

            for (int i = 0; i < al - 1; i++) {
                for (int x = 0; x < al - i - 1; x++) {
                    if (sorting[x + 1] < sorting[x]) {
                        int swapped = sorting[x];
                        sorting[x] = sorting[x + 1];
                        sorting[x + 1] = swapped;
                    }
                }
            }
        logsBubble.log(Level.INFO, "this should show up after Bubble has been sorted");
        }

    @Override
    public long timeToSort() { return endTime - startTime; }

        public static void main(String args[]) {
            int[] arr = {50, 9, 230, 85, 120, 32, 18};
            int al = arr.length;
            bubbly(arr);

            for (int i = 0; i < al; i++) {
                System.out.print(arr[i] + " ");
                System.out.println();
            }
        }
 }