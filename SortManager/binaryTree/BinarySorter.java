package com.sparta.ay.SortManager.binaryTree;

import com.sparta.ay.SortManager.Sort;

public class BinarySorter implements Sort {
    long startTime = 0;
    long endTime = 0;

    @Override
    public int[] myMethod(int[] array) {
        BinaryTree tree = new BinaryTree(array[0]);
        startTime = System.nanoTime();
        for (int i = 1; i <array.length; i++) {
            tree.addElement(array[i]);
        }
        endTime = System.nanoTime();
        return tree.getSortedTreeAsc();
    }

    @Override
    public long timeToSort() { return endTime - startTime;}

}
