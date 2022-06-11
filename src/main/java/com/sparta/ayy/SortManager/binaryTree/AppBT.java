package com.sparta.ayy.SortManager.binaryTree;

import com.sparta.ayy.logging.LogConfiguration;
import com.sparta.ayy.SortManager.Exceptions.ChildNotFoundException;

import java.util.Arrays;

public class AppBT {
    public static void main(String[] args) {
        LogConfiguration.logConfig();
        BinaryTree tree = new BinaryTree(30);

        int [] numbers = {7, 8, 25, 105, 66, 99, 5, 4, 55, 61};


        tree.addElement(22);
        tree.addElement(32);
        tree.addElement(2);
        tree.addElement(3);
        tree.addElement(566);
        tree.addElement(3);
        tree.addElements(numbers);

        System.out.println(tree.findElement(99));
        System.out.println(tree.getRootElement());
        System.out.println(tree.getNumberOfElements());
        System.out.println(Arrays.toString(tree.getSortedTreeAsc()));
        System.out.println(Arrays.toString(tree.getSortedTreeDesc()));

        try {
            System.out.println(tree.getRightChild(2));
        } catch (ChildNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            System.out.println(tree.getLeftChild(3));
        } catch (ChildNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
