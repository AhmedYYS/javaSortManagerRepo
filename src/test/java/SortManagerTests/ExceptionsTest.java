package SortManagerTests;

import com.sparta.ay.SortManagerMain.Exceptions.ChildNotFoundException;
import com.sparta.ay.SortManagerMain.Exceptions.GenerateNewArrayException;
import com.sparta.ay.SortManagerMain.Exceptions.SortManagerException;
import com.sparta.ay.SortManagerMain.SortManager;
import com.sparta.ay.SortManagerMain.binaryTree.BinaryTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ExceptionsTest {

    @Test
    @DisplayName("check ChildNotFoundException has been thrown")
    void checkChildNotFoundExceptionThrown() {
        BinaryTree tree = new BinaryTree(50);

        Assertions.assertThrows(ChildNotFoundException.class, () -> {
            tree.getRightChild(50);
        });
    }

    @Test
    @DisplayName("check ChildNotFoundException has not been thrown")
    void checkChildNotFoundExceptionNotThrown() {
        BinaryTree tree = new BinaryTree(50);
        tree.addElement(75);

        Assertions.assertDoesNotThrow(() -> {
            tree.getRightChild(50);
        });
    }

    @Test
    @DisplayName("check GenerateNewArrayException has been thrown")
    void checkGenerateNewArrayExceptionHasBeenThrown() {

        Assertions.assertThrows(GenerateNewArrayException.class, () -> {
            SortManager.generateRandomArray(6000);
        });
    }

    @Test
    @DisplayName("check GenerateNewArrayException has Not been thrown")
    void checkGenerateNewArrayExceptionHasNotBeenThrown() {

        Assertions.assertDoesNotThrow(() -> {
            SortManager.generateRandomArray(50);
        });
    }

    @Test
    @DisplayName("check SortManagerException has been thrown")
    void checkSortManagerExceptionHasBeenThrown() {

        Assertions.assertThrows(SortManagerException.class, () -> {
            SortManager.sorterManager(7);
        });
    }

    @Test
    @DisplayName("check SortManagerException has Not been thrown")
    void checkSortManagerExceptionHasBeenNotThrown() {

        Assertions.assertDoesNotThrow(() -> {
            SortManager.sorterManager(1);
        });
    }
}
