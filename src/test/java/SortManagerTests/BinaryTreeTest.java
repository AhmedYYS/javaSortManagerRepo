package SortManagerTests;

import com.sparta.ay.SortManagerMain.BubbleSorter.bubbleSort;
import com.sparta.ay.SortManagerMain.Exceptions.ChildNotFoundException;
import com.sparta.ay.SortManagerMain.binaryTree.BinaryTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BinaryTreeTest {

    @Test
    @DisplayName("check that it adds an int via counting nodes")
    void checkAddInt() {

        BinaryTree tree = new BinaryTree(50);
        tree.addElement(5);

        Assertions.assertEquals(2, tree.getNumberOfElements());
    }

    @Test
    @DisplayName("check that it adds an multiple ints")
    void checkAddsMultipleInts(){
        BinaryTree tree = new BinaryTree(50);

        int [] elements = {7, 55, 78, 44, 25, 14, 96, 47, 76};
        tree.addElements(elements);

        Assertions.assertEquals(10, tree.getNumberOfElements());
    }

    @Test
    @DisplayName("check to find certain values are in the tree")
    void checkToFindValue() {
        BinaryTree tree = new BinaryTree(50);
        int [] elements = {7, 55, 78, 44, 25, 14, 96, 47, 76};
        tree.addElements(elements);

        Assertions.assertEquals(true, tree.findElement(55));
    }

    @Test
    @DisplayName("check to find root value in the tree")
    void checkToFindRootValue(){
        BinaryTree tree = new BinaryTree(50);
        int [] elements = {7, 55, 78, 44, 25, 14, 96, 47, 76};
        tree.addElements(elements);

        Assertions.assertEquals(true, tree.findElement(50));
    }

    @Test
    @DisplayName("check to see sorted array asc")
    void checkToSortArrayAsc(){
        BinaryTree tree = new BinaryTree(50);
        int [] elements = {7, 55, 78, 44, 25, 14, 96, 47, 76};
        tree.addElements(elements);
        int [] expected = {7, 14, 25, 44, 47, 55, 76, 78, 96};

        bubbleSort.bubbly(elements);
        Assertions.assertArrayEquals(expected, elements);
    }

    @Test
    @DisplayName("check to see if rightChild exists")
    void checkRightChild() throws ChildNotFoundException {
        BinaryTree tree = new BinaryTree(50);
        int [] elements = {7, 55, 78, 44, 25, 14, 96, 47, 76};
        tree.addElements(elements);

        Assertions.assertEquals(78, tree.getRightChild(55));
    }

    @Test
    @DisplayName("check to see if left child exists")
    void checkLeftChild() throws ChildNotFoundException {
        BinaryTree tree = new BinaryTree(50);
        int [] elements = {7, 55, 78, 44, 25, 14, 96, 47, 76};
        tree.addElements(elements);

        Assertions.assertEquals(25, tree.getLeftChild(44));
    }
}
