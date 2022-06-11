package com.sparta.ayy.logging;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;

public class LogConfiguration {
    public static final Logger aLog = Logger.getLogger("my logger");
    public static void logConfig() {
        try {
            Handler fileHandler = new FileHandler("src/main/java/com/sparta/ay/logging/SortManager.log", true);
            aLog.addHandler(fileHandler);
            fileHandler.setFormatter(new CustomFormatter());
        } catch (IOException val) {
            throw new RuntimeException(val);
        }
    }

}
