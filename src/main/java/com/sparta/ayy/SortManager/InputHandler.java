package com.sparta.ayy.SortManager;

import com.sparta.ayy.SortManager.Exceptions.GenerateNewArrayException;
import com.sparta.ayy.SortManager.Exceptions.SortManagerException;
import com.sparta.ayy.logging.LogConfiguration;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InputHandler {

    static Logger logsInput = LogConfiguration.aLog;

    //handles inputs of users, maybe output lmao
    static Scanner scanner = new Scanner(System.in);

    public static void startPage() {

        System.out.println("Press any number except 9, and ENTER to continue program - Enter 9 to exit program");
        int startProgram = scanner.nextInt();

        while (startProgram != 9) {
            logsInput.log(Level.INFO, "this should show up after number added");
            try {
                DisplayManager.showSortChoice();
                int sortChoice = scanner.nextInt();

                Sort sort = SortManager.sorterManager(sortChoice);

                DisplayManager.showArrayChoice();
                int arrayChoice = scanner.nextInt();

                int [] arrayToSort = SortManager.generateRandomArray(arrayChoice);

                DisplayManager.showPrint(sort, arrayToSort);

            } catch (SortManagerException e) {
                throw new RuntimeException(e);
            } catch (GenerateNewArrayException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Press any number except 9, and ENTER to continue program - Enter 9 to exit program");
            startProgram = scanner.nextInt();
        }

    }

}
