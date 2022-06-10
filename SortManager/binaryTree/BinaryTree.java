package com.sparta.ay.SortManager.binaryTree;

import com.sparta.ay.SortManager.Exceptions.ChildNotFoundException;
import com.sparta.ay.logging.LogConfiguration;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BinaryTree implements BinaryTreeInterface{

    Logger logsBinary = LogConfiguration.aLog;

    private final Node rootNode;

    public BinaryTree(final int value) {
        rootNode = new Node(value);
    }

    public void addElement(final int value) {
        addNode(rootNode, value);
    }

    public boolean findElement(final int value) {
        Node node = findNode(value);
        return node != null;
    }

    public int getRootElement() {
        return rootNode.getValue();
    }

    public int getNumberOfElements() {
        return countNodeChild;
    }

    public void addElements(final int[] elements){

        for (int i: elements) {
            addElement(i);
        }
    }

    public int[] getSortedTreeAsc() {
        int [] sortedArr = addToArray();
        Arrays.sort(sortedArr);
        x = 0;
        logsBinary.log(Level.INFO, "this should show up after Binary has been sorted");
        return sortedArr;
    }



    public int[] getSortedTreeDesc() {

        return reverseArr(addToArray());
    }

    public static int[] reverseArr(int[] reversedArr) {
        int al = reversedArr.length;

        for (int i = 0; i < al - 1; i++) {
            for (int x = 0; x < al - i - 1; x++) {
                if (reversedArr[x + 1] > reversedArr[x]) {
                    int swapped = reversedArr[x];
                    reversedArr[x] = reversedArr[x + 1];
                    reversedArr[x + 1] = swapped;
                }
            }
        }
        return reversedArr;
    }



    public int getRightChild(int element) throws ChildNotFoundException {

        if (findElement(element)) {
            Node node = findNode(element);
            if (!node.isRightChildEmpty()) {
               node = node.getRightChild();
                return node.getValue();
            }
            throw new ChildNotFoundException("right child does not exist");
        } else {
            throw new ChildNotFoundException("right child does not exist");
        }
    }

    public int getLeftChild(int element) throws ChildNotFoundException {
        if (findElement(element)) {
            Node node = findNode(element);
            if (!node.isLeftChildEmpty()) {
                node = node.getLeftChild();
                return node.getValue();
            }
            throw new ChildNotFoundException("left child does not exist");
        } else {
            throw new ChildNotFoundException("left child does not exist");
        }
    }





    int countNodeChild = 1;

    private void addNode(Node node, int value) {
        if (value <= node.getValue()) {
            if(node.isLeftChildEmpty()) {
                Node leftChild = new Node (value);
                node.setLeftChild(leftChild);
                countNodeChild += 1;
            } else {
                addNode(node.getLeftChild(), value);
            }
        } else if (value > node.getValue()) {
            if(node.isRightChildEmpty()) {
                Node rightChild = new Node (value);
                node.setRightChild(rightChild);
                countNodeChild += 1;
            } else {
                addNode(node.getRightChild(), value);
            }
        }
    }

    private Node findNode(final int value) {
        Node node = rootNode;

        while (node != null) {
            if (value == node.getValue()) {
                return node;
            }
            if (value < node.getValue()) {
                node = node.getLeftChild();
            } else {
                node = node.getRightChild();
            }
        }
        return null;
    }


    public int[] addToArray() {
        int [] arr = new int[countNodeChild];

        recurArr(rootNode, arr);

        return arr;
    };

    int x = 0;
    private void recurArr(Node node, int []arr) {

        if (node != null) {
            recurArr(node.getLeftChild(), arr);
            recurArr(node.getRightChild(), arr);
            arr[x] = node.getValue();
            x += 1;
        }

    }

}